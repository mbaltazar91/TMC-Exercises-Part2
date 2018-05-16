
public class Main {

    public static void addSuitcasesFullOfBricks(Container container){

        for(int i = 1; i<=100; i++){
            Suitcase s = new Suitcase(100);
            Thing thing = new Thing("brick",i);
            s.addThing(thing);
            container.addSuitcase(s);
            }

        }


    public static void main(String[] args) {

        Container container = new Container(1000);
        addSuitcasesFullOfBricks(container);
        System.out.println(container);
    }

}
