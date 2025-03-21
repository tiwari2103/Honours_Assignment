package services;
import dto.Ticket;
import org.springframework.stereotype.Service;
import java.util.stream.Collectors;
import java.util.List;
import java.util.Optional;
import java.util.ArrayList;

@Service
public class TicketService {
    private final List<Ticket> bookingRecords51 = new ArrayList<>();

    public List<Ticket> getAllReservations51() {
        return bookingRecords51;
    }

    public Ticket findReservationByNumber51(String ticketNumber51) {
        return bookingRecords51.stream().filter(t ->
                t.getTicketNumber51().equals(ticketNumber51)).findFirst().orElse(null);
    }

    public Ticket registerBooking51(Ticket ticket51) {
        bookingRecords51.add(ticket51);
        return ticket51;
    }
}

