package dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ticket {
    private String ticketNumber51;
    private String flightNumber51;
    private String travelerName51;
    private String contactEmail51;
    private boolean isVoid51;
    private String seatAssignment51;
    private LocalDateTime bookingTime51;
    private double pricePaid51;
    private String travelDate51;
    private boolean hasBaggage51;
    private String bookingReference51;
    private String ticketType51;

}
