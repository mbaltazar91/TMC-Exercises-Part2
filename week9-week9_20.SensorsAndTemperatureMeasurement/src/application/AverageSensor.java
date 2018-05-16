package application;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {

    private List<Sensor> sensors;
    private List<Integer> readings;


    public AverageSensor(){
        this.sensors = new ArrayList<Sensor>();
        this.readings = new ArrayList<Integer>();
    }


    public boolean isOn(){
        for(Sensor s : sensors) {
            if (!s.isOn()) {
                return false;
            }
        }
            return true;

    }

    public void on(){
        for(Sensor s : sensors){
            s.on();
        }

    }

    public void off(){
        for(Sensor s : sensors){
            s.off();
        }

    }

    public int measure(){
        if(this.isOn()==false||sensors.size()==0){
            throw new IllegalStateException();

        }
        int sum = 0;
        for(Sensor s : sensors){
            sum += s.measure();
        }

        readings.add(sum/sensors.size());
        return sum/sensors.size();
    }

    public void addSensor(Sensor additional){
        sensors.add(additional);
    }

    public List<Integer> readings(){
        return readings;
    }
}
