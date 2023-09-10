public class SafeArray {
    private int[] data;
    private int length;


    public SafeArray() {
        this.data = new int[100];
        this.length = 100;
    }


    public SafeArray(int size) {
        this.data = new int[size];
        this.length = size;
    }

    public int getIndex(int index) {
        if (index >= 0 && index < length) {
            return data[index];
        } else {
            System.out.println("Error: Index out of range.");
            return 0;
        }
    }

    public void setIndex(int index, int value) {
        if (index >= 0 && index < length) {
            data[index] = value;
        } else {
            System.out.println("Error: Index out of range.");
        }
    }

    public int maxValue() {
        int max = data[0];
        for (int i = 1; i < length; i++) {
            if (data[i] > max) {
                max = data[i];
            }
        }
        return max;
    }

    public int minValue() {
        int min = data[0];
        for (int i = 1; i < length; i++) {
            if (data[i] < min) {
                min = data[i];
            }
        }
        return min;
    }

    public int sum() {
        int sum = 0;
        for (int i = 0; i < length; i++) {
            sum += data[i];
        }
        return sum;
    }

    public static void main(String[] args) {

        SafeArray array1 = new SafeArray();


        array1.setIndex(0, 10);
        array1.setIndex(1, 20);
        array1.setIndex(2, 30);


        System.out.println("Value at index 0: " + array1.getIndex(0));
        System.out.println("Value at index 1: " + array1.getIndex(1));
        System.out.println("Value at index 2: " + array1.getIndex(2));
        System.out.println("Value at index 3: " + array1.getIndex(3)); // Index out of range error


        System.out.println("Max Value: " + array1.maxValue());


        System.out.println("Min Value: " + array1.minValue());


        System.out.println("Sum: " + array1.sum());


        SafeArray array2 = new SafeArray(5);


        array2.setIndex(0, 5);
        array2.setIndex(1, 15);
        array2.setIndex(2, 25);


        System.out.println("Value at index 0: " + array2.getIndex(0));
        System.out.println("Value at index 1: " + array2.getIndex(1));
        System.out.println("Value at index 2: " + array2.getIndex(2));
        System.out.println("Value at index 3: " + array2.getIndex(3));


        System.out.println("Max Value: " + array2.maxValue());
        System.out.println("Min Value: " + array2.minValue());
        System.out.println("Sum: " + array2.sum());
    }
}
//    SafeArray Class:
//
//        This class represents a safe way to access and modify elements in an array of integers.
//
//        The class has two private member variables: data (an array of integers) and length (the length of the array).
//        It provides the following functionalities:
//        Default Constructor:
//
//        The default constructor initializes an instance of the SafeArray class without any parameters.
//        It creates an empty array with a default size of 100 by initializing data as a new integer array with a length of 100.
//        The length variable is set to 100, representing the size of the array.
//        Parameterized Constructor with Size:
//
//        The parameterized constructor with size allows you to create an instance of the SafeArray class with a specified size.
//        It takes an integer parameter representing the size of the array.
//        Inside the constructor, the data variable is initialized as a new integer array with the given size.
//        The length variable is set to the specified size.
//        getIndex(int index) Method:
//
//        This method allows you to safely retrieve the value at a specified index in the array.
//        It takes an index parameter representing the index of the element you want to retrieve.
//        The method first checks if the index is within the valid range by comparing it with length.
//        If the index is within the range (from 0 to length - 1), the method returns the value at that index using the data array.
//        If the index is outside the valid range, it displays an error message stating that the index is out of range and returns 0 instead.
//        setIndex(int index, int value) Method:
//
//        This method allows you to safely set the value at a specified index in the array.
//        It takes an index parameter representing the index of the element you want to modify and a value parameter representing the new value to set.
//        The method first checks if the index is within the valid range by comparing it with length.
//        If the index is within the range, the method updates the element at that index in the data array with the provided value.
//        If the index is outside the valid range, it displays an error message stating that the index is out of range and does not modify the array.
//        maxValue() Method:
//
//        This method finds and returns the maximum value present in the array.
//        It initializes a variable max with the value at the first index of the data array (data[0]).
//        The method then iterates through the data array starting from the second index (i = 1) and compares each element with max.
//        If an element is greater than max, it updates the value of max.
//        After iterating through the entire array, the method returns the maximum value stored in max.
//        minValue() Method:
//
//        This method finds and returns the minimum value present in the array.
//        It initializes a variable min with the value at the first index of the data array (data[0]).
//        The method then iterates through the data array starting from the second index (i = 1) and compares each element with min.
//        If an element is smaller than min, it updates the value of min.
//        After iterating through the entire array, the method returns the minimum value stored in min.
//        sum() Method:
//
//        This method calculates and returns the sum of all elements in the array.
//        It initializes a variable sum with a value of 0.
//        The method iterates through the data array and adds each element to the sum.
//        After iterating through the entire array, the method returns the total sum stored in sum.
//        Main Class:
//
//        The main method inside the SafeArray class is used to demonstrate the functionalities of the SafeArray class.
//
//        Creating a SafeArray object with the default constructor:
//
//        An instance of the SafeArray class named array1 is created using the default constructor.
//        Since no parameters are provided, the SafeArray object array1 is initialized with an empty array of size 100.
//        Setting and retrieving values from array1:
//
//        The setIndex method is called on array1 to set values at specific indices.
//        The getIndex method is called on array1 to retrieve values at specific indices.
//        The getIndex method is intentionally called with an index that is out of range to demonstrate the error message.
//        Calculating the maximum value, minimum value, and sum of array1:
//
//        The maxValue, minValue, and sum methods are called on array1 to calculate the respective values.
//        The results are printed to the console.
//        Creating a SafeArray object with the parameterized constructor:
//
//        Another instance of the SafeArray class named array2 is created using the parameterized constructor.
//        The size of the array for array2 is specified as 5.
//        Setting and retrieving values from array2:
//
//        The setIndex method is called on array2 to set values at specific indices.
//        The getIndex method is called on array2 to retrieve values at specific indices.
//        The getIndex method is intentionally called with an