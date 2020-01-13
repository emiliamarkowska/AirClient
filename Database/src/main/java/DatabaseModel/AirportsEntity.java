package DatabaseModel;

import Helpers.IEntity;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "AIRPORTS", schema = "ADMIN", catalog = "")
public class AirportsEntity implements IEntity {
    private long airportId;
    private String airportName;
    private CitiesEntity citiesByCityId;
    private Collection<FlightsEntity> flightsByAirportId;
    private Collection<FlightsEntity> flightsByAirportId_0;

    @Id
    @Column(name = "AIRPORT_ID", nullable = false, precision = 0)
    public long getAirportId() {
        return airportId;
    }

    public void setAirportId(long airportId) {
        this.airportId = airportId;
    }

    @Basic
    @Column(name = "AIRPORT_NAME", nullable = false, length = 255)
    public String getAirportName() {
        return airportName;
    }

    public void setAirportName(String airportName) {
        this.airportName = airportName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AirportsEntity that = (AirportsEntity) o;

        if (airportId != that.airportId) return false;
        if (airportName != null ? !airportName.equals(that.airportName) : that.airportName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (airportId ^ (airportId >>> 32));
        result = 31 * result + (airportName != null ? airportName.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "CITY_ID", referencedColumnName = "CITY_ID", nullable = false)
    public CitiesEntity getCitiesByCityId() {
        return citiesByCityId;
    }

    public void setCitiesByCityId(CitiesEntity citiesByCityId) {
        this.citiesByCityId = citiesByCityId;
    }

    @OneToMany(mappedBy = "airportsByFromId")
    public Collection<FlightsEntity> getFlightsByAirportId() {
        return flightsByAirportId;
    }

    public void setFlightsByAirportId(Collection<FlightsEntity> flightsByAirportId) {
        this.flightsByAirportId = flightsByAirportId;
    }

    @OneToMany(mappedBy = "airportsByToId")
    public Collection<FlightsEntity> getFlightsByAirportId_0() {
        return flightsByAirportId_0;
    }

    public void setFlightsByAirportId_0(Collection<FlightsEntity> flightsByAirportId_0) {
        this.flightsByAirportId_0 = flightsByAirportId_0;
    }
}
