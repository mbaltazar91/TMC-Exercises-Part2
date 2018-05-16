package farmsimulator;

import java.util.ArrayList;
import java.util.List;

public class Farm implements Alive {

    private String owner;
    private Barn barn;
    private List<Cow> cows;

    public Farm(String owner, Barn barn){
        this.owner = owner;
        this.barn = barn;
        cows = new ArrayList<Cow>();
    }

    public String getOwner(){
        return owner;
    }

    public void addCow(Cow cow){
        cows.add(cow);
    }

    public void installMilkingRobot(MilkingRobot milkingRobot){
        barn.installMilkingRobot(milkingRobot);
    }

    public void liveHour(){
        for(Cow cow : cows){
            cow.liveHour();
        }
    }

    public void manageCows(){
       barn.takeCareOf(cows);
    }

    public String toString(){
        String farm = String.format("Farm owner: %s\nBarn bulk tank: %s\n",owner,barn.getBulkTank());
        if(cows.isEmpty()){
            farm+="No cows.";
        }
        else{
            farm+="Animals:\n";
            for(Cow cow : cows){
                farm+="        " + cow;
            }
        }
        return farm;
    }

}
