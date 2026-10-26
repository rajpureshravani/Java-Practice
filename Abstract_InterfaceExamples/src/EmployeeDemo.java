
abstract class Employee{

    String name;
    int id;

    Employee(String name , int id){
        this.name = name;
        this.id = id;
    }

    abstract double calculateSalary();

    void displayDetails(){
        System.out.println("Name of Employee : "+name);
        System.out.println("Id of Employee: "+id);
    }

}

class FullTimeEmployees extends Employee{

    double monthlySalary;

    FullTimeEmployees(String name, int id,double monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;

    }

    @Override
    double calculateSalary() {
        return monthlySalary;
    }
}
public class EmployeeDemo {

    public static void main(String[] args) {

        FullTimeEmployees emp = new FullTimeEmployees("Shri",101,30000);
        emp.displayDetails();
        System.out.println("Salary : "+emp.calculateSalary());
    }

}
