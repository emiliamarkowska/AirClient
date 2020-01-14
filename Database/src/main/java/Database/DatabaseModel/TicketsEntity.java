package Database.DatabaseModel;

import Database.Helpers.IEntity;

import javax.persistence.*;

@Entity
@Table(name = "TICKETS", schema = "ADMIN", catalog = "")
public class TicketsEntity implements IEntity {
    private long ticketId;
    private double price;
    private String passengerName;
    private String passengerSurname;
    private SeatsInPlaneEntity seatsInPlaneBySeatId;
    private UsersEntity usersByUserId;

    @Id
    @Column(name = "TICKET_ID", nullable = false, precision = 0)
    public long getTicketId() {
        return ticketId;
    }

    public void setTicketId(long ticketId) {
        this.ticketId = ticketId;
    }

    @Basic
    @Column(name = "PRICE", nullable = false, precision = 0)
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Basic
    @Column(name = "PASSENGER_NAME", nullable = false, length = 150)
    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    @Basic
    @Column(name = "PASSENGER_SURNAME", nullable = false, length = 150)
    public String getPassengerSurname() {
        return passengerSurname;
    }

    public void setPassengerSurname(String passengerSurname) {
        this.passengerSurname = passengerSurname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TicketsEntity that = (TicketsEntity) o;

        if (ticketId != that.ticketId) return false;
        if (Double.compare(that.price, price) != 0) return false;
        if (passengerName != null ? !passengerName.equals(that.passengerName) : that.passengerName != null)
            return false;
        if (passengerSurname != null ? !passengerSurname.equals(that.passengerSurname) : that.passengerSurname != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = (int) (ticketId ^ (ticketId >>> 32));
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (passengerName != null ? passengerName.hashCode() : 0);
        result = 31 * result + (passengerSurname != null ? passengerSurname.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "SEAT_ID", referencedColumnName = "SEAT_ID", nullable = false)
    public SeatsInPlaneEntity getSeatsInPlaneBySeatId() {
        return seatsInPlaneBySeatId;
    }

    public void setSeatsInPlaneBySeatId(SeatsInPlaneEntity seatsInPlaneBySeatId) {
        this.seatsInPlaneBySeatId = seatsInPlaneBySeatId;
    }

    @ManyToOne
    @JoinColumn(name = "USER_ID", referencedColumnName = "USER_ID", nullable = false)
    public UsersEntity getUsersByUserId() {
        return usersByUserId;
    }

    public void setUsersByUserId(UsersEntity usersByUserId) {
        this.usersByUserId = usersByUserId;
    }

}
