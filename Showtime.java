import java.time.LocalDateTime;
import java.util.UUID;

public class Showtime {

    private UUID movieId;
    
    private UUID auditoriumId;

    private LocalDateTime time;

    private Movie movie;

    private Showtime (Movie movie) {
        this.movie = movie;
    }

}
