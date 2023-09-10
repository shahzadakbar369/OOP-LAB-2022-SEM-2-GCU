public class Main {
    public static void main(String[] args) {
        Car car = new Car("ABC123", 5);
        Truck truck = new Truck("XYZ789", 10000.0);

        System.out.println("Car License Plate: " + car.licensePlate);
        System.out.println("Car Number of Seats: " + car.getNumSeats());

        System.out.println("Truck License Plate: " + truck.licensePlate);
        System.out.println("Truck Max Load Capacity: " + truck.getMaxLoadCapacity());
    }
}
