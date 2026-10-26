
abstract  class Appliance{
    String brand;

    Appliance(String brand){
        this.brand= brand;


    }

    abstract void turnOn();

}

class Fan extends Appliance {

    Fan(String brand){
        super(brand);
    }

    @Override
    void turnOn(){
        System.out.println();
        System.out.println(brand + ":  Fan is rotating.");
    }
}

class Light extends  Appliance{

    Light(String brand){
        super(brand);
    }

    @Override
    void turnOn(){
        System.out.println(brand + ": Philips Light is glowing.");
    }
}
class AC extends Appliance{

    AC(String brand){
        super(brand);
    }

    @Override
    void turnOn() {
        System.out.println(brand + ": LG AC is cooling");
    }
}
public class SmartHome {
    public static void main(String[] args) {

        Appliance appliance[] = {
                new Fan("Cromptiom"),
                new Light("Philips"),
                new AC("LG")
        };

        for (Appliance a : appliance) {

            a.turnOn();

        }

    }
}
