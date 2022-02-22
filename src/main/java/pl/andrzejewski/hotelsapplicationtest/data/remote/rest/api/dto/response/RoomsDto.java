package pl.andrzejewski.hotelsapplicationtest.data.remote.rest.api.dto.response;

import java.math.BigDecimal;

public class RoomsDto {
    private Integer id;
    private Integer beds;
    private float price;

    public RoomsDto() {
    }

    public RoomsDto(Integer id, Integer beds, float price) {
        this.id = id;
        this.beds = beds;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public Integer getBeds() {
        return beds;
    }

    public float getPrice() {
        return price;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setBeds(Integer beds) {
        this.beds = beds;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
