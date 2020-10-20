/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_poo_v2;

import java.awt.Color;

/**
 *
 * @author Ariel
 * @author Ana
 */
public class chanclas {

    // Atributos 
    String marca;
    int size;
    Color color;
    String estilo;
// constructores 

    public chanclas() {

    }

    public chanclas(String marca, Color color) {
        this.marca = marca;
        this.color = color;
    }

    public chanclas(String marca, Color color, int size, String estilo) {
        this.marca = marca;
        this.color = color;
        this.size = size;
        this.estilo = estilo;
    }

    // mutadores 
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    //
    public void setColor(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    //
    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    // 
    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public String getEstilo() {
        return estilo;
    }

    // MA
    public String toString(){
        return "Marca: " + marca +" La talla: " + size + " El color: " +color +" Estilo: " + estilo; 
    }
    
    
}
