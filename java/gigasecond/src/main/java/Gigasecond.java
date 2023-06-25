import java.time.LocalDate;
import java.time.LocalDateTime;


public class Gigasecond {
    private LocalDateTime date;
    private final long GIGASECOND = 1000000000;

    public Gigasecond(LocalDate moment) {
        this.date = moment.atStartOfDay(); // convert LocalDate into LocalDateTime
    }

    public Gigasecond(LocalDateTime moment) {
        this.date = moment;
    }

    public LocalDateTime getDateTime() {
        return date.plusSeconds(GIGASECOND);
    }
}