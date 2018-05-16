package application;

import java.util.Random;

public class Thermometer implements Sensor {

    private Random random;
    private boolean state;

    public Thermometer(){
        this.random = new Random();
        this.state = false;
    }

    public boolean isOn(){
        return this.state;
    }

    public void on(){
        this.state = true;
    }

    public void off(){
        this.state = false;
    }

    public int measure(){
        int value = (random.nextInt(61)-30);
        return value;
    }
}
