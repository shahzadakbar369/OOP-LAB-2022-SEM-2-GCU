public class Car extends Vehicle {
    private int numSeats;

    public Car(String licensePlate, int numSeats) {
        this.licensePlate = licensePlate;
        this.numSeats = numSeats;
    }

    public int getNumSeats() {
        return numSeats;
    }
}