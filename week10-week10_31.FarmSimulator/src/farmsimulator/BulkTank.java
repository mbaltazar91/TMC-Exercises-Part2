package farmsimulator;

public class BulkTank {

    private double capacity;
    private double volume;

    public BulkTank(){
        capacity = 2000.0;
    }

    public BulkTank(double capacity){
        this.capacity = capacity;
    }

    public double getCapacity(){
        return capacity;
    }

    public double getVolume(){
        return volume;
    }

    public double howMuchFreeSpace(){
        return capacity-volume;
    }

    public void addToTank(double amount){
        if(volume + amount > capacity){
            volume = capacity;
        }
        else{
            volume += amount;
        }
    }

    public double getFromTank(double amount){
        if(amount<0){
            return 0;
        }
        if(amount>volume){
            double total = amount;
            volume = 0;
            return total;
        }
        volume -= amount;
        return amount;
    }

    @Override
    public String toString(){
        String tank = String.format("%.1f/%.1f",Math.ceil(volume),Math.ceil(capacity));
        return tank;
    }
}
