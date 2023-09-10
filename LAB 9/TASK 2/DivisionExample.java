public class DivisionExample {
    static int computeDivision(int a, int b) {
        int res = 0;
        try {
            System.out.println("Attempting division...");
            res = a / b;
            System.out.println("Division successful");
        } catch (NumberFormatException ex) {
            System.out.println("NumberFormatException occurred");
        } catch (ArithmeticException ex) {
            System.out.println("ArithmeticException occurred: " + ex.getMessage());
        } finally {
            System.out.println("Finally block executed regardless of exception");
        }
        return res;
    }

    public static void main(String args[]) {
        int a = 1;
        int b = 0;
        try {
            int i = computeDivision(a, b);
        } catch (ArithmeticException ex) {
            System.out.println("Exception caught in main: " + ex.getMessage());
        }
    }
}
