package DatabaseModel;

public class City implements IEntity {

    private int id;
    private String name;
    private int countryId;
    private Country country;

    public City(int id, String name, int countryId, Country country) {
        this.id = id;
        this.name = name;
        this.countryId = countryId;
        this.country = country;
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

    public int getCountryId() {
        return countryId;
    }

    public void setCountryId(int countryId) {
        this.countryId = countryId;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }
}
