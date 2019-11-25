package Opgave1;

public class Rectangle {
    private double width = 1 ;
    private double height = 1;

    public Rectangle() {}
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }


    public double getArea(){
        double area = width*height;
        return area;
    }
    public double getPerimeter(){
        double perimeter = (width+height)*2;
        return perimeter;
    }

    public static void main(String[] args) {
        Rectangle a = new Rectangle();
        a.height = 40;
        a.width = 4;

        Rectangle b = new Rectangle(3.5, 35.9);
        System.out.println("Width: " + a.width + " Height: " + a.height + " Area: " + a.getArea() + " Perimeter: " + a.getPerimeter());
        System.out.println("Width: " + b.width + " Height: " + b.height + " Area: " + b.getArea() + " Perimeter: " + b.getPerimeter());
    }


}
