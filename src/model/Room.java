package model;

public class Room implements IRoom {
    public String roomNumber;
    public Double price;
    public RoomType enumeration;
    public Room(String roomNumber, Double price, RoomType enumeration) {
        this.roomNumber = roomNumber;
        this.price = price;
        this.enumeration = enumeration;
    }
    @Override
    public String getRoomNumber() {
        return this.roomNumber;
    }

    @Override
    public Double getRoomPrice() {
        return this.price;
    }

    @Override
    public RoomType getRoomType() {
        return this.enumeration;
    }

    @Override
    public boolean isFree() {
        return false;
    }

    @Override
    public String toString() {
        return "Room Number: " + this.roomNumber + "\nPrice: " + this.price + "\nRoom Type: " + this.enumeration + "\n";
    }
}
