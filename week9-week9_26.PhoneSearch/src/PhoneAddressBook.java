import java.util.*;


public class PhoneAddressBook {

    private Set<Person> people;

    public PhoneAddressBook() {
        people = new HashSet<Person>();
    }

    public Set<Person> getPeople() {
        return people;
    }

    public void addNumber(String name, String number) {
        boolean cont = false;
        for (Person person : this.getPeople()) {
            if (person.getName().equals(name)) {
                cont = true;
                break;
            }
        }
        if (!cont) {
            this.getPeople().add(new Person(name));
        }
        for (Person person : this.people) {
            if (person.getName().equals(name)) {
                person.addNumber(number);
            }
        }
    }


    public void searchName(String name) {
        for (Person person : this.people) {
            if (person.getName().equals(name)) {
                for (String num : person.getNumbers()) {
                    System.out.println(" " + num);
                }
                return;
            }
        }
        System.out.println("  not found");
    }

    public void searchNumber(String number) {
        for (Person person : this.people) {
            if (person.getNumbers().contains(number)) {
                System.out.println(" " + person.getName());
                return;
            }

        }
        System.out.println(" not found");
    }

    public void addAddress(String name, String address) {
        boolean cont = false;
        for (Person person : this.getPeople()) {
            if (person.getName().equals(name)) {
                cont = true;
                break;
            }
        }
        if (!cont) {
            this.getPeople().add(new Person(name));
        }
        for (Person person : this.people) {
            if (person.getName().equals(name)) {
                person.addAddress(address);
            }
        }
    }


    public void searchInfo(String name) {
        boolean contains = false;
        for (Person person : people) {
            if (person.getName().equals(name.trim())) {
                contains = true;
                break;
            }
        }
        if (!contains) {
            System.out.println("  not found");
            return;
        }

        for (Person person : people) {
            if (person.getName().equals(name)) {
                if (person.getAddresses().isEmpty()) {
                    System.out.println("  address unknown");
                } else {
                    for (String address : person.getAddresses()) {
                        System.out.println("  address: " + address);
                    }
                }
                if (person.getNumbers().isEmpty()) {
                    System.out.println("  phone number not found");
                    break;
                }
                else{
                    System.out.println("  phone numbers:");
                }
                    for(String number : person.getNumbers()) {
                        System.out.println("   " + number);
                }

            }
        }
    }

    public void removeInfo(String name){
        for(Person person : people){
            if(person.getName().equals(name)){
                people.remove(person);
            }
        }
    }

    public void filteredSearch(String keyword){
        boolean contains = false;
        boolean found = false;
        List<Person> people = new ArrayList<Person>(this.people);
        Collections.sort(people);
        for(Person person : people){
            if(person.getName().contains(keyword)){
                contains = true;

            }
            for(String number : person.getNumbers()){
                if(number.contains(keyword)){
                    contains = true;

                }
            }
            for(String address : person.getAddresses()){
                if(address.contains(keyword)){
                    contains = true;

                }
            }
            if(keyword.isEmpty()||contains){
                found = true;
                System.out.println("\n " + person.getName());
                this.searchInfo(person.getName());
            }
            contains = false;

        }
        if(!found){
            System.out.println(" keyword not found");
        }
    }
}

