package boxes;

public class Thing {

    private String name;
    private int weight;

    public Thing(String name, int weight) throws IllegalArgumentException {
        if(weight<0){
            throw new IllegalArgumentException();
        }
        this.name = name;
        this.weight = weight;
    }

    public Thing(String name) {
        this(name, 0);
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public int hashCode(){
        return name.hashCode();
    }

    @Override
    public boolean equals(Object object){
        return this.hashCode()==object.hashCode();
    }

}
