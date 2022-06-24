package instruments;

public class Trumpet extends Instrument {

    private int valves;

    public Trumpet(Double buyingPrice, Double sellingPrice, InstrumentType instrumentType, String material, String colour, int valves) {
        super(buyingPrice, sellingPrice, instrumentType, material, colour);
        this.valves = valves;
    }

    public int getValves() {
        return valves;
    }

    public String play(){
        return "toot toot toot";
    }


}
