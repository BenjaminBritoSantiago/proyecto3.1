/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ipc1.proyecto3.controladores;

/**
 *
 * @author minch
 */
public class Torre {
    
    private int idBarra;
    private int peso;
    private int posOcupadas;

    public Torre(int idBarra, int peso, int posOcupadas) {
        this.idBarra=idBarra;
        this.peso = peso;
        this.posOcupadas = posOcupadas;
    }
    
    
    public void quitarBarra() {
        
        posOcupadas=posOcupadas-1;
    }
    
    public void agregarBarra() {
        posOcupadas=posOcupadas+1;
    }
    
    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getPosOcupadas() {
        return posOcupadas;
    }

    public void setPosOcupadas(int posOcupadas) {
        this.posOcupadas = posOcupadas;
    }
    
    
    
    
}
