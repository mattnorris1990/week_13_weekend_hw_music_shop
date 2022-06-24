package Accessories;

import behaviours.ISell;

public class SheetMusic implements ISell {

    private Double buyingPrice;
    private Double sellingPrice;
    private String title;
    private String composer;

    public SheetMusic(Double buyingPrice, Double sellingPrice, String title, String composer) {
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
        this.title = title;
        this.composer = composer;
    }

    public Double getBuyingPrice() {
        return buyingPrice;
    }

    public Double getSellingPrice() {
        return sellingPrice;
    }

    public String getTitle() {
        return title;
    }

    public String getComposer() {
        return composer;
    }

    public Double calculateMarkup(Double sellingPrice, Double buyingPrice){
        return sellingPrice - buyingPrice;
    }
}
