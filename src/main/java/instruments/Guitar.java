package instruments;

public class Guitar extends Instrument {

    private int stringsNumber;
    private Boolean hollowBody;

    public Guitar(Double buyingPrice, Double sellingPrice, InstrumentType instrumentType, String material, String colour, int stringsNumber, Boolean hollowBody) {
        super(buyingPrice, sellingPrice, instrumentType, material, colour);
        this.stringsNumber = stringsNumber;
        this.hollowBody = hollowBody;
    }

    public int getStringsNumber() {
        return stringsNumber;
    }

    public Boolean getHollowBody() {
        return hollowBody;
    }

    public String play(){
        return "a-woogah woogah";
    }

}
