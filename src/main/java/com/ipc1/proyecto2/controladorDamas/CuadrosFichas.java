/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ipc1.proyecto2.controladorDamas;

import com.ipc1.proyecto2.graficos.TableroDamas;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author minch
 */
public class CuadrosFichas extends Thread implements ActionListener {

    private Cuadricula[][] cuadros = new Cuadricula[8][8];

    private Cuadricula[] cuadros2 = new Cuadricula[32];

    private Ficha[] fichas1 = new Ficha[12];
    private Ficha[] fichas2 = new Ficha[12];
    private Ficha[] fichastmp;

    private int NumFichasClico = -1;
    private int NumCuadroClico = -1;

    private boolean turno1 = true;

    TableroDamas tablero;

    public CuadrosFichas(TableroDamas tablero) {
        this.tablero = tablero;
        instanciador();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object queBoton = e.getSource();
        /**
         * for (int y = 0; y < 8; y++) {
         * for (int x = 0; x < 8; x++) {
         * 
         * if (queBoton == cuadros[x][y].getCuadro()) {
         * System.out.println(" CUADRO EN posX:" + x + " posY:" + y);
         * break;
         * }
         * }
         * }
         */
        /** DETECTOR DE CUADRO CLICLADO */
        for (int y = 0; y < 32; y++) {
            if (queBoton == cuadros2[y].getCuadro()) {
                System.out.println(" CUADRO EN  no:" + cuadros2[y].getNumero() + "num fichaOcupa "
                        + cuadros2[y].getIdFichaOcupando());
                NumCuadroClico = y;

                if (condicionesValidas()) {
                    MovPosible();
                }

                break;
            }
        }

        /** DETECTOR DE FICHA 1 CLICLADO */
        for (int i = 0; i < 12; i++) {
            if (turno1 && queBoton == fichas1[i].getFicha()) {
                System.out.println("NO FICHA1  + " + i);
                NumFichasClico = i;
                break;
            }

        }

        /** DETECTOR DE FICHA 2 CLICLADO */
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
                if ((x % 2 == 0 && y % 2 == 0) || (x % 2 != 0 && y % 2 != 0)) {
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
                if ((x % 2 == 0 && y % 2 == 0) || (x % 2 != 0 && y % 2 != 0)) {
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
         * for (int y = 0; y < 8; y++) {
         * for (int x = 0; x < 8; x++) {
         * cuadros[x][y] = new Cuadricula();
         * cuadros[x][y].getCuadro().setLocation(250 + (x * 60), 80 + (y * 60));
         * cuadros[x][y].getCuadro().setVisible(true);
         * tablero.add(cuadros[x][y].getCuadro());
         * cuadros[x][y].getCuadro().addActionListener(this);
         * 
         * cuadros[x][y].getCuadro().setOpaque(true);
         * cuadros[x][y].getCuadro().setContentAreaFilled(false);
         * if ((x % 2 == 0 && y % 2 == 0) || (x % 2 != 0 && y % 2 != 0)) {
         * cuadros[x][y].getCuadro().setIcon(imgs);
         * }
         * }
         * }
         */

        for (int i = 0; i < 32; i++) {
            cuadros2[i] = new Cuadricula(i);
            tablero.add(cuadros2[i].getCuadro());
            cuadros2[i].getCuadro().setVisible(true);
            cuadros2[i].getCuadro().addActionListener(this);
            cuadros2[i].getCuadro().setOpaque(true);
            cuadros2[i].getCuadro().setContentAreaFilled(false);
            cuadros2[i].getCuadro().setIcon(imgs);
        }
        contador = 0;

        for (int y = 0; y < 8; y++) {
            for (int x = 0; x < 8; x++) {
                if ((x % 2 == 0 && y % 2 == 0) || (x % 2 != 0 && y % 2 != 0)) {
                    cuadros2[contador].getCuadro().setLocation(250 + (x * 60), 80 + (y * 60));
                    ++contador;
                }

            }
        }

        for (int i = 0; i < 12; i++) {
            cuadros2[i].setOcupado(true);
            cuadros2[i].setIdFichaOcupando(i);
            fichas2[i].setIdCuadroActual(i);
        }
        for (int i = 20; i < 32; i++) {
            cuadros2[i].setOcupado(true);
            cuadros2[i].setIdFichaOcupando(i - 20);
            fichas1[i - 20].setIdCuadroActual(i);
        }

        /** SE INSERTA la tabla de fondo */
        JLabel tableroP = new JLabel();
        tableroP.setBounds(250, 80, 480, 480);
        tableroP.setOpaque(true);
        tableroP.setBackground(Color.lightGray);
        tableroP.setVisible(true);
        tablero.add(tableroP);

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
                    if ((distaciaX() == 120 || distaciaX() == -120)
                            && (turno1 || (!turno1 && fichastmp[NumFichasClico].getCorono()))) {

                        if (distaciaX() == 120
                                && cuadros2[NumCuadroClico + 4 + tipoCuadro()].getIdFichaOcupando() != -1) {
                            cambiosGenerales();

                        } else if (distaciaX() == -120 && cuadros2[NumCuadroClico + 3 + tipoCuadro()].getIdFichaOcupando() != -1) {
                            cambiosGenerales();
                        }

                    }

                    break;
                case -120:
                    System.out.println("entra a --120");
                    if ((distaciaX() == 120 || distaciaX() == -120)
                            && (!turno1 || (turno1 && fichastmp[NumFichasClico].getCorono()))) {

                        if (distaciaX() == 120 && cuadros2[NumCuadroClico - 5 + tipoCuadro()].getIdFichaOcupando() != -1) {
                            cambiosGenerales();
                        } else if (distaciaX() == -120 && cuadros2[NumCuadroClico - 4 + tipoCuadro()].getIdFichaOcupando() != -1) {
                            cambiosGenerales();
                        }
                    }

                    break;
                default:
                    System.out.println("no se puede nunguna");
                    break;
            }
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
        fichastmp[NumFichasClico].getFicha().setLocation(cuadros2[NumCuadroClico].getCuadro().getX(),
                cuadros2[NumCuadroClico].getCuadro().getY());

        cuadros2[fichastmp[NumFichasClico].getIdCuadroActual()].setIdFichaOcupando(-1);
        fichastmp[NumFichasClico].setIdCuadroActual(NumCuadroClico);
        cuadros2[NumCuadroClico].setIdFichaOcupando(NumFichasClico);
        NumFichasClico = -1;
        NumCuadroClico = -1;
        turno1 = !turno1;
        idFichaOcupa();
    }

    public void idFichaOcupa() {
        for (int i = 0; i < 32; i++) {
            System.out.println(i + ": " + cuadros2[i].getIdFichaOcupando());
        }
    }

}
