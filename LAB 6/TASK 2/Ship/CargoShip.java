public class CargoShip extends Ship {
    private int cargoCapacity;

    public CargoShip(String name, String yearBuilt, int cargoCapacity) {
        super(name, yearBuilt);
        this.cargoCapacity = cargoCapacity;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Cargo Capacity: " + cargoCapacity + " tons");
    }
}
//CargoShip.java:

//        This class extends the Ship class and represents a cargo ship.
//        It includes an additional member variable cargoCapacity (int)
//        to store the cargo capacity of the ship in tonnage.
//        The constructor takes the ship's name, yearBuilt, and cargoCapacity as parameters.
//        It also provides a getter method to retrieve the cargoCapacity value.
//        The print() method is overridden to display only the ship's name and cargo capacity.