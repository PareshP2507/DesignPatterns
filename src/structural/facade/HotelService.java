package structural.facade;

import java.time.LocalDateTime;

/** The class responsible for Hotel related services. */
public class HotelService {

    public void bookHotel(String city, LocalDateTime from, LocalDateTime to) {
        System.out.printf("Hotel booked in %s from %s to %s", city, from, to);
    }
}
