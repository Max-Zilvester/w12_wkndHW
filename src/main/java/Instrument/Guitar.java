package Instrument;

import MusicalIntrument.Instrument;

public class Guitar extends Instrument {

    private int numberOfStrings;

    public Guitar(String name, String rawMaterials, String colour, String type, String description, double buyPrice, double sellPrice, int numberOfStrings) {
        super(name, rawMaterials, buyPrice, sellPrice);
        this.numberOfStrings = numberOfStrings;
    }
}
