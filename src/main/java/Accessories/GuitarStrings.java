package Accessories;

import behaviours.ISell;

public class GuitarStrings implements ISell {

    private Double buyingPrice;
    private Double sellingPrice;
    private String brand;
    private Double gauge;

    public GuitarStrings(Double buyingPrice, Double sellingPrice, String brand, Double gauge) {
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
        this.brand = brand;
        this.gauge = gauge;
    }

    public Double getBuyingPrice() {
        return buyingPrice;
    }

    public Double getSellingPrice() {
        return sellingPrice;
    }

    public String getBrand() {
        return brand;
    }

    public Double getGauge() {
        return gauge;
    }

    public Double calculateMarkup(Double sellingPrice, Double buyingPrice){
        return sellingPrice - buyingPrice;
    }
}
