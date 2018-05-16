import java.util.*;

public class Storehouse {

    private Map<String,Integer> prices;
    private Map<String,Integer> stocks;

    public Storehouse(){
        prices = new HashMap<String, Integer>();
        stocks = new HashMap<String, Integer>();
    }

    public void addProduct(String product, int price, int stock){
        prices.put(product,price);
        if(stocks.containsKey(product)){
            stocks.put(product,stocks.get(product)+stock);
        }
        else{
            stocks.put(product,stock);
        }
    }

    public int price(String product){
        if(prices.containsKey(product)){
            return prices.get(product);
        }
        return -99;
    }

    public int stock(String product){
        if(stocks.containsKey(product)){
            return stocks.get(product);
        }
        return 0;
    }

    public boolean take(String product){
        if(stocks.containsKey(product)&&stocks.get(product)>=1){
            stocks.put(product,stocks.get(product)-1);
            return true;
        }
        return false;
    }

    public Set<String> products(){
        Set<String> products = new HashSet<String>();
        for(String product : stocks.keySet()){
            if(stocks.get(product)>0){
                products.add(product);
            }
        }
        return products;
    }
    }


