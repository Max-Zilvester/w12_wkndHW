package Instrument;

import Behaviours.IPlay;
import MusicalIntrument.Instrument;

public class Piano extends Instrument implements IPlay {

    private int pedals;

    public Piano(String name, String rawMaterials, String colour, String type, String description, double buyPrice, double sellPrice, int pedals) {
        super(name, rawMaterials, buyPrice, sellPrice);
        this.pedals = pedals;
    }

    public int getPedals() {
        return pedals;
    }

    @Override
    public String playSound(String sound) {
        return sound;
    }

}
