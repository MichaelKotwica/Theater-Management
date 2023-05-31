import java.time.LocalDateTime;
import java.util.UUID;

public class Reservation {

    private UUID id;

    private LocalDateTime created;

    public String description;

    public LocalDateTime startTime;

    public UUID showTimeID;

    public UUID customerID;

    public Reservation() {
        
    }
}
