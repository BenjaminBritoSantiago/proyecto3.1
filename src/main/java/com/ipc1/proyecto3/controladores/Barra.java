/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ipc1.proyecto3.controladores;

/**
 *
 * @author minch
 */
public class Barra {
    
    private int idBarra;
    private int peso;
    private int idTorreActual;
    private int posicionYActual;
    private int pesoAnterior;
    
    
    public Barra( int idBarra, int peso, int idTorreActual, int posicionYActual, int pesoAnterior  ) {
        this.peso = peso;
        this.idTorreActual = idTorreActual;
        this.posicionYActual = posicionYActual;
        this.idBarra = idBarra;
        this.pesoAnterior = pesoAnterior;
    }

    public int getPesoAnterior() {
        return pesoAnterior;
    }

    public void setPesoAnterior(int pesoAnterior) {
        this.pesoAnterior = pesoAnterior;
    }
    

    public int getIdBarra() {
        return idBarra;
    }

    public void setIdBarra(int idBarra) {
        this.idBarra = idBarra;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getIdTorreActual() {
        return idTorreActual;
    }

    public void setIdTorreActual(int idTorreActual) {
        this.idTorreActual = idTorreActual;
    }

    public int getPosicionYActual() {
        return posicionYActual;
    }

    public void setPosicionYActual(int posicionYActual) {
        this.posicionYActual = posicionYActual;
    }
    
    
    
    
            
    
}
