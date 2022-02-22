package pl.andrzejewski.hotelsapplicationtest.data.remote.rest.api.dto.response;

import java.util.List;

public class ReservationCollectionDto {
    private List<ReservationDto> reservations;

    public ReservationCollectionDto() {
    }

    public List<ReservationDto> getReservations() {
        return reservations;
    }

    public void setReservations(List<ReservationDto> reservations) {
        this.reservations = reservations;
    }
}
