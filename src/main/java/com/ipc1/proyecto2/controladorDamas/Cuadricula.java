/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ipc1.proyecto2.controladorDamas;

import javax.swing.JButton;

/**
 *
 * @author minch
 */
public class Cuadricula {
    private int numero;
    private int idFichaOcupando = -1;
    private int tipoOcupa12=-1;
    private boolean ocupado = false;
    JButton cuadro = new JButton();

    public Cuadricula(int numero) {
        cuadro.setSize(60, 60);
        this.numero = numero;
    }

    
    
    public int getTipoOcupa12() {
        return tipoOcupa12;
    }


    public void setTipoOcupa12(int tipoOcupa12) {
        this.tipoOcupa12 = tipoOcupa12;
    }



    public int getIdFichaOcupando() {
        return idFichaOcupando;
    }

    public void setIdFichaOcupando(int idFichaOcupando) {
        this.idFichaOcupando = idFichaOcupando;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public boolean getOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    public JButton getCuadro() {
        return cuadro;
    }

    public void setCuadro(JButton cuadro) {
        this.cuadro = cuadro;
    }

}
