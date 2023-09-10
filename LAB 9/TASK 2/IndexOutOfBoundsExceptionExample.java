public class IndexOutOfBoundsExceptionExample {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3 };
        try {
            int index = 5;
            int value = numbers[index];
            System.out.println("Value at index " + index + ": " + value);
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("IndexOutOfBoundsException occurred: " + ex.getMessage());
        }
    }
}
