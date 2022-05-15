/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ipc1.proyecto2.controladorHanoi;


import com.ipc1.proyecto2.graficos.MenuUsuario;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author minch
 */
public class Torre extends JPanel {

    //private int idBarra;
    private int peso;
    private int posOcupadas;
    private int idTorre;
    private JButton torreG = new JButton();
    public static int idClico=-1;

    public Torre(int idTorre, int peso, int posOcupadas) {
        //this.idBarra=idBarra;
        idClico=-1;
        this.peso = peso;
        this.posOcupadas = posOcupadas;
        this.idTorre = idTorre;
        torreG.setBounds(0, 0, 40, 350);
        torreG.setOpaque(true); 
        torreG.setContentAreaFilled(false);
        ImageIcon imgs =  new ImageIcon( MenuUsuario.ruta+"\\proyecto3.1\\src\\main\\java\\com\\ipc1\\proyecto2\\imagenes\\amarillo.jpg");
        torreG.setIcon(imgs);
    }

    public int getIdTorre() {
        return idTorre;
    }

    public void setIdTorre(int idTorre) {
        this.idTorre = idTorre;
    }
    

    public JButton getTorreG() {
        return torreG;
    }

    public void setTorreG(JButton torreG) {
        this.torreG = torreG;
    }

    
    public void quitarBarra() {

        posOcupadas = posOcupadas - 1;
    }

    public void agregarBarra() {
        posOcupadas = posOcupadas + 1;
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
