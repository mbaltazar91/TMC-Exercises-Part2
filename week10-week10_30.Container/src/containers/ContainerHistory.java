package containers;

import java.util.ArrayList;
import java.util.List;

public class ContainerHistory {

    private List<Double> history;

    public ContainerHistory(){
        history = new ArrayList<Double>();
    }

    public void add(double situation){
        history.add(situation);
    }

    public void reset(){
        history.clear();
    }

    @Override
    public String toString(){
        return history.toString();
    }

    public double maxValue(){
        if(history.isEmpty()){
            return 0;
        }
        double max = history.get(0);
        for(double num : history){
            max = (num>max)?num:max;
        }
        return max;
    }

    public double minValue(){
        if(history.isEmpty()){
            return 0;
        }
        double min = history.get(0);
        for(double num : history){
            min = (num<min)?num:min;
        }
        return min;
    }

    public double average(){
        if(history.isEmpty()){
            return 0;
        }
        double sum = 0;
        for(double num : history){
            sum += num;
        }
        return sum/history.size();
    }

    public double greatestFluctuation(){
        if(history.size()<=1){
            return 0;
        }
        double greatestFluctuation = 0;
        for(int i = 0; i<history.size()-1; i++){
            double fluct = Math.abs(history.get(i)-history.get(i+1));
            greatestFluctuation = (fluct>greatestFluctuation)?fluct:greatestFluctuation;
        }
        return greatestFluctuation;
    }

    public double variance(){
        if(history.size()<=1){
            return 0;
        }
        double squareSum = 0;
        for(double num : history){
            squareSum += Math.pow(num-average(),2.0);
        }
        return squareSum/(history.size()-1);
    }

}
