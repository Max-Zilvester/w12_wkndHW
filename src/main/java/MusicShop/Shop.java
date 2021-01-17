package MusicShop;

import Behaviours.ISell;

import java.util.ArrayList;

public class Shop {

    private String name;
    private ArrayList<ISell> stocks;

    public Shop(String name){
        this.name = name;
        this.stocks = new ArrayList<ISell>();
    }

    public int stockCount(){
        return stocks.size();
    }

    public void addItemsToStocks(ISell item){
        this.stocks.add(item);
    }

    public void removeItemsFromStocks(ISell item){
        this.stocks.remove(item);
    }
}
