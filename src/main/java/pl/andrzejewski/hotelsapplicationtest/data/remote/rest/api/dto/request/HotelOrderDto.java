package pl.andrzejewski.hotelsapplicationtest.data.remote.rest.api.dto.request;

public class HotelOrderDto {
    private Integer id;
    private Integer roomsId;
    private Integer count;

    public HotelOrderDto() {
    }

    public HotelOrderDto(Integer id, Integer roomsId, Integer count) {
        this.id = id;
        this.roomsId = roomsId;
        this.count = count;
    }

    public Integer getId() {
        return id;
    }

    public Integer getRoomsId() {
        return roomsId;
    }

    public Integer getCount() {
        return count;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setRoomsId(Integer roomsId) {
        this.roomsId = roomsId;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}
