package controllers;
import dto.Ticket;
import services.TicketService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.time.LocalDateTime;

@RestController
@RequestMapping("/tickets")
public class TicketController {
    private final TicketService ticketService51;

    public TicketController(TicketService ticketService51) {
        this.ticketService51 = ticketService51;
    }

    @PostMapping
    public ResponseEntity<Ticket> createTicket51(@RequestBody Ticket ticket51) {
        if (ticket51.getFlightNumber51() == null || ticket51.getTravelerName51() == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        ticket51.setBookingTime51(LocalDateTime.now());
        Ticket createdTicket51 = ticketService51.registerBooking51(ticket51);
        return new ResponseEntity<>(createdTicket51, HttpStatus.CREATED);
    }
}
