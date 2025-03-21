package controllers;

import dto.Flight;
import services.FlightService;
import org.springframework.web.bind.annotation.*;
import java.util.Comparator;
import java.util.List;

@RestController
@RequestMapping("/flights")
public class FlightController {
    private final FlightService flightService51;

    public FlightController(FlightService flightService51) {
        this.flightService51 = flightService51;
    }

    @GetMapping
    public List<Flight> getFlights51(@RequestParam(required = false) String sort51) {
        List<Flight> flights51 = flightService51.getAvailableFlights51();
        if ("asc".equals(sort51)) {
            flights51.sort(Comparator.comparing(Flight::getFlightNumber51));
        }
        return flights51;
    }
}
