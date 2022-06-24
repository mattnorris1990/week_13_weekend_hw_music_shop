package Accessories;

import behaviours.ISell;

public class MusicStand implements ISell {

    private Double buyingPrice;
    private Double sellingPrice;
    private Boolean foldable;
    private String material;

    public MusicStand(Double buyingPrice, Double sellingPrice, Boolean foldable, String material) {
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
        this.foldable = foldable;
        this.material = material;
    }

    public Double getBuyingPrice() {
        return buyingPrice;
    }

    public Double getSellingPrice() {
        return sellingPrice;
    }

    public Boolean getFoldable() {
        return foldable;
    }

    public String getMaterial() {
        return material;
    }

    public Double calculateMarkup(Double buyingPrice, Double sellingPrice){
        return sellingPrice - buyingPrice;
    }
}
