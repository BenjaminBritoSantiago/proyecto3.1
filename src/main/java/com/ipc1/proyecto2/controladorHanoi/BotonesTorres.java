/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ipc1.proyecto2.controladorHanoi;

import com.ipc1.proyecto2.InfoJuego;
import com.ipc1.proyecto2.Usuarios;
import com.ipc1.proyecto2.graficos.CronometroTorres;
import com.ipc1.proyecto2.graficos.MenuJuegos;
import com.ipc1.proyecto2.graficos.TorresdeHanoi;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author minch
 */
public class BotonesTorres extends Thread implements ActionListener {

    private Usuarios usuario;
    private Barra[] barras = new Barra[8];
    private Torre[] torres = new Torre[3];
    private int cantidaBarras;
    private MenuJuegos menuJuegos;
    private CronometroTorres crnmt;
    private TorresdeHanoi ventana;

    public BotonesTorres(TorresdeHanoi ventana, int cantidaBarras, MenuJuegos menuJuegos, CronometroTorres crnmt, Usuarios usuario) {
        this.usuario = usuario;
        this.crnmt = crnmt;
        this.menuJuegos = menuJuegos;
        this.ventana = ventana;
        this.cantidaBarras = cantidaBarras;

        if (usuario.getGuardoHanoi()) {
            colocarBarras();
            colocarTorres();

        } else {
            instanciarBarras();
            instanciarTorres();
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        Object queBoton = e.getSource();
        for (int i = 7; i > 7 - cantidaBarras; i--) {
            if (queBoton == barras[i].getBoton()) {
                System.out.println("boton pulso>:" + barras[i].getIdBarra());
                Barra.idClico = barras[i].getIdBarra();
                break;

            }
        }

        for (int i = 0; i < 3; i++) {
            if (queBoton == torres[i].getTorreG()) {

                if (Barra.idClico != -1) {
                    System.out.println("torre que pulso>:" + torres[i].getIdTorre());
                    Torre.idClico = torres[i].getIdTorre();
                    break;
                }

            }
        }

        verificador();
    }

    public void colocarBarra() {
        for (int i = 7; i > 7 - cantidaBarras; i--) {
            barras[i].setVisible(true);
            ventana.add(barras[i].getBoton());
            barras[i].getBoton().addActionListener(this);
            /* if(!usuario.getGuardoHanoi()){
             barras[i].getBoton().addActionListener(this);
            }*/
        }

    }

    public void colocarTorre() {

        for (int i = 0; i < 3; i++) {
            torres[i].getTorreG().setVisible(true);
            ventana.add(torres[i].getTorreG());
            torres[i].getTorreG().addActionListener(this);
            /*if(!usuario.getGuardoHanoi()){
            torres[i].getTorreG().addActionListener(this);
            }*/
        }
    }

    public void colocarBarras() {
        this.barras = usuario.getBarras();
        colocarBarra();
    }

    public void colocarTorres() {
        this.torres = usuario.getTorres();
        colocarTorre();
    }

    public void instanciarBarras() {

        for (int i = 7; i > 7 - cantidaBarras; i--) {
            // Barra( int idBarra, int peso, int idTorreActual, int posicionYActual, int pesoAnterior  )
            barras[i] = new Barra(i, i, 0, i - 7, i + 1, 280, 40, String.valueOf(i + 1));
            barras[i].getBoton().setLocation(30, (i * 40) + 140);

        }
        colocarBarra();

    }

    public void instanciarTorres() {
        for (int i = 0; i < 3; i++) {
            torres[i] = new Torre(i, 8, 0);
            torres[i].getTorreG().setLocation(150 + (300 * i), 110);
            torres[i].getTorreG().setVisible(true);
            ventana.add(torres[i].getTorreG());
            torres[i].getTorreG().addActionListener(this);
        }
        torres[0].setPosOcupadas(cantidaBarras);
    }

    public static void iniciador(Barra[] arrayBarras, Torre[] arrayTorres, int cantBarras) {
        arrayTorres[0].setPeso(8 - cantBarras);
        arrayTorres[0].setPosOcupadas(cantBarras);

    }

    public static int posY(int idTorre, Torre[] arrayTorres) {
        int posInicial = 420;
        switch (arrayTorres[idTorre].getPosOcupadas()) {
            case 0:
                return posInicial - (0 * 40);

            case 1:
                return posInicial - (1 * 40);

            case 2:
                return posInicial - (2 * 40);

            case 3:
                return posInicial - (3 * 40);

            case 4:
                return posInicial - (4 * 40);

            case 5:
                return posInicial - (5 * 40);

            case 6:
                return posInicial - (6 * 40);

            case 7:
                return posInicial - (7 * 40);

            default:
                System.out.println(" pos ocupadas: " + arrayTorres[idTorre].getPosOcupadas());
                return 0;

        }
    }

    public static void mover(int idTorre, int idClico, Torre[] torres, Barra[] barras) {

        //cambios torre Aterior
        System.out.println("clictorre " + (idTorre + 1) + " posocuapas Anterior:" + torres[barras[idClico].getIdTorreActual()].getPosOcupadas());
        torres[barras[idClico].getIdTorreActual()].quitarBarra();
        System.out.println("clictorre " + (idTorre + 1) + " idclico:" + idClico);
        System.out.println("clictorre " + (idTorre + 1) + " posocuapasAnterior:" + torres[barras[idClico].getIdTorreActual()].getPosOcupadas());

        torres[barras[idClico].getIdTorreActual()].setPeso(barras[idClico].getPesoAnterior());

        System.out.println("clictorre " + (idTorre + 1) + " pesotorreanterior:" + barras[idClico].getPesoAnterior());
        //cambios torreactual
        barras[idClico].setPesoAnterior(torres[idTorre].getPeso());
        System.out.println("clictorre " + (idTorre + 1) + " peso anterior a Guardar en barra:" + torres[idTorre].getPeso());
        torres[idTorre].setPeso(barras[idClico].getPeso());
        System.out.println("clictorre " + (idTorre + 1) + " peso torre actual:" + barras[idClico].getPeso());
        torres[idTorre].agregarBarra();
        System.out.println("clictorre " + (idTorre + 1) + " cantidad barras:" + torres[idTorre].getPosOcupadas());
        //cambios barras
        barras[idClico].setIdTorreActual(idTorre);
    }

    public void verificador() {

        if (Barra.idClico != -1 && Torre.idClico != -1) {
            if (barras[Barra.idClico].getPeso() <= torres[barras[Barra.idClico].getIdTorreActual()].getPeso()) {
                if (barras[Barra.idClico].getIdTorreActual() != Torre.idClico) {
                    if (torres[Torre.idClico].getPeso() >= barras[Barra.idClico].getPeso()) {

                        moverBoton(Torre.idClico, Barra.idClico, 30, posY(Torre.idClico, torres), barras);

                        mover2(Torre.idClico, Barra.idClico, torres, barras);
                        ventana.setMovActuales();

                        if (Torre.idClico != 0) {
                            if (torres[Torre.idClico].getPosOcupadas() == cantidaBarras) {
                                deshabilitarTodaslasBarras();
                                ventanaTermino();
                            }
                        }
                        Barra.idClico = -1;
                        Torre.idClico = -1;
                    }
                }
            }
        }

    }

    public static void mover2(int idTorre, int idClico, Torre[] torres, Barra[] barras) {
        //cambios torre Aterior
        torres[barras[idClico].getIdTorreActual()].quitarBarra();
        torres[barras[idClico].getIdTorreActual()].setPeso(barras[idClico].getPesoAnterior());

        //cambios torreactual
        barras[idClico].setPesoAnterior(torres[idTorre].getPeso());
        torres[idTorre].setPeso(barras[idClico].getPeso());
        torres[idTorre].agregarBarra();
        //cambios barras
        barras[idClico].setIdTorreActual(idTorre);

    }

    public static void moverBoton(int idTorre, int queBoton, int posX, int posY, Barra[] barras) {

        switch (idTorre) {
            case 0:
                posX = 30;
                break;
            case 1:
                posX = 330;
                break;
            case 2:
                posX = 630;
                break;
        }

        barras[queBoton].getBoton().setLocation(posX, posY);

    }

    public void deshabilitarTodaslasBarras() {
        for (int i = 7; i > 7 - cantidaBarras; i--) {
            // Barra( int idBarra, int peso, int idTorreActual, int posicionYActual, int pesoAnterior  )
            barras[i].getBoton().setEnabled(false);
        }
        ventana.setTerminar(true);
    }

    public void ventanaTermino() {
        InfoJuego.getUsuario().setGuardoHanoi(false);

        int mov = Integer.parseInt(ventana.getMovActuales().getText());
        int min = Integer.parseInt(ventana.getMovMin().getText());

        String mensaje = "         LO LOGRASTE \ncon los movimientos minimos";
        if (mov > min) {
            mensaje = "terminaste, usaste " + (mov - min) + " movimientos de mas";
        }

        JOptionPane.showMessageDialog(null, mensaje + "\n movimientos:" + mov + "\n Tiempo:" + crnmt.tiempo(), "TERMINASTE", 1);
        this.ventana.dispose();
        menuJuegos.setVisible(true);

    }

    public void guardar(int movActual) {

        for (int i = 7; i > 7 - cantidaBarras; i--) {
            barras[i].getBoton().removeActionListener(this);
        }
        for (int i = 0; i < 3; i++) {
            torres[i].getTorreG().removeActionListener(this);
        }
        Barra.idClico = -1;
        Torre.idClico = -1;

        usuario.setBarras(barras);
        usuario.setcBarras(cantidaBarras);
        usuario.setMovActual(movActual);
        System.out.println("movimietos que se guardan " + movActual);
        usuario.setTorres(torres);
        usuario.getTiempoHanoi()[0] = crnmt.getHora();
        usuario.getTiempoHanoi()[1] = crnmt.getMinutos();
        usuario.getTiempoHanoi()[2] = crnmt.getSegundos();

        usuario.setGuardoHanoi(true);
        this.ventana.dispose();

    }

}
