
package lab4_sergiosuazoalessandroreyes;

public class Golpeador extends Jugador{
    private int musculatura,reflejos,agilidad,fuerza;

    public Golpeador() {
    }

    public Golpeador(int musculatura, int reflejos, String nombre, String casa, int año, int numero) {
        super(nombre, casa, año, numero);
        this.musculatura = musculatura;
        this.reflejos = reflejos;
        this.agilidad = reflejos+7;
        this.fuerza = (musculatura*2)-7;
    }

    public int getMusculatura() {
        return musculatura;
    }

    public void setMusculatura(int musculatura) {
        this.musculatura = musculatura;
    }

    public int getReflejos() {
        return reflejos;
    }

    public void setReflejos(int reflejos) {
        this.reflejos = reflejos;
    }

    public int getAgilidad() {
        return agilidad;
    }

    public void setAgilidad(int agilidad) {
        this.agilidad = agilidad;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    @Override
    public String toString() {
        return "Golpeador{" + "musculatura=" + musculatura + ", reflejos=" + reflejos + ", agilidad=" + agilidad + ", fuerza=" + fuerza + '}';
    }
    
    @Override
    public boolean Juego(int j,boolean b) {
        if (b)
        {
            if((fuerza*2)+1>j)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        else
        {
            if((agilidad/2)+7>j)
            {
                return true;
            }
            else 
            {
                return false;
            }
        }
    }

    @Override
    public boolean Trampa(int i) {
        if(i<=22)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
}
