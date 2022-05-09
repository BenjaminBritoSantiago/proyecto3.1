/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ipc1.proyecto2.controladorDamas;

import com.ipc1.proyecto2.Usuarios;
import com.ipc1.proyecto2.graficos.CronometroDamas;
import com.ipc1.proyecto2.graficos.MenuJuegos;
import com.ipc1.proyecto2.graficos.TableroDamas2;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author minch
 */
public class ControladorDamas extends Thread implements ActionListener {

    private Usuarios usuario;
    private Cuadricula[] cuadros2 = new Cuadricula[32];

    private Ficha[] fichas1 = new Ficha[12];
    private Ficha[] fichas2 = new Ficha[12];
    private Ficha[] fichastmp;

    private int NumFichasClico = -1;
    private int NumCuadroClico = -1;

    private boolean turno1 = true;

    private TableroDamas2 tablero;
    private CronometroDamas crnmt;
    private MenuJuegos menuJuegos;

    public ControladorDamas(TableroDamas2 tablero, CronometroDamas crnmt, MenuJuegos menuJuegos, Usuarios usuario) {
        this.usuario = usuario;
        this.crnmt = crnmt;
        this.menuJuegos = menuJuegos;
        this.tablero = tablero;

        if (usuario.getGuardoDamas()) {
            this.turno1 = usuario.getTurno1();
            asignarFichas();
            colocarTablero();
            fondo();
        } else {
            instanciador();
        }

    }

    public void asignarFichas() {
        this.fichas1 = usuario.getFichas1();
        this.fichas2 = usuario.getFichas2();
        this.cuadros2 = usuario.getTablero();
        colocar();

    }

    public void colocar() {
        for (int i = 0; i < 12; i++) {
            tablero.add(fichas1[i].getFicha());
            fichas1[i].getFicha().addActionListener(this);

            tablero.add(fichas2[i].getFicha());
            fichas2[i].getFicha().addActionListener(this);
        }
    }

    public void colocarTablero() {
        cuadros2 = usuario.getTablero();
        for (int i = 0; i < 32; i++) {
            tablero.add(cuadros2[i].getCuadro());
            cuadros2[i].getCuadro().setVisible(true);
            cuadros2[i].getCuadro().addActionListener(this);
        }
    }

    public void fondo() {
        /**
         * SE INSERTA la tabla de fondo
         */
        JLabel tableroP = new JLabel();
        tableroP.setBounds(250, 80, 480, 480);
        tableroP.setOpaque(true);
        tableroP.setBackground(Color.lightGray);
        tableroP.setVisible(true);
        tablero.add(tableroP);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object queBoton = e.getSource();
        /**
         * for (int y = 0; y < 8; y++) { for (int x = 0; x < 8; x++) {
         *
         * if (queBoton == cuadros[x][y].getCuadro()) { System.out.println("
         * CUADRO EN posX:" + x + " posY:" + y); break; } } }
         */
        /**
         * DETECTOR DE CUADRO CLICLADO
         */
        for (int y = 0; y < 32; y++) {
            if (queBoton == cuadros2[y].getCuadro()) {
                System.out.println(" CUADRO EN  no:" + cuadros2[y].getNumero() + "num fichaOcupa "
                        + cuadros2[y].getIdFichaOcupando());
                NumCuadroClico = y;

                if (!cuadros2[y].getOcupado() && condicionesValidas()) {
                    MovPosible();
                }

                break;
            }
        }
        if (!continuaJuego(fichas1, fichas2)) {
            tablero.setTerminar(true);
            if (hayDamas(fichas1)) {
                desHabilitarFichas(fichas1);
                ventanaTermino("ROJO");
                usuario.setPartidasGanoDamas();
                
            } else {
                desHabilitarFichas(fichas2);
                ventanaTermino("BLANCO");
                usuario.setPartidasPerdioDamas();
            }
        }

        /**
         * DETECTOR DE FICHA 1 CLICLADO
         */
        for (int i = 0; i < 12; i++) {
            if (turno1 && queBoton == fichas1[i].getFicha()) {
                System.out.println("NO FICHA1  + " + i);
                NumFichasClico = i;
                break;
            }

        }

        /**
         * DETECTOR DE FICHA 2 CLICLADO
         */
        for (int i = 0; i < 12; i++) {
            if (!turno1 && queBoton == fichas2[i].getFicha()) {
                System.out.println("NO FICHA2  + " + i);
                NumFichasClico = i;
                break;
            }

        }

    }

