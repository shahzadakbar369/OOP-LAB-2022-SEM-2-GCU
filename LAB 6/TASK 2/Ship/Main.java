public class Main {
    public static void main(String[] args) {
        Ship[] ships = new Ship[4];

        ships[0] = new Ship("Ship 1", "2000");
        ships[1] = new CruiseShip("Cruise Ship 1", "1995", 5000);
        ships[2] = new CargoShip("Cargo Ship 1", "2010", 10000);
        ships[3] = new BattleShip("Battle Ship 1", "1980", 50);

        for (Ship ship : ships) {
            ship.print();
            System.out.println("-------------------");
        }
    }
}
//    In the Main class, the main method is defined. It demonstrates the usage of the ship classes by creating an array of Ship references named ships.

        The first element of ships is assigned an instance of the Ship class, initialized with the name "Ship 1" and year built "2000".
//        The second element is assigned an instance of the CruiseShip class, initialized with the name "Cruise Ship 1", year built "1995", and a maximum passenger capacity of 5000.
//        The third element is assigned an instance of the CargoShip class, initialized with the name "Cargo Ship 1", year built "2010", and a cargo capacity of 10000 tons.
//        The fourth element is assigned an instance of the BattleShip class, initialized with the name "Battle Ship 1", year built "1980", and a missile capacity of 50.
//        The for-each loop iterates through each ship in the ships array and calls the print() method for each ship, which displays the ship's information.
//
//        When the program is executed, it creates instances of different ship classes, initializes their member variables, and displays their information using the print() method.
//
//        The output will show the ship's name, year built, and additional details based on the specific ship class. For example:
//
//        yaml
//        Copy code
//        Ship Name: Ship 1
//        Year Built: 2000
//        -------------------
//        Ship Name: Cruise Ship 1
//        Year Built: 1995
//        Max Passengers: 5000
//        -------------------
//        Ship Name: Cargo Ship 1
//        Year Built: 2010
//        Cargo Capacity: 10000 tons
//        -------------------
//        Ship Name: Battle Ship 1
//        Year Built: 1980
//        Missile Capacity: 50
//        -------------------
//        This demonstrates the functionality of the ship classes and their inheritance relationships.
//
//        Note: Each class should be saved in a separate file with the corresponding class name
//        (e.g., Ship.java, CruiseShip.java, CargoShip.java, BattleShip.java).
//        The Main class can be in the same file or a separate file named Main.java.
//        Compile and execute the Main class to see the output.
//
