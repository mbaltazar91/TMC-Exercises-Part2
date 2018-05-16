package reference;


import reference.comparator.FilmComparator;
import reference.domain.Film;
import reference.domain.Person;
import reference.domain.Rating;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        RatingRegister ratings = new RatingRegister();


        Film goneWithTheWind = new Film("Gone with the Wind");
        Film theBridgesOfMadisonCounty = new Film("The Bridges of Madison County");
        Film eraserhead = new Film("Eraserhead");

        Person matti = new Person("Matti");
        Person pekka = new Person("Pekka");
        Person mikke = new Person("Mikke");
        Person bob = new Person("Bob");

        ratings.addRating(matti, goneWithTheWind, Rating.GOOD);
        ratings.addRating(matti, theBridgesOfMadisonCounty, Rating.GOOD);
        ratings.addRating(matti, eraserhead, Rating.GOOD);

        ratings.addRating(pekka, goneWithTheWind, Rating.FINE);
        ratings.addRating(pekka, theBridgesOfMadisonCounty, Rating.GOOD);
        ratings.addRating(pekka, eraserhead, Rating.MEDIOCRE);


        ratings.addRating(bob, goneWithTheWind, Rating.FINE);
        ratings.addRating(bob, theBridgesOfMadisonCounty, Rating.GOOD);
        ratings.addRating(bob, eraserhead, Rating.MEDIOCRE);


        Reference ref = new Reference(ratings);
        Film recommended = ref.recommendFilm(mikke);
        System.out.println("The film recommended to Michael is: " + recommended);
        System.out.println(ref.getMaxSimilarity(matti));
    }

}

