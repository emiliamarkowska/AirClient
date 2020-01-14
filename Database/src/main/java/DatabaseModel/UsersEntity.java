package DatabaseModel;

import Helpers.IEntity;

import javax.persistence.*;
import java.sql.Time;
import java.util.Collection;

@Entity
@Table(name = "USERS", schema = "ADMIN", catalog = "")
public class UsersEntity implements IEntity {
    private long userId;
    private String login;
    private String nameUser;
    private String surnameUser;
    private String email;
    private Time creationDate;
    private Time dayOfBirth;
    private boolean isAdmin;
    private boolean isActive;
    private String hashedPasswd;
    private Collection<EventsLogEntity> eventsLogsByUserId;
    private Collection<TicketsEntity> ticketsByUserId;

    @Id
    @Column(name = "USER_ID", nullable = false, precision = 0)
    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "LOGIN", nullable = false, length = 255)
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @Basic
    @Column(name = "NAME_USER", nullable = false, length = 50)
    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    @Basic
    @Column(name = "SURNAME_USER", nullable = false, length = 50)
    public String getSurnameUser() {
        return surnameUser;
    }

    public void setSurnameUser(String surnameUser) {
        this.surnameUser = surnameUser;
    }

    @Basic
    @Column(name = "EMAIL", nullable = false, length = 50)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "CREATION_DATE", nullable = false)
    public Time getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Time creationDate) {
        this.creationDate = creationDate;
    }

    @Basic
    @Column(name = "DAY_OF_BIRTH", nullable = false)
    public Time getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(Time dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    @Basic
    @Column(name = "IS_ADMIN", nullable = false, precision = 0)
    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    @Basic
    @Column(name = "IS_ACTIVE", nullable = false, precision = 0)
    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    @Basic
    @Column(name = "HASHED_PASSWD", nullable = false, length = 50)
    public String getHashedPasswd() {
        return hashedPasswd;
    }

    public void setHashedPasswd(String hashedPasswd) {
        this.hashedPasswd = hashedPasswd;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UsersEntity that = (UsersEntity) o;

        if (userId != that.userId) return false;
        if (isAdmin != that.isAdmin) return false;
        if (isActive != that.isActive) return false;
        if (login != null ? !login.equals(that.login) : that.login != null) return false;
        if (nameUser != null ? !nameUser.equals(that.nameUser) : that.nameUser != null) return false;
        if (surnameUser != null ? !surnameUser.equals(that.surnameUser) : that.surnameUser != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (creationDate != null ? !creationDate.equals(that.creationDate) : that.creationDate != null) return false;
        if (dayOfBirth != null ? !dayOfBirth.equals(that.dayOfBirth) : that.dayOfBirth != null) return false;
        if (hashedPasswd != null ? !hashedPasswd.equals(that.hashedPasswd) : that.hashedPasswd != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (userId ^ (userId >>> 32));
        result = 31 * result + (login != null ? login.hashCode() : 0);
        result = 31 * result + (nameUser != null ? nameUser.hashCode() : 0);
        result = 31 * result + (surnameUser != null ? surnameUser.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (creationDate != null ? creationDate.hashCode() : 0);
        result = 31 * result + (dayOfBirth != null ? dayOfBirth.hashCode() : 0);
        result = 31 * result + (isAdmin ? 1 : 0);
        result = 31 * result + (isActive ? 1 : 0);
        result = 31 * result + (hashedPasswd != null ? hashedPasswd.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "usersByUserId")
    public Collection<EventsLogEntity> getEventsLogsByUserId() {
        return eventsLogsByUserId;
    }

    public void setEventsLogsByUserId(Collection<EventsLogEntity> eventsLogsByUserId) {
        this.eventsLogsByUserId = eventsLogsByUserId;
    }

    @OneToMany(mappedBy = "usersByUserId")
    public Collection<TicketsEntity> getTicketsByUserId() {
        return ticketsByUserId;
    }

    public void setTicketsByUserId(Collection<TicketsEntity> ticketsByUserId) {
        this.ticketsByUserId = ticketsByUserId;
    }

}
