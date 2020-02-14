
package lab4_sergiosuazoalessandroreyes;

import java.util.ArrayList;

public class Equipo {
    private String casa;
    private int ganados,perdidos,promedioF,promedioV,promedioA;
    private ArrayList<Jugador> jugadores = new ArrayList<>();
    private Jugador capitan;

    public Equipo() {
    }

    public Equipo(String casa, int ganados, int perdidos, int promedioF, int promedioV, int promedioA, Jugador capitan) {
        this.casa = casa;
        this.ganados = ganados;
        this.perdidos = perdidos;
        this.promedioF = promedioF;
        this.promedioV = promedioV;
        this.promedioA = promedioA;
        this.capitan = capitan;
    }

    public String getCasa() {
        return casa;
    }

    public void setCasa(String casa) {
        this.casa = casa;
    }

    public int getGanados() {
        return ganados;
    }

    public void setGanados(int ganados) {
        this.ganados = ganados;
    }

    public int getPerdidos() {
        return perdidos;
    }

    public void setPerdidos(int perdidos) {
        this.perdidos = perdidos;
    }

    public int getPromedioF() {
        return promedioF;
    }

    public void setPromedioF(int promedioF) {
        this.promedioF = promedioF;
    }

    public int getPromedioV() {
        return promedioV;
    }

    public void setPromedioV(int promedioV) {
        this.promedioV = promedioV;
    }

    public int getPromedioA() {
        return promedioA;
    }

    public void setPromedioA(int promedioA) {
        this.promedioA = promedioA;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public Jugador getCapitan() {
        return capitan;
    }

    public void setCapitan(Jugador capitan) {
        this.capitan = capitan;
    }

    @Override
    public String toString() {
        return "Equipo{" + "casa=" + casa + ", ganados=" + ganados + ", perdidos=" + perdidos + ", promedioF=" + promedioF + ", promedioV=" + promedioV + ", promedioA=" + promedioA + ", jugadores=" + jugadores + ", capitan=" + capitan + '}';
    }
    
    
}
