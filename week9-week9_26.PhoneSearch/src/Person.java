import java.util.HashSet;
import java.util.Set;

public class Person implements Comparable<Person> {

    private String name;
    private Set<String> numbers;
    private Set<String> addresses;


    public Person(String name){
        this.name = name;
        numbers = new HashSet<String>();
        addresses = new HashSet<String>();

    }

    public String getName(){
        return name;
    }

    public Set<String> getNumbers(){
        return numbers;
    }

    public Set<String> getAddresses(){
        return addresses;
    }

    public void addNumber(String number){
        numbers.add(number);
    }

    public void addAddress(String address){
        addresses.add(address);
    }

    public int compareTo(Person person){
        return this.name.compareTo(person.name);
    }
}
