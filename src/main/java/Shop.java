import behaviours.ISell;

import java.util.ArrayList;

public class Shop {

    private ArrayList<ISell> stockList;

    public Shop(ArrayList<ISell> stockList) {
        this.stockList = stockList;
    }

    public ArrayList<ISell> getStockList() {
        return stockList;
    }

    public void addItemToStock (ISell item){
        stockList.add(item);
    }

    public void removeItemFromStock (ISell item){
        stockList.remove(item);
    }

    public Double returnTotalPotentialProfit(){
        double total = 0;

        for (ISell item : stockList){
            total += item.calculateMarkup(item.getSellingPrice(), item.getBuyingPrice());
        }

        return total;
    }

}
