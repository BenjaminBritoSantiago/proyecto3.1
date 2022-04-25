/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ipc1.proyecto3;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author minch
 */
public class Contadors implements Runnable {

    private int hora = 01;
    private int minutos = 01;
    private int segundos = 01;
    

    @Override
    public void run() {
         String contador;
         do {
            String h = "", m = "", s = "";

            if (hora < 10) {
                System.out.print("0");
                h.concat("0");
            }
            h.concat(String.valueOf(hora));
            System.out.print(hora + ":");

            if (minutos < 10) {
                System.out.print("0");
                m.concat("0");
            }
            m.concat(String.valueOf(minutos));
            System.out.print(minutos + ":");

            if (segundos < 10) {
                System.out.print("0");
                s.concat("0");
            }
            s.concat(String.valueOf(segundos));
            System.out.println(segundos);
            contador.setText(h + ":" + m + ":" + s);
            System.out.println();

            segundos++;

            if (segundos == 60) {
                segundos = 0;
                minutos++;
                if (minutos == 60) {
                    minutos = 0;
                    hora++;
                }
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Cronometro.class.getName()).log(Level.SEVERE, null, ex);
            }

        } while (true);
       

    }

}
