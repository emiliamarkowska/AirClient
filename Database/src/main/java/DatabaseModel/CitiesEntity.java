package DatabaseModel;

import Helpers.IEntity;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "CITIES", schema = "ADMIN", catalog = "")
public class CitiesEntity implements IEntity {
    private long cityId;
    private String cityName;
    private Collection<AirportsEntity> airportsByCityId;
    private CountriesEntity countriesByCountryId;

    @Id
    @Column(name = "CITY_ID", nullable = false, precision = 0)
    public long getCityId() {
        return cityId;
    }

    public void setCityId(long cityId) {
        this.cityId = cityId;
    }

    @Basic
    @Column(name = "CITY_NAME", nullable = false, length = 255)
    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CitiesEntity that = (CitiesEntity) o;

        if (cityId != that.cityId) return false;
        if (cityName != null ? !cityName.equals(that.cityName) : that.cityName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (cityId ^ (cityId >>> 32));
        result = 31 * result + (cityName != null ? cityName.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "citiesByCityId")
    public Collection<AirportsEntity> getAirportsByCityId() {
        return airportsByCityId;
    }

    public void setAirportsByCityId(Collection<AirportsEntity> airportsByCityId) {
        this.airportsByCityId = airportsByCityId;
    }

    @ManyToOne
    @JoinColumn(name = "COUNTRY_ID", referencedColumnName = "COUNTRY_ID", nullable = false)
    public CountriesEntity getCountriesByCountryId() {
        return countriesByCountryId;
    }

    public void setCountriesByCountryId(CountriesEntity countriesByCountryId) {
        this.countriesByCountryId = countriesByCountryId;
    }
}
