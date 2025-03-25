package structural.facade;

import java.time.LocalDateTime;

public class VacationAgencyService {
    
    private final HotelService hotelService;
    private final AirlineService airlineService;

    public VacationAgencyService(HotelService hotelService, AirlineService airlineService) {
        this.hotelService = hotelService;
        this.airlineService = airlineService;
    }

    public void reserve(String cityFrom, String cityTo, LocalDateTime dateFrom, int days) {
        airlineService.reserve(cityFrom, cityTo, dateFrom);
        airlineService.reserve(cityTo, cityFrom, dateFrom.plusDays(days));
        hotelService.bookHotel(cityTo, dateFrom, dateFrom.plusDays(days));
    }
}
