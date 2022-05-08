/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.ipc1.proyecto2;

import com.ipc1.proyecto2.graficos.MenuUsuario;

/**
 *
 * @author minch
 */



public class Proyecto2 {
    
    
    private static Usuarios [] usuarios = new Usuarios[10];
    private static Usuarios usuario;
    

    public static void main(String[] args) {
        System.out.println("Hello World!");

        //TorresdeHanoi ventanaHanoi = new TorresdeHanoi();
        //ventanaHanoi.setVisible(true);
        MenuUsuario inicio = new MenuUsuario();
        inicio.setVisible(true);
        inicio.setDefaultCloseOperation(inicio.EXIT_ON_CLOSE);
    }

    
    public static Usuarios getUsuario() {
        return usuario;
    }

    public static void setUsuario(Usuarios usuario) {
        Proyecto2.usuario = usuario;
    }
    
    

    public static Usuarios[] getUsuarios() {
        return usuarios;
    }

    public static void setUsuarios(Usuarios[] usuarios) {
        Proyecto2.usuarios = usuarios;
    }
    
    
    
}
