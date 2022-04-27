/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ipc1.proyecto3.controladorHanoi;

import com.ipc1.proyecto3.controladorHanoi.Torre;
import com.ipc1.proyecto3.controladorHanoi.Barra;

/**
 *
 * @author minch
 */
public class ControladorHanoi {
    
    
    public static void instanciarBarras(Barra[] arrayBarras, int numBarras) {
        for (int i = 7; i > 7 - numBarras; i--) {
            // Barra( int idBarra, int peso, int idTorreActual, int posicionYActual, int pesoAnterior  )
            arrayBarras[i] = new Barra(i, i, 0, i - 7, i + 1, 280, 40, String.valueOf(i + 1));

        }
    }

    public static void instanciarTorres(Torre[] arrayTorres) {
        for (int i = 0; i < 3; i++) {
            arrayTorres[i] = new Torre(i, 8, 0);
        }
    }

    public static void iniciador(Barra[] arrayBarras, Torre[] arrayTorres, int cantBarras) {
        arrayTorres[0].setPeso(8 - cantBarras);
        arrayTorres[0].setPosOcupadas(cantBarras);

    }

    public static int posY(int idTorre, Torre[] arrayTorres) {
        int posInicial = 410;
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

    public static int verificador(Torre[] torres, Barra[] barras) {

        if (Barra.idClico != -1 && Torre.idClico != -1) {

            if (barras[Barra.idClico].getPeso() <= torres[barras[Barra.idClico].getIdTorreActual()].getPeso()) {
                if (barras[Barra.idClico].getIdTorreActual() != Torre.idClico) {
                    if (torres[Torre.idClico].getPeso() >= barras[Barra.idClico].getPeso()) {

                        moverBoton(Torre.idClico, Barra.idClico, 30, posY(Torre.idClico, torres), barras);

                        mover2(Torre.idClico, Barra.idClico, torres, barras);

                        Barra.idClico = -1;
                        Torre.idClico = -1;
                        if (Barra.idClico!=0) {
                            return torres[Torre.idClico].getPosOcupadas();
                        }
                    }
                }
            }
        }
        
        return 0;

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

}
