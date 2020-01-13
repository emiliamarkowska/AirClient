package DatabaseModel;

import Helpers.IEntity;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "COUNTRIES", schema = "ADMIN", catalog = "")
public class CountriesEntity implements IEntity {
    private long countryId;
    private String countryName;
    private Collection<CitiesEntity> citiesByCountryId;

    @Id
    @Column(name = "COUNTRY_ID", nullable = false, precision = 0)
    public long getCountryId() {
        return countryId;
    }

    public void setCountryId(long countryId) {
        this.countryId = countryId;
    }

    @Basic
    @Column(name = "COUNTRY_NAME", nullable = false, length = 255)
    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CountriesEntity that = (CountriesEntity) o;

        if (countryId != that.countryId) return false;
        if (countryName != null ? !countryName.equals(that.countryName) : that.countryName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (countryId ^ (countryId >>> 32));
        result = 31 * result + (countryName != null ? countryName.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "countriesByCountryId")
    public Collection<CitiesEntity> getCitiesByCountryId() {
        return citiesByCountryId;
    }

    public void setCitiesByCountryId(Collection<CitiesEntity> citiesByCountryId) {
        this.citiesByCountryId = citiesByCountryId;
    }
}
