package model.rooms;

import model.Room;
import model.RoomType;

public class Suite extends Room {
    public Suite(String roomNumber, Double price, RoomType enumeration) {
        super(roomNumber, price, enumeration);
    }
}
