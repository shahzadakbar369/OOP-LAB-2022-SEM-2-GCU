public class BattleShip extends Ship {
    private int missileCapacity;

    public BattleShip(String name, String yearBuilt, int missileCapacity) {
        super(name, yearBuilt);
        this.missileCapacity = missileCapacity;
    }

    public int getMissileCapacity() {
        return missileCapacity;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Missile Capacity: " + missileCapacity);
    }
}
//BattleShip.java:

//        This class extends the Ship class and represents a battle ship.
//        It includes an additional member variable
//        missileCapacity (int) to store the total number of missiles the battle ship carries.
//        The constructor takes the ship's name, yearBuilt, and missileCapacity as parameters.
//        It provides a getter method to retrieve the missileCapacity value.
//        The print() method is overridden to display only the ship's name and missile capacity.