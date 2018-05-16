package reference;

import reference.domain.Film;
import reference.domain.Person;
import reference.domain.Rating;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RatingRegister {

    private Map<Film,List<Rating>> ratings;
    private Map<Person,Map<Film,Rating>> personRatings;

    public RatingRegister(){
        ratings = new HashMap<Film,List<Rating>>();
        personRatings = new HashMap<Person,Map<Film, Rating>>();
    }

    public void addRating(Film film, Rating rating){
        if(!ratings.containsKey(film)){
            ratings.put(film, new ArrayList<Rating>());
        }

        ratings.get(film).add(rating);
    }

    public List<Rating> getRatings(Film film){
        for(Film f : ratings.keySet()){
            if(f.equals(film)){
                return ratings.get(f);
            }
        }
        return null;
    }

    public Map<Film, List<Rating>> filmRatings(){
        return ratings;
    }

    public void addRating(Person person, Film film, Rating rating){
        if(!personRatings.containsKey(person)){
            personRatings.put(person,new HashMap<Film,Rating>());
        }
        personRatings.get(person).put(film,rating);
        addRating(film,rating);
    }

    public Rating getRating(Person person, Film film){
        if(personRatings.get(person).containsKey(film)){
            return personRatings.get(person).get(film);
        }
        return Rating.NOT_WATCHED;
    }

    public Map<Film, Rating> getPersonalRatings(Person person){
        for(Person p : personRatings.keySet()){
            if(p.equals(person)){
                return personRatings.get(p);
            }
        }
        return new HashMap<Film,Rating>();


    }

    public List<Person> reviewers(){
        List<Person> reviewers = new ArrayList<Person>();
        for(Person p : personRatings.keySet()){
            reviewers.add(p);
        }
        return reviewers;
    }
}
