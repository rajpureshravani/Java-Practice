
abstract class Employee{
    String employee_name;
    int employee_id;

    abstract void calculateSalary();
    void displayDetails(){
        System.out.println("The Employee Name : " + employee_name);
        System.out.println("The Employee ID   : " + employee_id);
    }
}

class FullTimeEmployee extends Employee{
    @Override
    void calculateSalary() {
        System.out.println( " " );
    }
}

class PartTimeEmployee extends  Employee{
    @Override
    void calculateSalary() {
        System.out.println(" ");
    }
}

public class EmployeeSalary {
    public static void main(String[] args) {

//        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee();
//        PartTimeEmployee partTimeEmployee = new PartTimeEmployee();

        Employee emp = new FullTimeEmployee();
        Employee emp2 = new PartTimeEmployee();


    }
}
