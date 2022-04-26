/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ipc1.proyecto3.controladorHanoi;

import static com.ipc1.proyecto3.controladorHanoi.ControladorHanoi.verificador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author minch
 */
public class Ejecutador extends Thread {
    
    Torre  torres[];
    Barra barras[];
    int cantidaBarras;

    public Ejecutador(Torre[] torres, Barra[] barras, int cantidaBarras) {
        this.torres = torres;
        this.barras = barras;
        this.cantidaBarras = cantidaBarras;
        
    }



    @Override
    public void run() {
       //while (verificador(torres, barras) != cantidaBarras) {
        //}
        verificador(torres, barras);
    }
 
    
}
