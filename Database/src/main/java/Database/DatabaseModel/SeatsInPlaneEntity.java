package Database.DatabaseModel;

import Database.Helpers.IEntity;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "SEATS_IN_PLANE", schema = "ADMIN", catalog = "")
public class SeatsInPlaneEntity implements IEntity {
    private long seatId;
    private long seatNo;
    private String locationDesc;
    private String seatClass;
    private long isFree;
    private FlightsEntity flightsByFlightId;
    private Collection<TicketsEntity> ticketsBySeatId;

    @Id
    @Column(name = "SEAT_ID", nullable = false, precision = 0)
    public long getSeatId() {
        return seatId;
    }

    public void setSeatId(long seatId) {
        this.seatId = seatId;
    }

    @Basic
    @Column(name = "SEAT_NO", nullable = false, precision = 0)
    public long getSeatNo() {
        return seatNo;
    }

    public void setSeatNo(long seatNo) {
        this.seatNo = seatNo;
    }

    @Basic
    @Column(name = "LOCATION_DESC", nullable = false, length = 255)
    public String getLocationDesc() {
        return locationDesc;
    }

    public void setLocationDesc(String locationDesc) {
        this.locationDesc = locationDesc;
    }

    @Basic
    @Column(name = "SEAT_CLASS", nullable = false, length = 255)
    public String getSeatClass() {
        return seatClass;
    }

    public void setSeatClass(String seatClass) {
        this.seatClass = seatClass;
    }

    @Basic
    @Column(name = "IS_FREE", nullable = false, precision = 0)
    public long getIsFree() {
        return isFree;
    }

    public void setIsFree(long isFree) {
        this.isFree = isFree;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SeatsInPlaneEntity that = (SeatsInPlaneEntity) o;

        if (seatId != that.seatId) return false;
        if (seatNo != that.seatNo) return false;
        if (isFree != that.isFree) return false;
        if (locationDesc != null ? !locationDesc.equals(that.locationDesc) : that.locationDesc != null) return false;
        if (seatClass != null ? !seatClass.equals(that.seatClass) : that.seatClass != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (seatId ^ (seatId >>> 32));
        result = 31 * result + (int) (seatNo ^ (seatNo >>> 32));
        result = 31 * result + (locationDesc != null ? locationDesc.hashCode() : 0);
        result = 31 * result + (seatClass != null ? seatClass.hashCode() : 0);
        result = 31 * result + (int) (isFree ^ (isFree >>> 32));
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "FLIGHT_ID", referencedColumnName = "FLIGHT_ID", nullable = false)
    public FlightsEntity getFlightsByFlightId() {
        return flightsByFlightId;
    }

    public void setFlightsByFlightId(FlightsEntity flightsByFlightId) {
        this.flightsByFlightId = flightsByFlightId;
    }

    @OneToMany(mappedBy = "seatsInPlaneBySeatId")
    public Collection<TicketsEntity> getTicketsBySeatId() {
        return ticketsBySeatId;
    }

    public void setTicketsBySeatId(Collection<TicketsEntity> ticketsBySeatId) {
        this.ticketsBySeatId = ticketsBySeatId;
    }

}
