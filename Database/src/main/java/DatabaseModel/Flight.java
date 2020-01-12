package DatabaseModel;

import java.sql.Timestamp;

public class Flight implements IEntity {

    private int id;
    private int fromId;
    private  Airport from;
    private int toId;
    private Airport to;
    private Timestamp departureTime;
    private Timestamp arrivalTime;
    private float distanceInKm;

    public Flight(int id, int fromId, Airport from, int toId, Airport to, Timestamp departureTime, Timestamp arrivalTime, float distanceInKm) {
        this.id = id;
        this.fromId = fromId;
        this.from = from;
        this.toId = toId;
        this.to = to;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.distanceInKm = distanceInKm;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFromId() {
        return fromId;
    }

    public void setFromId(int fromId) {
        this.fromId = fromId;
    }

    public Airport getFrom() {
        return from;
    }

    public void setFrom(Airport from) {
        this.from = from;
    }

    public int getToId() {
        return toId;
    }

    public void setToId(int toId) {
        this.toId = toId;
    }

    public Airport getTo() {
        return to;
    }

    public void setTo(Airport to) {
        this.to = to;
    }

    public Timestamp getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Timestamp departureTime) {
        this.departureTime = departureTime;
    }

    public Timestamp getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(Timestamp arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public float getDistanceInKm() {
        return distanceInKm;
    }

    public void setDistanceInKm(float distanceInKm) {
        this.distanceInKm = distanceInKm;
    }
}

