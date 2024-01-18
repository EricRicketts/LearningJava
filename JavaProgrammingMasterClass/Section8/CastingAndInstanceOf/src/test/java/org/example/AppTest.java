package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppTest {

    String expected, result;

    @Test
    public void testCastToAdventureMovie() {
        /*
            Adventure jaws = Movie.getMovie("Adventure", "Jaws");
            the above statement will not compile because it cannot
            be guaranteed to return an Adventure type with the above
            code.  If a Comedy is returned this would not be an
            Adventure.  We can solve this with casting types as shown
            below.
        */
        Adventure jaws = (Adventure) Movie.getMovie("Adventure", "Jaws");
        Assertions.assertEquals("Adventure", jaws.getClass().getSimpleName());
    }

    @Test
    public void testCastToObject() {
        Object comedy = Movie.getMovie("Comedy", "Airplane");
        // comedy.watchMovie(); this will not compile because comedy was cast to an Object class
        // and there is no watchMovie method on the Object class.  However, as shown below
        // the comedy is still of type Comedy because this is what was returned from the
        // getMovie call.
        Assertions.assertEquals("Comedy", comedy.getClass().getSimpleName());
    }

    @Test
    public void testCastToMovieClass() {
        Object scienceFiction = Movie.getMovie("ScienceFiction", "Dune");
        Movie scienceFictionMovie = (Movie) scienceFiction;
        expected = "Dune is a ScienceFiction film.\n" +
                "... Bad Aliens do Bad Stuff\n" +
                "... Space Guys Chase Aliens\n" +
                "... Planet Blows Up.\n";
        result = scienceFictionMovie.watchMovie();
        Assertions.assertEquals(expected, result);
        //  scienceFiction.watchScienceFiction(); will not compile because scienceFictionMovie
        //  was cast as a Movie object thus it inherits all the methods of the Movie class but
        // not the ScienceFiction class.
    }

    @Test
    public void testCastToComedyClass() {
        // with a more specific cast we get not only the methods
        // on the Comedy class but was also get the inherited methods
        // from the movie class.
        Object comedy = Movie.getMovie("Comedy", "The Jerk");
        Comedy comedyMovie = (Comedy) comedy;
        expected = "Watching a Comedy movie.";
        result = comedyMovie.watchComedy();
        Assertions.assertEquals(expected, result);
        expected = "The Jerk is a Comedy film.\n" +
                "... Something funny happens\n" +
                "... Something even funnier happens\n" +
                "... Happy ending.\n";
        result = comedyMovie.watchMovie();
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testVarCastToMovie() {
        // here we are using var and the variable type is determined by
        // the return type which is Movie, the compiler sees a Movie
        // class and will return that type
        var airplane = Movie.getMovie("Comedy", "Airplane");
        expected = "Airplane is a Comedy film.\n" +
                "... Something funny happens\n" +
                "... Something even funnier happens\n" +
                "... Happy ending.\n";
        result = airplane.watchMovie();
        Assertions.assertEquals(expected, result);
        // airplane.watchComedy; will not compile as Movie does not have a
        // watchComedy method on it
    }

    @Test
    public void testVarCastToAdventure() {
        // Here the cast was to the Adventure class, so all methods including those
        // inherited from Movie are available to the reference variable
        var indianaJones = (Adventure) Movie.getMovie("Adventure", "Indiana Jones");
        expected = "Watching an Adventure movie.";
        result = indianaJones.watchAdventure();
        Assertions.assertEquals(expected, result);
    }
}
