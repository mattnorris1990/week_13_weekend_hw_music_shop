package instruments;

public class Piano extends Instrument {

    private int keysNumber;

    public Piano(Double buyingPrice, Double sellingPrice, InstrumentType instrumentType, String material, String colour, int keysNumber) {
        super(buyingPrice, sellingPrice, instrumentType, material, colour);
        this.keysNumber = keysNumber;
    }

    public int getKeysNumber() {
        return keysNumber;
    }

    public String play() {
        return "dingle dingle dang";
    }
}
