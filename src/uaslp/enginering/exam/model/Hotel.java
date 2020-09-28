package uaslp.enginering.exam.model;

import java.util.ArrayList;

public class Hotel {
    private ArrayList<Reservation> reservations;
    private ArrayList<Room> rooms;
    private String name;


    public Hotel(String hotelName) {
        reservations = new ArrayList<>();
        rooms = new ArrayList<>();
        name = hotelName;
    }

    public void reserveRoom(int roomNumber, Guest guest, String arrivalDate, int nights) {
        Reservation reservation = new Reservation();

        reservation.setRoomNumber(roomNumber);
        reservation.setArrivalDate(arrivalDate);
        reservation.setGuest(guest);
        reservation.setNights(nights);

        reservations.add(reservation);
    }

    public ArrayList<Reservation> getReservations() {
        return reservations;
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public String getName(){
        return name;
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }
}
