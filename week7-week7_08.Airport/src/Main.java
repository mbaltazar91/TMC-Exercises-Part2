import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Airport airport = new Airport();
        System.out.println("Airport panel\n-------------------\n");
        while(true){
            System.out.println("Choose operation: ");
            System.out.print("[1] Add airplane\n[2] Add flight\n[x] Exit\n> ");
            String choice = reader.next();

            if(choice.equals("x")){
                break;
            }
            if(choice.equals("1")){
                airport.addPlane(reader);
            }
            if(choice.equals("2")){
                airport.addFlight(reader);
            }

        }

        System.out.println("\nFlight service\n------------\n");
        while(true){
            System.out.println("Choose operation: ");
            System.out.print("[1] Print planes\n[2] Print flights\n[3] Print plane info\n[x] Quit\n> ");
            String choice = reader.next();
            if(choice.equals("x")){
                break;
            }
            if(choice.equals("1")){
                airport.printPlanes();
            }
            if(choice.equals("2")){
                airport.printFlights();
            }
            if(choice.equals("3")){
                airport.printPlaneInfo(reader);
            }
        }
    }
}

