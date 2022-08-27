import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AfishaManagerTest {

    @Test
    public void shouldFindAllAddMovie() {
        String movie1 = "film1";
        String movie2 = "film2";
        String movie3 = "film3";
        String movie4 = "film4";
        String movie5 = "film5";
        String movie6 = "film6";
        String movie7 = "film7";


        AfishaManager manager = new AfishaManager();
        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);
        manager.add(movie6);
        manager.add(movie7);

        String[] expected = {
                movie1,
                movie2,
                movie3,
                movie4,
                movie5,
                movie6,
                movie7,
        };

        String[] actual = AfishaManager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastAddMovieOverTen() {
        String movie1 = "film1";
        String movie2 = "film2";
        String movie3 = "film3";
        String movie4 = "film4";
        String movie5 = "film5";
        String movie6 = "film6";
        String movie7 = "film7";
        String movie8 = "film8";
        String movie9 = "film9";
        String movie10 = "film10";
        String movie11 = "film11";
        String movie12 = "film12";
        String movie13 = "film13";
        String movie14 = "film14";

        AfishaManager manager = new AfishaManager();
        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);
        manager.add(movie6);
        manager.add(movie7);
        manager.add(movie8);
        manager.add(movie9);
        manager.add(movie10);
        manager.add(movie11);
        manager.add(movie12);
        manager.add(movie13);
        manager.add(movie14);

        String[] expected = {
                movie14,
                movie13,
                movie12,
                movie11,
                movie10,
                movie9,
                movie8,
                movie7,
                movie6,
                movie5,
        };
        String[] actual = AfishaManager.findLast();

        Assertions.assertArrayEquals(actual, expected);
    }
    @Test
    public void shouldFindLastAddMovieOnlySeven() {
        String movie1 = "film1";
        String movie2 = "film2";
        String movie3 = "film3";
        String movie4 = "film4";
        String movie5 = "film5";
        String movie6 = "film6";
        String movie7 = "film7";
        String movie8 = "film8";
        String movie9 = "film9";
        String movie10 = "film10";
        String movie11 = "film11";


        AfishaManager manager = new AfishaManager(7);
        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);
        manager.add(movie6);
        manager.add(movie7);
        manager.add(movie8);
        manager.add(movie9);
        manager.add(movie10);
        manager.add(movie11);

        String[] expected = {
                movie11,
                movie10,
                movie9,
                movie8,
                movie7,
                movie6,
                movie5,
        };
        String[] actual = AfishaManager.findLast();

        Assertions.assertArrayEquals(actual, expected);
    }
}
