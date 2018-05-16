package containers;

import java.util.ArrayList;
import java.util.List;

public class ProductContainerRecorder extends ProductContainer{

    private ContainerHistory history;

    public ProductContainerRecorder(String productName, double capacity, double initialVolume){
        super(productName,capacity);
        super.addToTheContainer(initialVolume);
        history = new ContainerHistory();
        history.add(initialVolume);
    }

    public String history(){
        return history.toString();
    }

    public void addToTheContainer(double amount){
        super.addToTheContainer(amount);
        history.add(getVolume());
    }

    public double takeFromTheContainer(double amount){
        double result = super.takeFromTheContainer(amount);
        history.add(getVolume());
        return result;

    }

    public void printAnalysis(){
        System.out.println("Product: " + getName());
        System.out.println("History: " + history);
        System.out.println("Greatest product amount: " + history.maxValue());
        System.out.println("Smallest product amount: " + history.minValue());
        System.out.println("Average: " + history.average());
        System.out.println("Greatest change: " + history.greatestFluctuation());
        System.out.println("Variance: " + history.variance());
    }
}
