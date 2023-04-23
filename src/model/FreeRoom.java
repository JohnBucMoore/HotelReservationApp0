package model;

public class FreeRoom extends Room {
    public FreeRoom(String roomNumber, Double price, RoomType enumeration) {
        super(roomNumber, 0.0, enumeration);
    }

    /**
     * use abstraction to extend Room class which implements IRoom interface and implement price using abstraction -
     * https://learn.udacity.com/nanodegrees/nd040-ent-cognizant/parts/cd0282/lessons/be330617-4efa-4faa-98e3-341c8928d6eb/concepts/654ef19f-ddb3-4159-8bc0-5dbd7e8f59ca
     * **/
    @Override
    public String toString() {
        return "Room Number: " + this.getRoomNumber() + "\nPrice: COMPLIMENTARY\n" + "Room Type: " + this.getRoomType();
    }
}
