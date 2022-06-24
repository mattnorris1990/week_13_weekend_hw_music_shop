package behaviours;

public interface ISell {

    public Double calculateMarkup(Double buyingPrice, Double sellingPrice);

    public Double getBuyingPrice();

    public Double getSellingPrice();
}
