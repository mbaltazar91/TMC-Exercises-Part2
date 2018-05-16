package reference.comparator;

import reference.domain.Person;

import java.util.Comparator;
import java.util.Map;

public class PersonComparator implements Comparator<Person>{

    private Map<Person,Integer> personIdentities;

    public PersonComparator(Map<Person,Integer> personIdentities){
        this.personIdentities = personIdentities;
    }

    public int compare(Person p1, Person p2){
        return personIdentities.get(p2) - personIdentities.get(p1);
    }
}
