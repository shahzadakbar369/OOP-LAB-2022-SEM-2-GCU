public class ShapeDriver {
    public static void main(String[] args) {
        Circle circle = new Circle(0,0, 5.0);
        Rectangle rectangle = new Rectangle(10, 20);

        System.out.println("Default Precision Display: ");
        circle.display();
        rectangle.display();

        System.out.println("/nCustom Precision Display: ");
        int customPrecision = 3;
        circle.displayWithPrecision(customPrecision);
        rectangle.displayWithPrecision(customPrecision);
    }
}
