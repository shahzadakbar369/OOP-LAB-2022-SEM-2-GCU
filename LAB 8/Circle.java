public class Circle extends ShapeWithArea implements Displayable{

    private long centerX;
    private long centerY;
    private double radius;

    public Circle(long centerX, long centerY, double radius){
        this.centerX=centerX;
        this.centerY=centerY;
        this.radius=radius;
        calcArea();
    }

    public long getCenterX(){
        return centerX;
    }
    public long getCenterY(){
        return centerY;
    }

    @Override
    public double calcArea(){
        area = 3.1459*radius*radius;
        return 0;
    }

    @Override
    public void display(){

        System.out.println("Circle: ");
        System.out.println("Center X: " + centerX);
        System.out.println("Center Y: " + centerY);
        System.out.println("Radius: " + radius);
        System.out.println("Area: "+ area);
    }


    @Override
    public void displayWithPrecision(int precision) {
        System.out.println("Cricle: ");
        System.out.println("CenterX: "+centerX);
        System.out.println("CenterY: "+centerY);
        System.out.println("Radius: "+radius);
        System.out.printf("Area: "+"%."+precision+"f",area);

    }

}
