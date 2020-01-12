package DatabaseModel;

import Helpers.IEntity;

public class Airport implements IEntity {

    private int id;
    private String name;
    private int cityId;
    private City city;

    public Airport(int id, String name, int cityId, City city) {
        this.id = id;
        this.name = name;
        this.cityId = cityId;
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }
}
