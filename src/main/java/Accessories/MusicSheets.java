package Accessories;

import MusicalIntrument.Instrument;

public class MusicSheets extends Instrument {

    private int numberOfSheets;

    public MusicSheets(String name, String description, double buyPrice, double sellPrice, int numberOfSheets) {
        super(name, description, buyPrice, sellPrice);
        this.numberOfSheets = numberOfSheets;
    }

    public int getNumberOfSheets() {
        return numberOfSheets;
    }
}
