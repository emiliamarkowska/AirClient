package DatabaseModel;

import Helpers.IEntity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "EVENTS_LOG", schema = "ADMIN", catalog = "")
public class EventsLogEntity implements IEntity {
    private long eventId;
    private String eventType;
    private Timestamp eventTime;
    private String eventDesc;
    private UsersEntity usersByUserId;

    @Id
    @Column(name = "EVENT_ID", nullable = false, precision = 0)
    public long getEventId() {
        return eventId;
    }

    public void setEventId(long eventId) {
        this.eventId = eventId;
    }

    @Basic
    @Column(name = "EVENT_TYPE", nullable = false, length = 255)
    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    @Basic
    @Column(name = "EVENT_TIME", nullable = false)
    public Timestamp getEventTime() {
        return eventTime;
    }

    public void setEventTime(Timestamp eventTime) {
        this.eventTime = eventTime;
    }

    @Basic
    @Column(name = "EVENT_DESC", nullable = true, length = 255)
    public String getEventDesc() {
        return eventDesc;
    }

    public void setEventDesc(String eventDesc) {
        this.eventDesc = eventDesc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EventsLogEntity that = (EventsLogEntity) o;

        if (eventId != that.eventId) return false;
        if (eventType != null ? !eventType.equals(that.eventType) : that.eventType != null) return false;
        if (eventTime != null ? !eventTime.equals(that.eventTime) : that.eventTime != null) return false;
        if (eventDesc != null ? !eventDesc.equals(that.eventDesc) : that.eventDesc != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (eventId ^ (eventId >>> 32));
        result = 31 * result + (eventType != null ? eventType.hashCode() : 0);
        result = 31 * result + (eventTime != null ? eventTime.hashCode() : 0);
        result = 31 * result + (eventDesc != null ? eventDesc.hashCode() : 0);
        return result;
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