    public void instanciador() {
        // instaciador del fichas1.
        for (int i = 0; i < 12; i++) {
            fichas1[i] = new Ficha(i, 1);
            fichas1[i].getFicha().setVisible(true);
            tablero.add(fichas1[i].getFicha());
            fichas1[i].getFicha().addActionListener(this);
        }
        int contador = 0;

        for (int y = 5; y < 8; y++) {
            for (int x = 0; x < 8; x++) {
                if ((x % 2 != 0 && y % 2 == 0) || (x % 2 == 0 && y % 2 != 0)) {
                    fichas1[contador].getFicha().setLocation(250 + (x * 60), 80 + (y * 60));
                    ++contador;
                    if (contador == 12) {
                        break;
                    }
                }
            }
        }

        // instaciador del fichas2.
        for (int i = 0; i < 12; i++) {
            fichas2[i] = new Ficha(i, 2);
            fichas2[i].getFicha().setVisible(true);
            tablero.add(fichas2[i].getFicha());
            fichas2[i].getFicha().addActionListener(this);
        }
        contador = 0;

        for (int y = 0; y < 3; y++) {
            for (int x = 0; x < 8; x++) {
                if ((x % 2 != 0 && y % 2 == 0) || (x % 2 == 0 && y % 2 != 0)) {
                    fichas2[contador].getFicha().setLocation(250 + (x * 60), 80 + (y * 60));
                    ++contador;
                    if (contador == 12) {
                        break;
                    }
                }
            }
        }

        // instaciador del tablero
        ImageIcon imgs = new ImageIcon(
                "C:\\Users\\minch\\Documents\\proyecto3.1\\src\\main\\java\\com\\ipc1\\proyecto2\\imagenes\\fondoNegro.jpg");
        /**
         * for (int y = 0; y < 8; y++) { for (int x = 0; x < 8; x++) {
         * cuadros[x][y] = new Cuadricula();
         * cuadros[x][y].getCuadro().setLocation(250 + (x * 60), 80 + (y * 60));
         * cuadros[x][y].getCuadro().setVisible(true);
         * tablero.add(cuadros[x][y].getCuadro());
         * cuadros[x][y].getCuadro().addActionListener(this);
         *
         * cuadros[x][y].getCuadro().setOpaque(true);
         * cuadros[x][y].getCuadro().setContentAreaFilled(false); if ((x % 2 ==
         * 0 && y % 2 == 0) || (x % 2 != 0 && y % 2 != 0)) {
         * cuadros[x][y].getCuadro().setIcon(imgs); } } }
         */

        for (int i = 0; i < 32; i++) {
            cuadros2[i] = new Cuadricula(i);
            tablero.add(cuadros2[i].getCuadro());
            cuadros2[i].getCuadro().setVisible(true);
            cuadros2[i].getCuadro().setOpaque(true);
            cuadros2[i].getCuadro().setContentAreaFilled(false);
            cuadros2[i].getCuadro().setIcon(imgs);
            cuadros2[i].getCuadro().addActionListener(this);
        }
        contador = 0;

        for (int y = 0; y < 8; y++) {
            for (int x = 0; x < 8; x++) {
                if ((x % 2 != 0 && y % 2 == 0) || (x % 2 == 0 && y % 2 != 0)) {
                    cuadros2[contador].getCuadro().setLocation(250 + (x * 60), 80 + (y * 60));
                    ++contador;
                }
            }
        }

        for (int i = 0; i < 12; i++) {
            cuadros2[i].setOcupado(true);
            cuadros2[i].setIdFichaOcupando(i);
            cuadros2[i].setTipoOcupa12(2);
            fichas2[i].setIdCuadroActual(i);

        }
        for (int i = 20; i < 32; i++) {
            cuadros2[i].setOcupado(true);
            cuadros2[i].setTipoOcupa12(1);
            cuadros2[i].setIdFichaOcupando(i - 20);
            fichas1[i - 20].setIdCuadroActual(i);
        }

        /**
         * SE INSERTA la tabla de fondo
         */
        fondo();

    }

    public boolean condicionesValidas() {

        if (turno1 && NumFichasClico != -1) {
            fichastmp = fichas1;
            return true;
        }

        if (!turno1 && NumFichasClico != -1) {
            fichastmp = fichas2;
            return true;
        }
        return false;
    }

