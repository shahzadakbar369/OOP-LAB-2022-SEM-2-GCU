public class Person {
    private String name;
    private int birthYear;
    private int deathYear;

    // Parameterized Constructor
    public Person(String name, int birthYear, int deathYear) {
        this.name = name;
        this.birthYear = birthYear;
        this.deathYear = deathYear;
    }

    // Copy Constructor
    public Person(Person other) {
        this.name = other.name;
        this.birthYear = other.birthYear;
        this.deathYear = other.deathYear;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public int getDeathYear() {
        return deathYear;
    }

    // Print method
    public void printPerson() {
        System.out.println("Name: " + name);
        System.out.println("Birth Year: " + birthYear);
        if (deathYear == -1) {
            System.out.println("Death Year: Still alive");
        } else {
            System.out.println("Death Year: " + deathYear);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Create p1 using the parameterized constructor
        Person p1 = new Person("Abdul Sattar Edhi", 1928, 2016);

        // Create p2 using the copy constructor with p1 as the source object
        Person p2 = new Person(p1);

        // Create p3 using the parameterized constructor
        Person p3 = new Person("John Doe", 1990, -1);

        // Print the information of p1, p2, and p3
        System.out.println("Person p1:");
        p1.printPerson();

        System.out.println("Person p2 (copy of p1):");
        p2.printPerson();

        System.out.println("Person p3:");
        p3.printPerson();

        // Create p4 with no death information
        Person p4 = new Person("Jane Smith", 1985, -1);
        System.out.println("Person p4:");
        p4.printPerson();
    }
}
