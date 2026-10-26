import java.util.Vector;

class  Employee{

    private int empid;
    private String empname;
    private double empsalary;

    Employee(){

    }

    Employee(int empid , String empname , double empsalary){
        this.empid = empid;
        this.empname = empname;
        this.empsalary = empsalary;
    }

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public double getEmpsalary() {
        return empsalary;
    }

    public void setEmpsalary(double empsalary) {
        this.empsalary = empsalary;
    }
}

public class Vecdemo2 {
    public static void main(String[] args) {

        Vector<Employee> vector = new Vector();

        Employee employee = new Employee();

        employee.setEmpid(101);
        employee.setEmpname("Shravani Rajpure");
        employee.setEmpsalary(20000);


        Employee employee1 = new Employee();
        employee1.setEmpid(102);
        employee1.setEmpname("Radha Jadhav");
        employee1.setEmpsalary(30000);



        vector.add(employee);
        vector.add(employee1);

        for(Employee emp : vector){

            System.out.println("ID         :" + emp.getEmpid());
            System.out.println("Name       :" + emp.getEmpname());
            System.out.println("Salary     :" + emp.getEmpsalary());


        }




    }
}
