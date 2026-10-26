
class Employee{

    void work(){
        System.out.println("Employee is working");
    }
}

class Developer extends Employee{

    @Override
    void work(){
        System.out.println("Developer is writing code.");
    }
}
class SeniorDeveloper extends Developer{
    @Override
    void work(){
        System.out.println("Senior Developer is designing system architecture.");
    }
}


public class EmployeeManagement {
    public static void main(String[] args) {

//        Employee e1 = new Employee();
//        Employee e2 = new Developer();
//        Employee e3 = new SeniorDeveloper();
//
//        e1.work();
//        e2.work();
//        e3.work();

        Employee a;
//        Developer b;
//        SeniorDeveloper c;

        a=new Employee();
        a.work();

        a=new Developer();
        a.work();

        a=new SeniorDeveloper();
        a.work();

    }
}
