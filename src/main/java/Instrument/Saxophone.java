package Instrument;

import MusicalIntrument.Instrument;


public class Saxophone extends Instrument {

    private int keys;

    public Saxophone(String name, String rawMaterials, String colour, String type, String description, double buyPrice, double sellPrice, int keys) {
        super(name, rawMaterials, colour, type, description, buyPrice, sellPrice);
        this.keys = keys;
    }

    public int getKeys() {
        return keys;
    }
}
