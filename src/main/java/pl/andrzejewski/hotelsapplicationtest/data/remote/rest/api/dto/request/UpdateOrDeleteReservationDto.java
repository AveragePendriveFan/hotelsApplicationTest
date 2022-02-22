package pl.andrzejewski.hotelsapplicationtest.data.remote.rest.api.dto.request;

import java.util.List;

public class UpdateOrDeleteReservationDto {
    private ReservationStatusDto status;
    private List<HotelOrderDto> hotels;
    private List<PersonOrderDto> persons;

    public UpdateReservationDto() {
    }

    public UpdateReservationDto(ReservationStatusDto status, List<HotelOrderDto> hotels, List<PersonOrderDto> persons) {
        this.status = status;
        this.hotels = hotels;
        this.persons = persons;
    }

    public ReservationStatusDto getStatus() {
        return status;
    }

    public List<HotelOrderDto> getHotels() {
        return hotels;
    }

    public List<PersonOrderDto> getPersons() {
        return persons;
    }

    public void setStatus(ReservationStatusDto status) {
        this.status = status;
    }

    public void setHotels(List<HotelOrderDto> hotels) {
        this.hotels = hotels;
    }

    public void setPersons(List<PersonOrderDto> persons) {
        this.persons = persons;
    }
}

