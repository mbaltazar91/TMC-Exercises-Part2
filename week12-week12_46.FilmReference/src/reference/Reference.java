package reference;

import reference.comparator.FilmComparator;
import reference.comparator.PersonComparator;
import reference.domain.Film;
import reference.domain.Person;
import reference.domain.Rating;

import java.util.*;

public class Reference {

    private RatingRegister ratings;

    public Reference(RatingRegister ratings) {
        this.ratings = ratings;
    }

    public int sum(List<Integer> list){
        int sum = 0;
        for(int i : list){
            sum += i;
        }
        return sum;
    }

    public Person sort(Map<Person,Integer> map){
        Person person = null;
        Integer maxValue = -1;
        for(Person p : map.keySet()){
            if(map.get(p)>=maxValue){
                maxValue = map.get(p);
                person = p;
            }
        }
        return person;
    }

    public Person getMaxSimilarity(Person person) {
        Map<Person, Integer> similarity = new HashMap<Person, Integer>();

        for (Person p : ratings.reviewers()) {
            if (!p.equals(person)) {
                List<Integer> rating = new ArrayList<Integer>();
                for (Film film : ratings.getPersonalRatings(p).keySet()) {
                    if (ratings.getPersonalRatings(person).keySet().contains(film)) {
                        rating.add(ratings.getPersonalRatings(person).get(film).getValue() * ratings.getPersonalRatings(p).get(film).getValue());
                    }
                }
                similarity.put(p, sum(rating));
            }
        }
            
            System.out.println(similarity);
            return sort(similarity);

    }

    public Film recommendFilm(Person person) {
        List<Film> films = new ArrayList<Film>();
        for (Film film : ratings.filmRatings().keySet()) {
            films.add(film);
        }
        System.out.println(films);
        Collections.sort(films, new FilmComparator(ratings.filmRatings()));
        for (Film film : films) {
            if(ratings.getPersonalRatings(person)==null||!ratings.getPersonalRatings(person).keySet().contains(film)){
                return film;
            }
        }

            return null;

    }
}
