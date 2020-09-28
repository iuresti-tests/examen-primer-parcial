package uaslp.enginering.exam.model;

public class Room {
    private final String description;
    private final RoomStatus status;
    private int number;

    public Room(int roomNumber, String roomDescription, RoomStatus roomStatus) {
        this.number = roomNumber;
        this.description = roomDescription;
        this.status = roomStatus;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public RoomStatus getStatus() {
        return status;
    }
}
