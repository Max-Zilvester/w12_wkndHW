package MusicalIntrument;

public abstract class Instrument {

    private String name;
    private String rawMaterials;
    private String colour;
    private String type;
    private String description;
    private double buyPrice;
    private double sellPrice;

    public Instrument(String name, String rawMaterials, double buyPrice, double sellPrice){
        this.name = name;
        this.rawMaterials = rawMaterials;
        this.colour = colour;
        this.type = type;
        this.description = description;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public String getName() {
        return name;
    }

    public String getRawMaterials() {
        return rawMaterials;
    }

    public String getColour() {
        return colour;
    }

    public String getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRawMaterials(String rawMaterials) {
        this.rawMaterials = rawMaterials;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setBuyPrice(double buyPrice) {
        this.buyPrice = buyPrice;
    }

    public void setSellPrice(double sellPrice) {
        this.sellPrice = sellPrice;
    }
}
