package structural.facade;

import java.time.LocalDateTime;

public class FacadeRunner {
    public static void main(String[] args) {
        VacationAgencyService service = new VacationAgencyService(new HotelService(), new AirlineService());
        service.reserve("Bangalore", "Ahmedabad", LocalDateTime.now().plusDays(5), 5);
    }
}
