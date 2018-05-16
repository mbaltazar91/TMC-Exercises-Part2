package reference.comparator;

import reference.domain.Film;
import reference.domain.Person;
import reference.domain.Rating;

import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class FilmComparator implements Comparator<Film> {

    private Map<Film, List<Rating>> ratings;

    public FilmComparator(Map<Film, List<Rating>> ratings) {
        this.ratings = ratings;
    }

    public int averageRating(Film film) {
        int sum = 0;
        for (Rating rating : ratings.get(film)) {
            sum += rating.getValue();
        }
        return sum / ratings.get(film).size();
    }

    public int compare(Film f1, Film f2) {
        return averageRating(f2) - averageRating(f1);
    }

}
