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
public class Buscador extends Jugador{
    private int peso,velocidad;

    public Buscador() {
    }

    public Buscador(int peso, String nombre, String casa, int año, int numero) {
        super(nombre, casa, año, numero);
        this.peso = peso;
        this.velocidad = (200/peso)*7;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        return "Buscador{" + "peso=" + peso + ", velocidad=" + velocidad + '}';
    }
    
    
    @Override
    public boolean Juego(int j,boolean b) {
        if((velocidad/14+14>j))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    @Override
    public boolean Trampa(int i) {
        if(i<=5)
        {
            return true;
        }
        else
        {
            return false;
        }
    }


}
