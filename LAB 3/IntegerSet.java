import java.util.ArrayList;

public class IntegerSet {
    private ArrayList<Integer> set;
    private int maxSize;

    // Constructor
    public IntegerSet(int size) {
        maxSize = size;
        set = new ArrayList<>(maxSize);
        for (int i = 0; i < maxSize; i++) {
            set.add(0);
        }
    }


    public IntegerSet(IntegerSet otherSet) {
        this.maxSize = otherSet.maxSize;
        this.set = new ArrayList<>(otherSet.set);
    }

    // Insert an element into the set
    public void insertElement(int k) {
        if (k >= 0 && k < maxSize) {
            set.set(k, 1);
        } else {
            System.out.println("Error: Invalid element. Cannot insert into the set.");
        }
    }

    // Delete an element from the set
    public void deleteElement(int m) {
        if (m >= 0 && m < maxSize) {
            set.set(m, 0);
        } else {
            System.out.println("Error: Invalid element. Cannot delete from the set.");
        }
    }

    // Print the set
    public void printSet() {
        if (set.isEmpty()) {
            System.out.println("---");
        } else {
            for (int i = 0; i < maxSize; i++) {
                if (set.get(i) == 1) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        }
    }

    // Perform union of two sets
    public static IntegerSet unionOfSets(IntegerSet set1, IntegerSet set2) {
        if (set1.maxSize != set2.maxSize) {
            System.out.println("Error: Set sizes are different. Union not possible.");
            return null;
        }

        IntegerSet unionSet = new IntegerSet(set1.maxSize);
        for (int i = 0; i < set1.maxSize; i++) {
            if (set1.set.get(i) == 1 || set2.set.get(i) == 1) {
                unionSet.set.set(i, 1);
            }
        }

        return unionSet;
    }

    // Perform intersection of two sets
    public static IntegerSet intersectionOfSets(IntegerSet set1, IntegerSet set2) {
        if (set1.maxSize != set2.maxSize) {
            System.out.println("Error: Set sizes are different. Intersection not possible.");
            return null;
        }

        IntegerSet intersectionSet = new IntegerSet(set1.maxSize);
        for (int i = 0; i < set1.maxSize; i++) {
            if (set1.set.get(i) == 1 && set2.set.get(i) == 1) {
                intersectionSet.set.set(i, 1);
            }
        }

        return intersectionSet;
    }

    // Search for an element in the set
    public boolean findElement(int key) {
        if (key >= 0 && key < maxSize) {
            return set.get(key) == 1;
        } else {
            System.out.println("Error: Invalid element. Cannot search in the set.");
            return false;
        }
    }

    public static void main(String[] args) {
        // Create a set of size 10
        IntegerSet set1 = new IntegerSet(10);

        // Insert elements into set1
        set1.insertElement(2);
        set1.insertElement(4);
        set1.insertElement(6);
        set1.insertElement(8);
        set1.insertElement(10);

        // Print set1
        System.out.println("Set1:");
        set1.printSet();

        // Create another set using the copy constructor
        IntegerSet set2 = new IntegerSet(set1);

        // Delete elements from set2
        set2.deleteElement(4);
        set2.deleteElement(10);

        // Print set2
        System.out.println("Set2:");
        set2.printSet();

        // Perform union of set1 and set2
        IntegerSet unionSet = IntegerSet.unionOfSets(set1, set2);

        // Print unionSet
        System.out.println("Union Set:");
        if (unionSet != null) {
            unionSet.printSet();
        }

        // Perform intersection of set1 and set2
        IntegerSet intersectionSet = IntegerSet.intersectionOfSets(set1, set2);

        // Print intersectionSet
        System.out.println("Intersection Set:");
        if (intersectionSet != null) {
            intersectionSet.printSet();
        }


        System.out.println("Search Results:");
        System.out.println("Is 6 present in set1? " + set1.findElement(6));
        System.out.println("Is 12 present in set1? " + set1.findElement(12));
        System.out.println("Is -1 present in set1? " + set1.findElement(-1));
    }
}
//    IntegerSet Class:
//
//        This class represents a set of integers using an ArrayList of ones and zeros.
//
//        The class has two private member variables: set (an ArrayList<Integer>) to hold the set, and maxSize (an integer) to store the maximum size of the set.
//        It provides the following functionalities:
//
//        Constructor:
//
//        The constructor accepts an integer representing the size of the set and initializes it as the "empty set".
//        It creates a new ArrayList of integers with the specified size and initializes all elements to zero, indicating that the set is initially empty.
//        Copy Constructor:
//
//        The copy constructor initializes a new IntegerSet object with an already existing object.
//        It creates a deep copy of the set by creating a new ArrayList and copying the elements from the existing set into the new ArrayList.
//        insertElement(int k) Method:
//
//        This method allows you to insert a new integer k into the set.
//        It first checks if the value of k is within the valid range (between 0 and maxSize - 1).
//        If the value is within the range, it sets the corresponding element a[k] in the ArrayList to 1, indicating that k is in the set.
//        If the value is not within the range, it displays an error message indicating that the element cannot be inserted into the set.
//        deleteElement(int m) Method:
//
//        This method allows you to delete an integer m from the set.
//        It checks if the value of m is within the valid range (between 0 and maxSize - 1).
//        If the value is within the range, it sets the corresponding element a[m] in the ArrayList to 0, indicating that m is not in the set.
//        If the value is not within the range, it displays an error message indicating that the element cannot be deleted from the set.
//        printSet() Method:
//
//        This method prints the set as a list of numbers separated by spaces.
//        It iterates through the ArrayList and prints the index of each element that has a value of 1, indicating that the corresponding number is present in the set.
//        If the set is empty (all elements are zeros), it prints "---" to indicate an empty set.
//        unionOfSets(IntegerSet set1, IntegerSet set2) Method:
//
//        This static method creates a third set that represents the set-theoretic union of two existing sets (set1 and set2).
//        It checks if both input sets have the same size. If they have different sizes, it displays an error message and returns null.
//        It creates a new IntegerSet object (unionSet) with the same size as the input sets.
//        It iterates through the elements of set1 and set2 simultaneously and sets the corresponding element in unionSet to 1 if either or both input sets have a value of 1 at that index.
//        Finally, it returns the unionSet representing the union of the two input sets.
//        intersectionOfSets(IntegerSet set1, IntegerSet set2) Method:
//
//        This static method creates a third set that represents the set-theoretic intersection of two existing sets (set1 and set2).
//        It checks if both input sets have the same size. If they have different sizes, it displays an error message and returns null.
//        It creates a new IntegerSet object (intersectionSet) with the same size as the input sets.
//        It iterates through the elements of set1 and set2 simultaneously and sets the corresponding element in intersectionSet to 1 only if both input sets have a value of 1 at that index.
//        Finally, it returns the intersectionSet representing the intersection of the two input sets.
//        findElement(int key) Method:
//
//        This method searches for an integer key in the set.
//        It checks if the value of key is within the valid range (between 0 and maxSize - 1).
//        If the value is within the range, it checks the corresponding element in the ArrayList. If the element is 1, it means the key exists in the set and the method returns true. Otherwise, it returns false.
//        If the value is not within the range, it displays an error message indicating that the element cannot be searched in the set.
//        Main Class:
//
//        The main method inside the IntegerSet class is used to demonstrate the functionalities of the IntegerSet class.
//
//        Creating a set1 object with the constructor:
//
//        An instance of the IntegerSet class named set1 is created using the constructor.
//        The size of the set is specified as 10.
//        Inserting elements into set1:
//
//        The insertElement method is called on set1 to insert integers into the set.
//        Printing set1:
//
//        The printSet method is called on set1 to print the set.
//        Creating set2 using the copy constructor:
//
//        Another instance of the IntegerSet class named set2 is created using the copy constructor.
//        set2 is initialized with the same elements as set1.
//        Deleting elements from set2:
//
//        The deleteElement method is called on set2 to delete integers from the set.
//        Printing set2:
//
//        The printSet method is called on set2 to print the set.
//        Performing union and intersection of set1 and set2:
//
//        The unionOfSets method is called with set1 and set2 as parameters to compute the union of the two sets. The result is stored in unionSet.
//        The intersectionOfSets method is called with set1 and set2 as parameters to compute the intersection of the two sets. The result is stored in intersectionSet.
//        Printing the union and intersection sets:
//
//        The printSet method is called on unionSet and intersectionSet to print the respective sets.
//        Searching for elements in set1:
//
//        The findElement method is called on set1 to search for specific elements and display the search results.
//        This allows you to create and manipulate sets, perform set operations, and search for elements using the IntegerSet class.
