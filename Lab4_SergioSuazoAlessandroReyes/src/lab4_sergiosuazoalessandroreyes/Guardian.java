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
public class Guardian extends Jugador{
    private int reflejo,agilidad;

    public Guardian(int reflejo, String nombre, String casa, int año, int numero) {
        super(nombre, casa, año, numero);
        this.reflejo = reflejo;
        this.agilidad = reflejo + 7;
    }
    

    public Guardian() {
    }

    
    
    @Override
    public boolean Juego(int j,boolean b) {
        if(agilidad>j)
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
        if(i<=13)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

}
