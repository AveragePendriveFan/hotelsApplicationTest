package pl.andrzejewski.hotelsapplicationtest.data.remote.rest.api.dto.response;

import java.util.List;

public class HotelListDto {
    private List<HotelDto> hotels;

    public HotelListDto() {
    }

    public List<HotelDto> getHotels() {
        return hotels;
    }

    public void setHotels(List<HotelDto> hotels) {
        this.hotels = hotels;
    }
}

