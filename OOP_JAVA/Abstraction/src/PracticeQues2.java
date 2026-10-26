
abstract class Employee{

    abstract void work();
}

class Developer extends Employee{

    @Override
    void work(){
        System.out.println("Writing code");
    }
}

class Tester extends Employee{

    @Override
    void work(){
        System.out.println("Testing Application");
    }
}

class Manager extends Employee{

    @Override
    void work(){
        System.out.println("Managing Team");
    }
}


public class PracticeQues2 {

    public static void main(String[] args) {

        Employee obj1 = new Developer();
        Employee obj2 = new Tester();
        Employee obj3 = new Manager();

        obj1.work();
        obj2.work();
        obj3.work();

    }
}