    public void MovPosible() {
        if (cuadros2[NumCuadroClico].getIdFichaOcupando() == -1 && NumFichasClico != -1) {

            switch (fichastmp[NumFichasClico].getFicha().getY() - cuadros2[NumCuadroClico].getCuadro().getY()) {
                case 60:
                    System.out.println("entra a 60");
                    if ((distaciaX() == 60 || distaciaX() == -60)
                            && (turno1 || (!turno1 && fichastmp[NumFichasClico].getCorono()))) {
                        cambiosGenerales();
                    }

                    break;
                case -60:
                    System.out.println("entra a --60");
                    if ((distaciaX() == 60 || distaciaX() == -60)
                            && (!turno1 || (turno1 && fichastmp[NumFichasClico].getCorono()))) {
                        cambiosGenerales();
                    }

                    break;
                case 120:
                    System.out.println("entra a 120");
                    if ((turno1 || (!turno1 && fichastmp[NumFichasClico].getCorono()))) {

                        if (distaciaX() == 120 && cuadros2[NumCuadroClico + 4 + tipoCuadro()].getIdFichaOcupando() != -1) {

                            if ((turno1 && cuadros2[NumCuadroClico + 4 + tipoCuadro()].getTipoOcupa12() == 2)
                                    || (!turno1 && cuadros2[NumCuadroClico + 4 + tipoCuadro()].getTipoOcupa12() == 1)) {

                                comerFicha(cuadros2[NumCuadroClico + 4 + tipoCuadro()].getIdFichaOcupando());
                                cambiosGenerales();
                            }

                        } else if (distaciaX() == -120 && cuadros2[NumCuadroClico + 3 + tipoCuadro()].getIdFichaOcupando() != -1) {

                            if ((turno1 && cuadros2[NumCuadroClico + 3 + tipoCuadro()].getTipoOcupa12() == 2)
                                    || (!turno1 && cuadros2[NumCuadroClico + 3 + tipoCuadro()].getTipoOcupa12() == 1)) {

                                comerFicha(cuadros2[NumCuadroClico + 3 + tipoCuadro()].getIdFichaOcupando());
                                cambiosGenerales();
                            }
                        }

                    }

                    break;
                case -120:
                    System.out.println("entra a --120");
                    if ((!turno1 || (turno1 && fichastmp[NumFichasClico].getCorono()))) {

                        if (distaciaX() == 120 && cuadros2[NumCuadroClico - 4 + tipoCuadro()].getIdFichaOcupando() != -1) {

                            if ((turno1 && cuadros2[NumCuadroClico - 4 + tipoCuadro()].getTipoOcupa12() == 2)
                                    || (!turno1 && cuadros2[NumCuadroClico - 4 + tipoCuadro()].getTipoOcupa12() == 1)) {

                                comerFicha(cuadros2[NumCuadroClico - 4 + tipoCuadro()].getIdFichaOcupando());
                                cambiosGenerales();
                            }

                        } else if (distaciaX() == -120 && cuadros2[NumCuadroClico - 5 + tipoCuadro()].getIdFichaOcupando() != -1) {
                            if ((turno1 && cuadros2[NumCuadroClico - 5 + tipoCuadro()].getTipoOcupa12() == 2)
                                    || (!turno1 && cuadros2[NumCuadroClico - 5 + tipoCuadro()].getTipoOcupa12() == 1)) {

                                comerFicha(cuadros2[NumCuadroClico - 5 + tipoCuadro()].getIdFichaOcupando());
                                cambiosGenerales();
                            }
                        }
                    }

                    break;
                default:
                    System.out.println("no se puede nunguna");
                    break;
            }
        }
    }

    public void coronar() {
        if (turno1 && (NumCuadroClico >= 0 && NumCuadroClico < 4) && !fichastmp[NumFichasClico].getCorono()) {
            fichastmp[NumFichasClico].setCorono(true);
            System.out.println("CORONO JUGADOR 1");

        }
        if (!turno1 && (NumCuadroClico >= 28 && NumCuadroClico < 32) && !fichastmp[NumFichasClico].getCorono()) {
            fichastmp[NumFichasClico].setCorono(true);
            System.out.println("CORONO JUGADOR 2");
        }
    }

    public int tipoCuadro() {
        if (NumCuadroClico >= 0 && NumCuadroClico < 4 || NumCuadroClico >= 8 && NumCuadroClico < 12
                || NumCuadroClico >= 16 && NumCuadroClico < 20 || NumCuadroClico >= 24 && NumCuadroClico < 28) {
            return 1;
        }
        return 0;
    }

