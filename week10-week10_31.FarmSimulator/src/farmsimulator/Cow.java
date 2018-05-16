package farmsimulator;

import java.util.Random;

public class Cow implements Milkable,Alive {

    private static final String[] NAMES = new String[]{
            "Anu", "Arpa", "Essi", "Heluna", "Hely",
            "Hento", "Hilke", "Hilsu", "Hymy", "Ihq", "Ilme", "Ilo",
            "Jaana", "Jami", "Jatta", "Laku", "Liekki",
            "Mainikki", "Mella", "Mimmi", "Naatti",
            "Nina", "Nyytti", "Papu", "Pullukka", "Pulu",
            "Rima", "Soma", "Sylkki", "Valpu", "Virpi"
    };

    private String name;
    private double udderCapacity;
    private double udderVolume;
    private Random random;

    public Cow(){
        random = new Random();
        name = NAMES[random.nextInt(NAMES.length)];
        udderCapacity = random.nextInt(26)+15;
        udderVolume = 0.0;
    }

    public Cow(String name){
        random = new Random();
        this.name = name;
        udderCapacity = random.nextInt(26)+15;
        udderVolume = 0.0;
    }

    public String getName(){
        return name;
    }

    public double getCapacity(){
        return udderCapacity;
    }

    public double getAmount(){
        return udderVolume;
    }

    public String toString(){
        String cow = String.format("%s %.1f/%.1f\n",name,Math.ceil(udderVolume),Math.ceil(udderCapacity));
        return cow;
    }

    public double milk(){
        double amount = udderVolume;
        udderVolume = 0;
        return amount;
    }

    public void liveHour(){
        udderVolume += 1.176*random.nextDouble()+0.7;
        if(udderVolume >= udderCapacity){
            udderVolume = udderCapacity;
        }
    }


}
