/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_sergiosuazoalessandroreyes;

/**
 *
 * @author Sergio
 */
public abstract class Jugador {
    private String nombre;
    private String casa;
    private int año,numero;

    public Jugador() {
    }

    public Jugador(String nombre, String casa, int año, int numero) {
        this.nombre = nombre;
        this.casa = casa;
        this.año = año;
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCasa() {
        return casa;
    }

    public void setCasa(String casa) {
        this.casa = casa;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    public abstract boolean Juego(int j,boolean b);
    public abstract boolean Trampa(int i);
}
