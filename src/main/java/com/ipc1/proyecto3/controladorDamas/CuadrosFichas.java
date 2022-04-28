/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ipc1.proyecto3.controladorDamas;

import com.ipc1.proyecto3.graficos.TableroDamas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;

/**
 *
 * @author minch
 */
public class CuadrosFichas extends Thread implements ActionListener {

    private Cuadricula[][] cuadros = new Cuadricula[8][8];
    TableroDamas tablero;

    public CuadrosFichas(TableroDamas tablero) {
        this.tablero = tablero;
        instanciador();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object queBoton = e.getSource();

        for (int y = 0; y < 8; y++) {
            for (int x = 0; x < 8; x++) {

                if (queBoton == cuadros[x][y].getCuadro()) {
                    System.out.println("si funciona posX:" + x + " posY:" + y);
                    break;
                }

            }
        }
    }

    public void instanciador() {
        ImageIcon imgs = new ImageIcon("C:\\Users\\minch\\Documents\\proyecto3.1\\src\\main\\java\\com\\ipc1\\proyecto3\\imagenes\\fondoNegro.jpg");
        for (int y = 0; y < 8; y++) {
            for (int x = 0; x < 8; x++) {
                cuadros[x][y] = new Cuadricula(250 + (x * 60), 70 + (y * 60));
                cuadros[x][y].getCuadro().setVisible(true);
                tablero.add(cuadros[x][y].getCuadro());
                cuadros[x][y].getCuadro().addActionListener(this);
                
                //cuadros[x][y].getCuadro().setOpaque(true);
                cuadros[x][y].getCuadro().setContentAreaFilled(false);
                if ((x % 2 == 0 && y % 2 == 0) || (x % 2 != 0 && y % 2 != 0)) {
                    cuadros[x][y].getCuadro().setIcon(imgs);
                }
                

            }
        }
    }

}
