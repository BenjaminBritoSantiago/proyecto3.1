/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ipc1.proyecto2;

/**
 *
 * @author minch
 */
public class InfoJuego {
    
    private static Usuarios [] usuarios = new Usuarios[10];
    private static Usuarios usuario;
    private static int cantUsuarios=0;

    public InfoJuego() {
            
        
    }

    public static Usuarios[] getUsuarios() {
        return usuarios;
    }

    public static void setUsuarios(Usuarios[] usuarios) {
        InfoJuego.usuarios = usuarios;
    }

    public static Usuarios getUsuario() {
        return usuario;
    }

    public static void setUsuario(Usuarios usuario) {
        InfoJuego.usuario = usuario;
    }

    public static int getCantUsuarios() {
        return cantUsuarios;
    }

    public static void setCantUsuarios(int cantUsuarios) {
        InfoJuego.cantUsuarios = cantUsuarios;
    }

   

    
    
    
    
    
    
}
