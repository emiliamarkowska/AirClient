package DatabaseModel;

import Helpers.IEntity;

public class Ticket implements IEntity {

        private int flightId;
        private Flight flight;
        private int seatId;
        private SeatInPlane seatInPlane;
        private int userId;
        private User user;
        private float price;
        private String passengerName;
        private String passengerSurname;

        public Ticket(int flightId, Flight flight, int seatId, SeatInPlane seatInPlane,
                      int userId, User user, float price, String passengerName, String passengerSurname) {
            this.flightId = flightId;
            this.flight = flight;
            this.seatId = seatId;
            this.seatInPlane = seatInPlane;
            this.userId = userId;
            this.user = user;
            this.price = price;
            this.passengerName = passengerName;
            this.passengerSurname = passengerSurname;
        }

        public int getFlightId() {
            return flightId;
        }

        public void setFlightId(int flightId) {
            this.flightId = flightId;
        }

        public Flight getFlight() {
            return flight;
        }

        public void setFlight(Flight flight) {
            this.flight = flight;
        }

        public int getSeatId() {
            return seatId;
        }

        public void setSeatId(int seatId) {
            this.seatId = seatId;
        }

        public SeatInPlane getSeatInPlane() {
            return seatInPlane;
        }

        public void setSeatInPlane(SeatInPlane seatInPlane) {
            this.seatInPlane = seatInPlane;
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

        public float getPrice() {
            return price;
        }

        public void setPrice(float price) {
            this.price = price;
        }

        public String getPassengerName() {
            return passengerName;
        }

        public void setPassengerName(String passengerName) {
            this.passengerName = passengerName;
        }

        public String getPassengerSurname() {
            return passengerSurname;
        }

        public void setPassengerSurname(String passengerSurname) {
            this.passengerSurname = passengerSurname;
        }
    }

