package DatabaseModel;

import Helpers.IEntity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;

@Entity
@Table(name = "FLIGHTS", schema = "ADMIN", catalog = "")
public class FlightsEntity implements IEntity {
    private long flightId;
    private Timestamp departureTime;
    private Timestamp arrivalTime;
    private double distanceInKm;
    private AirportsEntity airportsByFromId;
    private AirportsEntity airportsByToId;
    private Collection<SeatsInPlaneEntity> seatsInPlanesByFlightId;

    @Id
    @Column(name = "FLIGHT_ID", nullable = false, precision = 0)
    public long getFlightId() {
        return flightId;
    }

    public void setFlightId(long flightId) {
        this.flightId = flightId;
    }

    @Basic
    @Column(name = "DEPARTURE_TIME", nullable = false)
    public Timestamp getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Timestamp departureTime) {
        this.departureTime = departureTime;
    }

    @Basic
    @Column(name = "ARRIVAL_TIME", nullable = false)
    public Timestamp getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(Timestamp arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    @Basic
    @Column(name = "DISTANCE_IN_KM", nullable = false, precision = 0)
    public double getDistanceInKm() {
        return distanceInKm;
    }

    public void setDistanceInKm(double distanceInKm) {
        this.distanceInKm = distanceInKm;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FlightsEntity that = (FlightsEntity) o;

        if (flightId != that.flightId) return false;
        if (Double.compare(that.distanceInKm, distanceInKm) != 0) return false;
        if (departureTime != null ? !departureTime.equals(that.departureTime) : that.departureTime != null)
            return false;
        if (arrivalTime != null ? !arrivalTime.equals(that.arrivalTime) : that.arrivalTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = (int) (flightId ^ (flightId >>> 32));
        result = 31 * result + (departureTime != null ? departureTime.hashCode() : 0);
        result = 31 * result + (arrivalTime != null ? arrivalTime.hashCode() : 0);
        temp = Double.doubleToLongBits(distanceInKm);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "FROM_ID", referencedColumnName = "AIRPORT_ID", nullable = false)
    public AirportsEntity getAirportsByFromId() {
        return airportsByFromId;
    }

    public void setAirportsByFromId(AirportsEntity airportsByFromId) {
        this.airportsByFromId = airportsByFromId;
    }

    @ManyToOne
    @JoinColumn(name = "TO_ID", referencedColumnName = "AIRPORT_ID", nullable = false)
    public AirportsEntity getAirportsByToId() {
        return airportsByToId;
    }

    public void setAirportsByToId(AirportsEntity airportsByToId) {
        this.airportsByToId = airportsByToId;
    }

    @OneToMany(mappedBy = "flightsByFlightId")
    public Collection<SeatsInPlaneEntity> getSeatsInPlanesByFlightId() {
        return seatsInPlanesByFlightId;
    }

    public void setSeatsInPlanesByFlightId(Collection<SeatsInPlaneEntity> seatsInPlanesByFlightId) {
        this.seatsInPlanesByFlightId = seatsInPlanesByFlightId;
    }

}
