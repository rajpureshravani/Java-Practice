
interface Employee{
    public void work();
    void attendMeeting();
    double calculateSalary();
}

class JavaDeveloper implements Employee{


    @Override
    public void work() {
        System.out.println("Developer is working");
    }

    @Override
    public void attendMeeting() {
        System.out.println("Attending meeting ");
    }

    @Override
    public double calculateSalary() {
        return 80000;
    }
}

class PythonDeveloper implements Employee{

    @Override
    public void work() {
        System.out.println("Python Developer is working");
    }

    @Override
    public void attendMeeting() {
        System.out.println("Pyhton Developer attending Meeting");
    }

    @Override
    public double calculateSalary() {
        return 75000;
    }
}

class Tester implements Employee{


    @Override
    public void work() {
        System.out.println("Tester is working");
    }

    @Override
    public void attendMeeting() {
        System.out.println("Attending Meeting");
    }

    @Override
    public double calculateSalary() {
        return 70000;
    }
}

class HR implements Employee{

    @Override
    public void work() {
        System.out.println("HR");
    }

    @Override
    public void attendMeeting() {
        System.out.println("Attend Meeting Hr");
    }

    @Override
    public double calculateSalary() {
        return 65000;
    }
}

public class CompanyManagement {
    public static void main(String[] args) {

        Employee [] employees ={
                new JavaDeveloper(),
                new PythonDeveloper(),
                new Tester(),
                new HR()
        };

        for(Employee e : employees){
            e.work();
            e.attendMeeting();
            System.out.println("Salary : ₹" + e.calculateSalary());

            System.out.println("-------------------------");
        }

    }
}
