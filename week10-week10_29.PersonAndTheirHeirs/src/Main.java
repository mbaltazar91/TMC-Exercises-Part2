import people.Person;
import people.Student;
import people.Teacher;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void printDepartment(List<Person> people){
        for(Person person : people){
            System.out.println(person);
        }
    }

    public static void main(String[] args) {
        List<Person> people = new ArrayList<Person>();
        people.add(new Person("Bob","sfsfs sdfsf"));
        people.add(new Student("Dave","sdrtret dada"));
        people.add(new Teacher("Jim","qewerwer rewrew",4500));
        printDepartment(people);
    }

}
