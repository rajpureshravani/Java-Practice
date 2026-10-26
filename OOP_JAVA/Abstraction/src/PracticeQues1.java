


abstract class Shape{

    abstract void draw();



}

class Circle extends Shape{

    @Override
    void draw() {
        System.out.println("Drawing circle");
    }
}

class Rectangle extends Shape{

    @Override
    void draw(){
        System.out.println("Drawing Reactangle");
    }
}

public class PracticeQues1 {
    public static void main(String[] args) {

        Shape shape1 = new Circle();
        Shape shape2 = new Rectangle();

        shape1.draw();
        shape2.draw();

    }
}
