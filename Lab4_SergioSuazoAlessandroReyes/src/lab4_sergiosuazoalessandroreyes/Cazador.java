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
public class Cazador extends Jugador{
    private int peso,reflejos,velocidad,agilidad;

    public Cazador() {
    }

    public Cazador(int peso, int reflejos, String nombre, String casa, int año, int numero) {
        super(nombre, casa, año, numero);
        this.peso = peso;
        this.reflejos = reflejos;
        this.velocidad = (200/peso)*7;
        this.agilidad = reflejos+7;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getReflejos() {
        return reflejos;
    }

    public void setReflejos(int reflejos) {
        this.reflejos = reflejos;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getAgilidad() {
        return agilidad;
    }

    public void setAgilidad(int agilidad) {
        this.agilidad = agilidad;
    }

    @Override
    public String toString() {
        return "Cazador{" + "peso=" + peso + ", reflejos=" + reflejos + ", velocidad=" + velocidad + ", agilidad=" + agilidad + '}';
    }
    
    
    @Override
    public boolean Juego(int j,boolean b) {
        if(velocidad+agilidad>j)
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
        if(i<=10)
        {
            return true;
        }
        else
        {
            return false;
        }
    }


}
