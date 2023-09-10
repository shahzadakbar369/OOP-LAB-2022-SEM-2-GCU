public class Rectangle extends ShapeWithArea implements Displayable{
    private long width;
    private long length;
    public Rectangle(long width, long length){
        this.width=width;
        this.length=length;
        calcArea();
    }

    public long getWidth(){
        return width;
    }

    public long getLength(){
        return length;
    }

    @Override
    public double calcArea(){
        area=length*width;
        return area;
    }

    @Override
    public void display(){

        System.out.println("Rectangle: ");
        System.out.println("Width: " + width);
        System.out.println("Length: " + length);
        System.out.println("Area: "+ area);
    }
    @Override
    public void displayWithPrecision(int precision) {

        System.out.println("Rectangle: ");
        System.out.println("Width: " + width);
        System.out.println("Length: " + length);
        System.out.printf("Area: "+"%."+precision+"f",area);

    }
}