    public int distaciaX() {
        System.out.println(
                "que pas " + (fichastmp[NumFichasClico].ficha.getX() - cuadros2[NumCuadroClico].getCuadro().getX()));

        return fichastmp[NumFichasClico].ficha.getX() - cuadros2[NumCuadroClico].getCuadro().getX();
    }

    public void cambiosGenerales() {
        int tipoOcupa12 = 2;
        if (turno1) {
            tipoOcupa12 = 1;
        }

        /**
         * CABIOS CUADRO ACTUAL
         */
        cuadros2[NumCuadroClico].setIdFichaOcupando(NumFichasClico);
        cuadros2[NumCuadroClico].setOcupado(true);
        cuadros2[NumCuadroClico].setTipoOcupa12(tipoOcupa12);

        /**
         * CABIOS CUADRO ANTERIOR
         */
        cuadros2[fichastmp[NumFichasClico].getIdCuadroActual()].setOcupado(false);
        cuadros2[fichastmp[NumFichasClico].getIdCuadroActual()].setIdFichaOcupando(-1);
        cuadros2[fichastmp[NumFichasClico].getIdCuadroActual()].setTipoOcupa12(-1);

        /**
         * CABIOS A LA FICHA
         */
        fichastmp[NumFichasClico].getFicha().setLocation(cuadros2[NumCuadroClico].getCuadro().getX(),
                cuadros2[NumCuadroClico].getCuadro().getY());
        fichastmp[NumFichasClico].setIdCuadroActual(NumCuadroClico);

        coronar();
        NumFichasClico = -1;
        NumCuadroClico = -1;
        turno1 = !turno1;
        // idFichaOcupa();
    }

    public void comerFicha(int idFicha) {
        if (turno1) {
            fichas2[idFicha].getFicha().setVisible(false);
            fichas2[idFicha].setDisponible(false);

            cuadros2[fichas2[idFicha].getIdCuadroActual()].setOcupado(false);
            cuadros2[fichas2[idFicha].getIdCuadroActual()].setIdFichaOcupando(-1);
            cuadros2[fichas2[idFicha].getIdCuadroActual()].setTipoOcupa12(-1);
            tablero.SumarContadorRojo();

        } else {
            fichas1[idFicha].getFicha().setVisible(false);
            fichas1[idFicha].setDisponible(false);

            cuadros2[fichas1[idFicha].getIdCuadroActual()].setOcupado(false);
            cuadros2[fichas1[idFicha].getIdCuadroActual()].setIdFichaOcupando(-1);
            cuadros2[fichas1[idFicha].getIdCuadroActual()].setTipoOcupa12(-1);
            tablero.SumarContadoBlanco();
        }
    }

    public static boolean continuaJuego(Ficha[] fichas1, Ficha[] fichas2) {

        if (hayDamas(fichas1) && hayDamas(fichas2)) {
            return true;
        }
        return false;
    }

    public static boolean hayDamas(Ficha[] fichas12) {
        for (int i = 0; i < 12; i++) {
            if (fichas12[i].getDisponible()) {
                return true;
            }
        }
        return false;
    }

    public void idFichaOcupa() {
        for (int i = 0; i < 32; i++) {
            System.out.println(i + ": " + cuadros2[i].getIdFichaOcupando());
        }
    }

    public static void desHabilitarFichas(Ficha[] fichas) {
        for (int i = 0; i < 12; i++) {
            fichas[i].getFicha().setEnabled(false);
        }
    }

    public void ventanaTermino(String nomJugadorGano) {

        JOptionPane.showMessageDialog(null, "Gano: " + nomJugadorGano + "\n Tiempo:" + crnmt.tiempo(), "FIN JUEGO", 1);
        tablero.dispose();
        menuJuegos.setVisible(true);
    }

    public void guardar() {
        for (int i = 0; i > 12; i++) {
            fichas1[i].getFicha().removeActionListener(this);
            fichas2[i].getFicha().removeActionListener(this);
        }
        for (int i = 0; i < 32; i++) {

            cuadros2[i].getCuadro().removeActionListener(this);
        }

        usuario.setFichas1(fichas1);
        usuario.setFichas2(fichas2);
        usuario.setComio1(tablero.getComioRojo());
        usuario.setComio2(tablero.getComioBlanco());
        usuario.setTablero(cuadros2);

        usuario.getTiempoDamas()[0] = crnmt.getHora();
        usuario.getTiempoDamas()[1] = crnmt.getMinutos();
        usuario.getTiempoDamas()[2] = crnmt.getSegundos();
         usuario.setTurno1(turno1);

        usuario.setGuardoDamas(true);
        this.tablero.dispose();

    }

}
