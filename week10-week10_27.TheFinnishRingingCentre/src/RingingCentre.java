import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RingingCentre {

    private Map<Bird, List<String>> observationPlaces;

    public RingingCentre() {
        observationPlaces = new HashMap<Bird, List<String>>();
    }

    public void observe(Bird bird, String place) {
        if (!observationPlaces.containsKey(bird)) {
            observationPlaces.put(bird, new ArrayList<String>());
        }
        observationPlaces.get(bird).add(place);
    }

    public void observations(Bird bird) {
        for (Bird b : observationPlaces.keySet()) {
            if (b.equals(bird)) {
                System.out.print(b);
                System.out.println(" observations: " + observationPlaces.get(b).size());
                for (String place : observationPlaces.get(bird)) {
                    System.out.println(place);
                }
            }
        }
        if (!observationPlaces.containsKey(bird)) {
            System.out.print(bird);
            System.out.println("observations: 0");
        }
    }
}

