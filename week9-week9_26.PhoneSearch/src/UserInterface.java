import java.util.Scanner;

public class UserInterface {

    private Scanner reader;
    private PhoneAddressBook book;

    public UserInterface(){
        reader = new Scanner(System.in);
        book = new PhoneAddressBook();
    }

    public void start(){
        printMenu();
        while(true){
            System.out.print("\ncommand: ");
            String command = reader.next();
            if(command.equals("x")){
                break;
            }
            if(command.equals("1")){
                addANumber();
            }

            if(command.equals("2")){
               searchForNumber();
            }

            if(command.equals("3")){
                searchForPerson();
            }

            if(command.equals("4")){
              addAnAddress();
            }

            if(command.equals("5")){
                searchForInfo();
            }

            if(command.equals("6")){
                removeInfo();
            }

            if(command.equals("7")){
                filteredSearch();
            }

        }
    }

    public void printMenu(){
        System.out.println("phone search\navailable operations:");
        System.out.println(" 1 add a number");
        System.out.println(" 2 search for a number");
        System.out.println(" 3 search for a person by phone number");
        System.out.println(" 4 add an address");
        System.out.println(" 5 search for personal information");
        System.out.println(" 6 delete personal information");
        System.out.println(" 7 filtered listing");
        System.out.println(" x quit\n");
    }

    public void addANumber(){
        System.out.print("whose number: ");
        String name = reader.next();
        System.out.print("number: ");
        String number = reader.next();
        book.addNumber(name,number);
    }

    public void searchForNumber(){
        System.out.print("whose number: ");
        String name = reader.next();
        book.searchName(name);
    }

    public void searchForPerson(){
        System.out.print("number: ");
        String number = reader.next();
        book.searchNumber(number);
    }

    public void addAnAddress(){
        System.out.print("whose address: ");
        String name = reader.next();
        reader.nextLine();
        System.out.print("street: ");
        String street = reader.nextLine();
        System.out.print("city: ");
        String city = reader.nextLine();
        String address = street + " " + city;
        book.addAddress(name,address);
    }

    public void searchForInfo(){
        System.out.print("whose information: ");
        String name = reader.next();
        book.searchInfo(name);
    }

    public void removeInfo(){
        System.out.print("whose information: ");
        String name = reader.next();
        book.removeInfo(name);
    }

    public void filteredSearch(){
        System.out.print("keyword (if empty, all listed): ");
        reader.nextLine();
        String keyword = reader.nextLine();
        book.filteredSearch(keyword);
    }


}
