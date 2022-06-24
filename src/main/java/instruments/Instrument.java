package instruments;

import behaviours.IPlay;
import behaviours.ISell;

public abstract class Instrument implements IPlay, ISell {

    private Double buyingPrice;
    private Double sellingPrice;
    private InstrumentType instrumentType;
    private String material;
    private String colour;

    public Instrument(Double buyingPrice, Double sellingPrice, InstrumentType instrumentType, String material, String colour) {
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
        this.instrumentType = instrumentType;
        this.material = material;
        this.colour = colour;
    }

    public Double getBuyingPrice() {
        return buyingPrice;
    }

    public Double getSellingPrice() {
        return sellingPrice;
    }

    public InstrumentType getInstrumentType() {
        return instrumentType;
    }

    public String getMaterial() {
        return material;
    }

    public String getColour() {
        return colour;
    }

    public Double calculateMarkup(Double sellingPrice, Double buyingPrice){
        return sellingPrice - buyingPrice;
    }

}
