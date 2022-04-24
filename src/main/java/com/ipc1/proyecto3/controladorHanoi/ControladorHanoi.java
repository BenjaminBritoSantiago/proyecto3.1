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
            arrayBarras[i] = new Barra(i, i, 0, i-7, i+1);
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

}
