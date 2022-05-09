/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ipc1.proyecto2;

import com.ipc1.proyecto2.controladorDamas.Cuadricula;
import com.ipc1.proyecto2.controladorDamas.Ficha;
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
   
    //varibales HANOI
    private Barra[] Barras;
    private int cBarras;
    private int MovActual;
    private Torre[] torres;
    private boolean guardoHanoi=false;
    private int perdioHanoi=0;
    
    
    
    //varibales damas
    private Cuadricula [] tablero;
    private Ficha [] Fichas1;
    private Ficha [] Fichas2;
    private int Comio1;
    private int Comio2;
    private int sumaMovsDamas;
    private boolean turno1;
    private boolean guardoDamas=false;
    
    private int partidasJugoDamas=0;
    private int partidasGanoDamas=0;
    private int partidasPerdioDamas=0;
    private int totalMovsDamas=0;
    private int[] tiempoVictoriaCorta = new int [3];
    private int movsVictoriaCorta=0;
    
    
    

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
    
    //REPORTES;

    public int getPartidasJugoDamas() {
        return partidasJugoDamas;
    }

    public void setPartidasJugoDamas() {
        ++this.partidasJugoDamas;
    }

    
    public int getPartidasGanoDamas() {
        return partidasGanoDamas;
    }

    public void setPartidasGanoDamas() {
        ++this.partidasGanoDamas;
    }

    
    public int getPartidasPerdioDamas() {
        return partidasPerdioDamas;
    }

    public void setPartidasPerdioDamas() {
        ++this.partidasPerdioDamas;
    }

    
    public int getTotalMovsDamas() {
        return totalMovsDamas;
    }

    public void setTotalMovsDamas(int totalMovsDamas) {
        this.totalMovsDamas =this.totalMovsDamas + totalMovsDamas;
    }

    
    public int[] getTiempoVictoriaCorta() {
        return tiempoVictoriaCorta;
    }

    public void setTiempoVictoriaCorta(int[] tiempoVictoriaCorta) {
        this.tiempoVictoriaCorta = tiempoVictoriaCorta;
    }

    
    public int getMovsVictoriaCorta() {
        return movsVictoriaCorta;
    }

    public void setMovsVictoriaCorta(int movsVictoriaCorta) {
        this.movsVictoriaCorta = movsVictoriaCorta;
    }
    
    ////////////////////////////////////////////

    
    public int getSumaMovsDamas() {
        return sumaMovsDamas;
    }

    public void setSumaMovsDamas(int sumaMovsDamas) {
        this.sumaMovsDamas = sumaMovsDamas;
    }
    
    
    

    public boolean getTurno1() {
        return turno1;
    }

    public void setTurno1(boolean turno1) {
        this.turno1 = turno1;
    }
    
    
    public int getComio1() {
        return Comio1;
    }

    public void setComio1(int Comio1) {
        this.Comio1 = Comio1;
    }

    public int getComio2() {
        return Comio2;
    }

    public void setComio2(int Comio2) {
        this.Comio2 = Comio2;
    }
    
    
    
    public Cuadricula[] getTablero() {
        return tablero;
    }

    public void setTablero(Cuadricula[] tablero) {
        this.tablero = tablero;
    }

    public Ficha[] getFichas1() {
        return Fichas1;
    }

    public void setFichas1(Ficha[] Fichas1) {
        this.Fichas1 = Fichas1;
    }

    public Ficha[] getFichas2() {
        return Fichas2;
    }

    public void setFichas2(Ficha[] Fichas2) {
        this.Fichas2 = Fichas2;
    }

    public boolean getGuardoDamas() {
        return guardoDamas;
    }

    public void setGuardoDamas(boolean guardoDamas) {
        this.guardoDamas = guardoDamas;
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
