package Instrument;

import Behaviours.IPlay;
import Behaviours.ISell;
import MusicalIntrument.Instrument;

public class Guitar extends Instrument implements IPlay, ISell {

    private int numberOfStrings;

    public Guitar(String name, String rawMaterials, String colour, String type, String description, double buyPrice, double sellPrice, int numberOfStrings) {
        super(name, rawMaterials, buyPrice, sellPrice);
        this.numberOfStrings = numberOfStrings;
    }


    @Override
    public String playSound(String sound) {
        return sound;
    }

    public double calculateMarkup(){
        return (getSellPrice() - getBuyPrice());
    }


}
