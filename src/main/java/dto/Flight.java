package dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;
import java.time.Duration;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Flight {
    private String flightNumber51;
    private String carrierName51;
    private String originCity51;
    private String destinationCity51;
    private String takeoffTime51;
    private String landingTime51;
    private List<String> availableDates51;
    private int totalSeats51;
    private Duration flightDuration51;
    private double basePrice51;
    private boolean isInternational51;
    private String aircraftType51;
    private String mealOption51;
}
