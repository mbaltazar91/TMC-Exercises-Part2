package farmsimulator;

import java.util.Collection;

public class Barn {

    private BulkTank tank;
    private MilkingRobot milkingRobot;

    public Barn(BulkTank tank){
        this.tank = tank;
    }

    public BulkTank getBulkTank(){
        return tank;
    }

    public void installMilkingRobot(MilkingRobot milkingRobot){
        this.milkingRobot = milkingRobot;
    }

    public void takeCareOf(Cow cow) throws IllegalStateException{
        if (milkingRobot == null) {
            throw new IllegalStateException();
        }
        tank.addToTank(cow.milk());
    }


    public void takeCareOf(Collection<Cow> cows) throws IllegalStateException {
        for (Cow cow : cows) {
            if (milkingRobot == null) {
                throw new IllegalStateException();
            }
            tank.addToTank(cow.milk());
        }
    }

    public String toString(){
        return tank.toString();
    }
}
