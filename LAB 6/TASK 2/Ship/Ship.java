public class Ship {
    private String name;
    private String yearBuilt;

    public Ship(String name, String yearBuilt) {
        this.name = name;
        this.yearBuilt = yearBuilt;
    }

    public String getName() {
        return name;
    }

    public String getYearBuilt() {
        return yearBuilt;
    }

    public void print() {
        System.out.println("Ship Name: " + name);
        System.out.println("Year Built: " + yearBuilt);
    }
}
//Ship.java:

//        This class represents a general ship.
//        It has two private member variables:
//        name (String) to store the name of the ship and
//        yearBuilt (String) to store the year the ship was built.
//        The class provides a constructor to initialize the name and yearBuilt variables,
//        as well as getter methods to retrieve their values.
//        The print() method is used to display the ship's name and the year it was built.