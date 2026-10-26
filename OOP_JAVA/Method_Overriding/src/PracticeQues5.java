
class Employer{

   protected String name ;
   protected double salary;


   Employer(String name , double salary){
       this.name = name;
       this.salary= salary;
   }

    void calculateSalary(){
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }

}

class Developers extends Employer{
    private double bonus;

    Developers(String name , double salary , double bonus){

        super(name,salary);
        this.bonus = bonus;
    }
    @Override
    void calculateSalary(){
        double totalSalary = salary+bonus;
        System.out.println("\n Role : Developer");
        System.out.println("Name: "+name);
        System.out.println("Final salary : "+totalSalary);
    }

    
}

public class PracticeQues5 {
    public static void main(String[] args) {

    }
}
