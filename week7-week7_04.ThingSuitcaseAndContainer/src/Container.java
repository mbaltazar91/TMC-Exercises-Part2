import java.util.ArrayList;

public class Container {

    private ArrayList<Suitcase> suitcases;
    private int maxWeight;

    public Container(int maxWeight){
        suitcases = new ArrayList<Suitcase>();
        this.maxWeight = maxWeight;
    }

    public int totalWeight(){
        int weight = 0;
        for(Suitcase suitcase : suitcases){
            weight += suitcase.totalWeight();
        }
        return weight;
    }

    public void addSuitcase(Suitcase suitcase){
        if(totalWeight()+suitcase.totalWeight()<=maxWeight){
            suitcases.add(suitcase);
        }
    }

    @Override
    public String toString(){
        String str = String.format("%d suitcases (%d kg)",suitcases.size(),totalWeight());
        return str;
    }

    public void printThings(){
        for(Suitcase suitcase : suitcases){
            suitcase.printThings();
        }
    }
}
