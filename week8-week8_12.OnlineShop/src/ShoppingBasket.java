import java.util.ArrayList;
import java.util.List;

public class ShoppingBasket {

    private List<Purchase> purchases;

    public ShoppingBasket(){
        purchases = new ArrayList<Purchase>();
    }

    public void add(String product, int price){
        for(Purchase p : purchases){
            if(p.getProduct().equals(product)){
                p.increaseAmount();
                return;
            }
        }
        Purchase purchase = new Purchase(product,1,price);
        purchases.add(purchase);

    }

    public int price(){
        int price = 0;
        for(Purchase p : purchases){
            price += p.price();
        }
        return price;
    }

    public void print(){
        for(Purchase p : purchases){
            System.out.println(p);
        }
    }


}
