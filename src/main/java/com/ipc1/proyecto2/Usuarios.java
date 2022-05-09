/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ipc1.proyecto2;

import com.ipc1.proyecto2.controladorHanoi.Barra;
import com.ipc1.proyecto2.controladorHanoi.Torre;

/**
 *
 * @author minch
 */
public class Usuarios {
    
    private int id;
    private String nombre;
    private int totalParJugo;
    private int totalParGano;
    private int totalParPerdio;
    private int totalMovRealizo;
    private int promMovRealizo;
    private int[][]  movTiempPatida = new int [10][2];
    
    
    /*VARIABLES DE JUEGO DEL USUARIO **/
    private int [] tiempoHanoi = new int [3];
    private int [] tiempoDamas = new int [3];
    
    private Barra[] Barras;
    private int cBarras;
    private int MovActual;
    private Torre[] torres;
    private boolean guardoHanoi=false;
    private int perdioHanoi=0;
    
    
    

    public Usuarios(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.totalParJugo = 0;
        this.totalParGano = 0;
        this.totalParPerdio = 0;
        this.totalMovRealizo = 0;
    }

    public Usuarios(int id, String nombre, int totalParJugo, int totalParGano, int totalParPerdio, int totalMovRealizo, int promMovRealizo) {
        this.id = id;
        this.nombre = nombre;
        this.totalParJugo = totalParJugo;
        this.totalParGano = totalParGano;
        this.totalParPerdio = totalParPerdio;
        this.totalMovRealizo = totalMovRealizo;
        this.promMovRealizo = promMovRealizo;
    }

    public int getPerdioHanoi() {
        return perdioHanoi;
    }

    public void setPerdioHanoi() {
        ++this.perdioHanoi;
    }

    public int getMovActual() {
        return MovActual;
    }

    public void setMovActual(int MovActual) {
        this.MovActual = MovActual;
    }
    
    
    public int getcBarras() {
        return cBarras;
    }

    public void setcBarras(int cBarras) {
        this.cBarras = cBarras;
    } 
    
    

    public boolean getGuardoHanoi() {
        return guardoHanoi;
    }

    public void setGuardoHanoi(boolean guardoHanoi) {
        this.guardoHanoi = guardoHanoi;
    }
    

    public int[] getTiempoHanoi() {
        return tiempoHanoi;
    }

    public void setTiempoHanoi(int[] tiempoHanoi) {
        this.tiempoHanoi = tiempoHanoi;
    }

    public int[] getTiempoDamas() {
        return tiempoDamas;
    }

    public void setTiempoDamas(int[] tiempoDamas) {
        this.tiempoDamas = tiempoDamas;
    }
    
    

    public Barra[] getBarras() {
        return Barras;
    }

    public void setBarras(Barra[] Barras) {
        this.Barras = Barras;
    }

    public Torre[] getTorres() {
        return torres;
    }

    public void setTorres(Torre[] torres) {
        this.torres = torres;
    }

    
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTotalParJugo() {
        return totalParJugo;
    }

    public void setTotalParJugo(int totalParJugo) {
        this.totalParJugo = totalParJugo;
    }

    public int getTotalParGano() {
        return totalParGano;
    }

    public void setTotalParGano(int totalParGano) {
        this.totalParGano = totalParGano;
    }

    public int getTotalParPerdio() {
        return totalParPerdio;
    }

    public void setTotalParPerdio(int totalParPerdio) {
        this.totalParPerdio = totalParPerdio;
    }

    public int getTotalMovRealizo() {
        return totalMovRealizo;
    }

    public void setTotalMovRealizo(int totalMovRealizo) {
        this.totalMovRealizo = totalMovRealizo;
    }

    public int getPromMovRealizo() {
        if(totalParJugo>0){
            return ( totalMovRealizo/totalParJugo );
        }
        return 0;
    }

    public void setPromMovRealizo(int promMovRealizo) {
        this.promMovRealizo = promMovRealizo;
    }

    public int[][] getMovTiempPatida() {
        return movTiempPatida;
    }

    public void setMovTiempPatida(int[][] movTiempPatida) {
        this.movTiempPatida = movTiempPatida;
    }
     
}
