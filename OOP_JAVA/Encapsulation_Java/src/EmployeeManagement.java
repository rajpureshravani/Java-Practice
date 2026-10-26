

class Employee{
    private int empId;
    private String empName;
    private String department;
    private double salary;

    Employee(int empId , String empName , String department , double salary){
        this.empId = empId;
        this.empName = empName;;
        this.department = department;
        if (salary >= 20000) {
            this.salary = salary;
        } else {
            System.out.println("Salary should be at least 20000");
            this.salary = 20000;
        }
    }

    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public void display(){
        System.out.println("ID             :" + empId);
        System.out.println("Name           :" + empName);
        System.out.println("Department     :" + department);
        System.out.println("Salary         :" + salary);
    }
}
public class EmployeeManagement {
    public static void main(String[] args) {

        System.out.println();
        System.out.println("--------Student 1 ---------");
        Employee employee = new Employee(101,"Shravani","IT",3000);
        employee.display();

        System.out.println();
        System.out.println("--------Student 2 ---------");
        Employee employee1 = new Employee(102,"Sanika","CS",30000);
        employee1.display();
    }
}
