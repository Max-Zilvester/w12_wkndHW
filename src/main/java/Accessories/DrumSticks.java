package Accessories;

import MusicalIntrument.Instrument;

public class DrumSticks extends Instrument {

    private String materialType;


    public DrumSticks(String name, String description, double buyPrice, double sellPrice, String materialType) {
        super(name, description, buyPrice, sellPrice);
        this.materialType = materialType;
    }

    public String getMaterialType() {
        return materialType;
    }
}
