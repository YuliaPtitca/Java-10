public class AfishaManager {
    private static String[] movies = new String[0];
    private static int limit;
    public AfishaManager(int limit) {
        this.limit = limit;
    }

    public AfishaManager() {

        limit = 10;
    }


    public void add(String movie) {
        String[] tmp = new String[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = movie;
        movies = tmp;
    }

    public static String[] findAll() {

        return movies;
    }

    public static String[] findLast() {
        int resultSize = limit < movies.length ? limit : movies.length;
        String[] result = new String[resultSize];
        for (int i = 0; i < resultSize; i++){
            result[i] = movies[movies.length - 1 - i];
        }
        return result;
    }
}
