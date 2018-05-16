import java.util.Map;
import java.util.HashMap;

public class PromissoryNote {

    private Map<String,Double> loans;

    public PromissoryNote(){
       loans = new HashMap<String, Double>();
    }

    public void setLoan(String toWhom, double value){
        loans.put(toWhom,value);
    }

    public double howMuchIsTheDebt(String whose){
        for(String key : loans.keySet()){
            if(key.equals(whose)){
                return loans.get(key);
            }

        }
        return 0;
    }
}
