

class Vehicle{
    String brand = " Toyota ";
    int maxSpeed;

    Vehicle(int maxSpeed){
        this.maxSpeed= maxSpeed;
        System.out.println("\n");
        System.out.println("Vehicle Constructor called");
    }

    void displayVehicle(){
        System.out.println("Brand :" + brand);
        System.out.println("Speed : " + maxSpeed);
    }
}

class Car extends  Vehicle{

    String brand = "BMW";
    String model ;


    Car(int maxSpeed , String model){
        super(maxSpeed);
        this.model = model;
        System.out.println("Car Constructor Called");
    }

    void showDetails(){

        System.out.println("\n");

        System.out.println("Parent Brand : " +super.brand);
        System.out.println("Child Brand: " + this.brand);

        System.out.println("\n");
        super.displayVehicle();

        System.out.println("\n");
        System.out.println("Model : " + model);
    }
}


public class Super_Keyword_Challenge {
    public static void main(String[] args) {


        Car obj = new Car(180 , "Fortuner");

        obj.showDetails();
    }
}
