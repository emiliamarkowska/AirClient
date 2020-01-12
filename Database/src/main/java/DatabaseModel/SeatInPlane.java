package DatabaseModel;

import Helpers.IEntity;

public class SeatInPlane implements IEntity {

    private int id;
    private String locationDescription;
    private  String seatClass;

    public SeatInPlane(int id, String locationDescription, String seatClass) {
        this.id = id;
        this.locationDescription = locationDescription;
        this.seatClass = seatClass;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLocationDescription() {
        return locationDescription;
    }

    public void setLocationDescription(String locationDescription) {
        this.locationDescription = locationDescription;
    }

    public String getSeatClass() {
        return seatClass;
    }

    public void setSeatClass(String seatClass) {
        this.seatClass = seatClass;
    }
}
