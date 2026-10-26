
class Printer{

    void print(String name){
        System.out.println(name);

    }

    void print(int a){
        System.out.println(a);
    }

    void print(double a){
        System.out.println(a);
    }

    void print(String name , int b){
        System.out.println(name + b);
    }
}

public class PracticeQues3 {
    public static void main(String[] args) {
        Printer a = new Printer();
        a.print("shri");
        a.print(22.4);
        a.print(101);
        a.print("Radha",25);
    }
}
