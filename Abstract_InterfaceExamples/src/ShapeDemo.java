
abstract class Shape{

    abstract double calculateArea();

}
class Circle extends Shape{
    double radius;
    Circle(double radius){
        this.radius = radius;
    }

    @Override
    double calculateArea() {

        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape{
    int length;
    int width;
    Rectangle(int length , int width){
        this.length = length;
        this.width = width;
    }

    @Override
    double calculateArea() {
        return length * width;
    }
}
public class ShapeDemo {
    public static void main(String[] args) {

        Circle circle= new Circle(5);
        Rectangle rectangle = new Rectangle(10,5);

        System.out.println("Circle Area: " + circle.calculateArea());
        System.out.println("Rectangle Area: " + rectangle.calculateArea());
    }
}
