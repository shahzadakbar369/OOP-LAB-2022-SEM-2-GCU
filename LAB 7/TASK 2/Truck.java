public class Truck extends Vehicle {
    private double maxLoadCapacity;

    public Truck(String licensePlate, double maxLoadCapacity) {
        this.licensePlate = licensePlate;
        this.maxLoadCapacity = maxLoadCapacity;
    }

    public double getMaxLoadCapacity() {
        return maxLoadCapacity;
    }
	}
