

class Employee{

    String name ;
    float salary;
    static  String companyName = "SCMIRT" ;


    Employee(String name , float salary){
        this.name = name ;
        this.salary = salary;
    }

    void show(){
        System.out.println("The name of employee is : "+ name);
        System.out.println("The salary of employee is : "+ salary);
        System.out.println("The Company name of employee is : "+ companyName);
    }
}


public class StaticKeyword {
    public static void main(String[] args) {

        Employee obj1 = new Employee("Shravani Rajpure" , 320000 );
        Employee obj2 = new Employee("Aniket Deshmukh " , 320000);

//        System.out.println(Employee.companyName);
//        System.out.println(Employee.companyName);
//
//        Employee.companyName = "DES-PU";
//
//        System.out.println(Employee.companyName);
//        System.out.println(Employee.companyName);
        System.out.println("\n");
        obj1.show();
        System.out.println("\n");
        obj2.show();

    }
}
