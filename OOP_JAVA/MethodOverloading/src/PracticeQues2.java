class Area {

    // Area of Square
    void calculateArea(int side) {
        System.out.println("Area of Square : " + (side * side));
    }

    // Area of Rectangle
    void calculateArea(int length, int width) {
        System.out.println("Area of Rectangle : " + (length * width));
    }

    // Area of Circle
    void calculateArea(double radius) {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle : " + area);
    }
}

public class PracticeQues2 {
    public static void main(String[] args) {

        Area obj = new Area();

        obj.calculateArea(35);        // Square
        obj.calculateArea(40, 34);    // Rectangle
        obj.calculateArea(34.5);      // Circle
    }
}