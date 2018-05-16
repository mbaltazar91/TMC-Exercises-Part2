package application;

public class Main {

    public static void main(String[] args) {
       AverageSensor av = new AverageSensor();
       av.addSensor(new ConstantSensor(10));
       av.addSensor(new ConstantSensor(20));



        System.out.println(av.readings());
    }
}
