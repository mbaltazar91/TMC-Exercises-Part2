package personnel;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employees {

    private List<Person> employees;

    public Employees(){
        employees = new ArrayList<Person>();
    }

    public void add(Person person){
        employees.add(person);
    }

    public void add(List<Person> people){
        employees.addAll(people);
    }

    public void fire(Education education){
        Iterator<Person> i = employees.iterator();
        while(i.hasNext()){
            Person p = i.next();
            if(p.getEducation()==education){
                i.remove();
            }
        }
    }

    public void print(){
        Iterator<Person> i = employees.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }

    public void print(Education education){
        Iterator<Person> i = employees.iterator();
        while(i.hasNext()){
            Person p = i.next();
            if(p.getEducation()==education){
                System.out.println(p);
            }
        }
    }


}
