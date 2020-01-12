package DatabaseModel;

import Helpers.IEntity;

import java.text.SimpleDateFormat;


public class EventLog implements IEntity {

    private int id;
    private int userId;
    private User user;
    private String eventType;
    private SimpleDateFormat eventTime;
    private String description;

    public EventLog(int id, int userId, User user, String eventType, SimpleDateFormat eventTime, String description) {
        this.id = id;
        this.userId = userId;
        this.user = user;
        this.eventType = eventType;
        this.eventTime = eventTime;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public SimpleDateFormat getEventTime() {
        return eventTime;
    }

    public void setEventTime(SimpleDateFormat eventTime) {
        this.eventTime = eventTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
