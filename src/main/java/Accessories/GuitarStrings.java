package Accessories;

import MusicalIntrument.Instrument;

public class GuitarStrings extends Instrument {

    private int frets;

    public GuitarStrings(String name, String description, double buyPrice, double sellPrice, int frets) {
        super(name, description, buyPrice, sellPrice);
        this.frets = frets;
    }

    public int getFrets() {
        return frets;
    }
}
