package pl.andrzejewski.hotelsapplicationtest.data.remote.rest.api.dto.response;

public class ReservationStatusDto {
    private ReservationStatusDto status;

    public ReservationStatusDto() {
    }

    public ReservationStatusDto(ReservationStatusDto status) {
        this.status = status;
    }

    public ReservationStatusDto getStatus() {
        return status;
    }

    public void setStatus(ReservationStatusDto status) {
        this.status = status;
    }

}

