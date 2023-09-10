
    public class CruiseShip extends Ship {
        private int maxPassengers;

        public CruiseShip(String name, String yearBuilt, int maxPassengers) {
            super(name, yearBuilt);
            this.maxPassengers = maxPassengers;
        }

        public int getMaxPassengers() {
            return maxPassengers;
        }

        @Override
        public void print() {
            super.print();
            System.out.println("Max Passengers: " + maxPassengers);
        }
    }
//    CruiseShip.java:

//            This class extends the Ship class and represents a cruise ship.
//            It adds an additional member variable
//            maxPassengers (int) to store the maximum number of passengers the cruise ship can accommodate.
//            It provides a constructor that takes the ship's name, yearBuilt, and maxPassengers as parameters.
//            The class also includes a getter method to retrieve the maxPassengers value.
//            The print() method is overridden to display the ship's name, year of construction, and the maximum number of passengers.

