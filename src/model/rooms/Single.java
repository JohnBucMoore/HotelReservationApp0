package model.rooms;

import model.Room;
import model.RoomType;

public class Single extends Room {
    public Single(String roomNumber, Double price, RoomType enumeration) {
        super(roomNumber, price, enumeration);
    }
}
