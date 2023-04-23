package model;

public class FreeRoom extends Room {
    public FreeRoom(String roomNumber, Double price, RoomType enumeration) {
        super(roomNumber, 0.0, enumeration);
    }

    @Override
    public String toString() {
        return "Room Number: " + this.getRoomNumber() + "\nPrice: COMPLIMENTARY\n" + "Room Type: " + this.getRoomType();
    }
}
