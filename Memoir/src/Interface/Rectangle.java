package Interface;

public class Rectangle implements Shape{
    int l = 50;
    int b = 30;
    @Override
    public void getArea() {
        System.out.println("Area of rectancle is " +(l*b));
    }
    public void getPerimeter() {
        System.out.println("Perimeter of rectancle is " + (2*(l+b)));
    }
}
