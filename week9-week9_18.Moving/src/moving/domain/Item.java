package moving.domain;


public class Item implements Thing,Comparable<Item>{

    private String name;
    private int volume;

    public Item(String name, int volume){
        this.name = name;
        this.volume = volume;
    }

    public int getVolume(){
        return volume;
    }

    public String getName(){
        return name;
    }

    @Override
    public String toString(){
        String item = String.format("%s (%d dm^3)",name,volume);
        return item;
    }

    @Override
    public int compareTo(Item item){
        return this.volume - item.volume;
    }
}


