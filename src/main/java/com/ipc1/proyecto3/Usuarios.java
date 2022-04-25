/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ipc1.proyecto3;

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
