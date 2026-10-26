import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeManagementSystem {
    public static void main(String[] args) {

        ArrayList<String> employee = new ArrayList<>();

        employee.add("Shravani Rajpure");
        employee.add("vaibhavi Nikam");
        employee.add("Aniket Deshmukh");
        employee.add("Priyanka Nahire");

        System.out.println("Employees : " + employee);

        employee.remove("Aniket Deshmukh");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the employees name: ");

        String name  = sc.nextLine();
        if(employee.contains(name)){
            System.out.println("Yes Present");
        }
        else{
            System.out.println("Not Found");
        }
        System.out.println(employee);
    }
}
