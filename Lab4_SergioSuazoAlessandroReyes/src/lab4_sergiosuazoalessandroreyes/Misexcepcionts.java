package lab4_sergiosuazoalessandroreyes;

import java.awt.Color;

public class Misexcepcionts extends Exception{
    private Color color;
    public Misexcepcionts() {
        super();
    }

    public Misexcepcionts(Color color, String string) {
        super(string);
        this.color = color;
    }

    @Override
    public String toString() {
        return "Misexcepciones{" + '}';
    }
}
