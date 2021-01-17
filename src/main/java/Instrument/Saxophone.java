package Instrument;

import Behaviours.IPlay;
import MusicalIntrument.Instrument;


public class Saxophone extends Instrument implements IPlay {

    private int keys;

    public Saxophone(String name, String rawMaterials, String colour, String type, String description, double buyPrice, double sellPrice, int keys) {
        super(name, rawMaterials, buyPrice, sellPrice);
        this.keys = keys;
    }

    public int getKeys() {
        return keys;
    }

    public String playSound(String sound){
        return sound;
    }
}
