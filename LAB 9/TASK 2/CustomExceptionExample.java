public class CustomExceptionExample {
    static int computeDivision(int a, int b) throws DivisionbyZeroException {
        if (b == 0) {
            throw new DivisionbyZeroException("Division by zero");
        }
        return a / b;
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try {
            int result = computeDivision(a, b);
            System.out.println("Result: " + result);
        } catch (DivisionbyZeroException ex) {
            System.out.println("Custom exception caught: " + ex.getMessage());
        }
    }
}