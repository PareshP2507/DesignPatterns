package structural.facade;

import java.time.LocalDateTime;

/** The class responsible for Airline related services. */
public class AirlineService {

    public void reserve(String cityFrom, String cityTo, LocalDateTime date) {
        System.out.printf("Flight reserver from %s to %s on %s", cityFrom, cityTo, date);
    }
}
