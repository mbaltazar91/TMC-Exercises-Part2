package containers;

public class ProductContainer extends Container {

    private String productName;

    public ProductContainer(String productName, double capacity){
        super(capacity);
        this.productName = productName;
    }

    public void setName(String productName){
        this.productName = productName;
    }

    public String getName(){
        return productName;
    }

    public void setProductName(String productName){
        this.productName = productName;
    }

    public String toString(){
        String productContainer = String.format("%s: %s",this.getName(),super.toString());
        return productContainer;
    }
}
