public class Purchase {

    private String product;
    private int amount;
    private int unitPrice;

    public Purchase (String product, int amount, int unitPrice){
        this.product = product;
        this.amount = amount;
        this.unitPrice = unitPrice;
    }

    public String getProduct(){
        return product;
    }

    public int price(){
        return unitPrice*amount;
    }

    public void increaseAmount(){
        amount++;
    }

    public String toString(){
        String productString = String.format("%s: %d",product,amount);
        return productString;
    }
}


/**Create the class Purchase with the following functionality:

 a constructor public Purchase(String product, int amount, int unitPrice),
 which creates a purchase corresponding the parameter product.
 The product unit amount of purchase is clarified by the parameter amount,
 and the third parameter is the unit price
 public int price(), which returns the purchase price.
 This is obtained by raising the unit amount by the unit price
 public void increaseAmount() increases by one the purchase unit amount
 public String toString() returns the purchase in a string form like the following**/