import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VehicleRegister {

    private Map<RegistrationPlate,String> plates;

    public VehicleRegister(){
        plates = new HashMap<RegistrationPlate,String>();
    }

    public boolean add(RegistrationPlate plate, String owner){
        if(!plates.containsKey(plate)){
            plates.put(plate,owner);
            return true;
        }
        return false;
    }

    public String get(RegistrationPlate plate){
        if(plates.containsKey(plate)){
            return plates.get(plate);
        }
        return null;
    }

    public boolean delete(RegistrationPlate plate){
        if(plates.containsKey(plate)){
            plates.remove(plate,plates.get(plate));
            return true;
        }
        return false;
    }

    public void printRegistrationPlates(){
        for(RegistrationPlate key : plates.keySet()){
            System.out.println(key);
        }
    }

    public void printOwners(){
        List<String> names = new ArrayList<String>();
        for(RegistrationPlate key : plates.keySet()){
            if(!names.contains(plates.get(key))) {
                names.add(plates.get(key));
                System.out.println(plates.get(key));
            }
        }
    }


}
    /**public boolean add(RegistrationPlate plate, String owner), which adds the parameter
    owner of the car which corresponds to the parameter registration plate.
        The method returns true if the car had no owner; if the car had an owner already, the method returns false and it doesn't do anything
public String get(RegistrationPlate plate), which returns the car owner which corresponds
        to the parameter register number. If the car was not registered, it returns null
public boolean delete(RegistrationPlate plate), which delete the information connected
        to the parameter registration plate. The method returns true if the information was deleted, and false if there was no information connetted to the parameter in the register.
        Attention: the vehicle register has to store the owner information into a
        HashMap<RegistrationPlate, String> owners object variable!

        Exercise 9.3: More for the Vehicle Register
        Add still the following methods to your VehicleRegister:

public void printRegistrationPlates(), which prints out all the registration plates stored
public void printOwners(), which prints all the car owners stored.
        Each owner's name has to be printed only once, even though they had more than one car**/