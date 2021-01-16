package Instrument;

import MusicalIntrument.Instrument;

public class Piano extends Instrument{

    private int pedals;

    public Piano(String name, String rawMaterials, String colour, String type, String description, double buyPrice, double sellPrice, int pedals) {
        super(name, rawMaterials, colour, type, description, buyPrice, sellPrice);
        this.pedals = pedals;
    }

    public int getPedals() {
        return pedals;
    }
}
