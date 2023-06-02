import java.util.*;

public class MovieService  {

    public Map<UUID, Movie> movieMap = new HashMap<UUID,Movie>();
    
    public Movie createMovie(String title, String description, int length) {
        return new Movie(title, description, length);
    }
    public Movie getMovieById(UUID id) {
        return movieMap.get(id);
    }
    
    public Collection<Movie> getMoviesByTitle() {
        return movieMap.values();
    }
    public Movie updateMovie(UUID id, Movie movieToUpdate) {
        return movieMap.replace(id, movieToUpdate);
    }
    public void deleteMovie(Movie movieToDelete) {
        movieMap.values().remove(movieToDelete);
    }
    public List<Movie> getAllMovies() {
        List<Movie> ret = new ArrayList<Movie>();
        Iterable<Movie> allMovies = movieMap.values();
        allMovies.forEach(ret::add);
        return ret;
    }
    
}