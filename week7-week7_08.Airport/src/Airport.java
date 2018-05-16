import java.util.ArrayList;
import java.util.Scanner;

public class Airport {

    private ArrayList<Airplane> planes;

    public Airport(){
        planes = new ArrayList<Airplane>();
    }

    public void addPlane(Scanner reader){
        System.out.print("Give plane ID: ");
        String id = reader.next();
        System.out.print("Give plane capacity: ");
        int capacity = Integer.parseInt(reader.next());
        planes.add(new Airplane(id,capacity));
    }

    public void addFlight(Scanner reader){
        System.out.print("Give plane ID: ");
        String id = reader.next();
        System.out.print("Give departure airport code: ");
        String dep = reader.next();
        System.out.print("Give destination airport code: ");
        String arr = reader.next();
        for(Airplane plane : planes){
            if(plane.getId().equals(id)){
                plane.addFlight(new Flight(dep,arr));
            }
        }
    }

    public void printPlanes(){
        for(Airplane plane : planes){
            System.out.println(plane);
        }
    }

    public void printFlights(){
        for(Airplane plane : planes){
            for(Flight flight: plane.getFlights()){
                System.out.println(plane + " " + flight);

            }
        }
    }

    public void printPlaneInfo(Scanner reader){
        System.out.print("Give plane ID: ");
        String id = reader.next();
        for(Airplane plane : planes){
            if(plane.getId().equals(id)){
                System.out.println(plane);
            }
        }
    }

}