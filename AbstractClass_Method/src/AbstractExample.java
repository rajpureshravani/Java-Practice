
abstract class Employees{
    String name;
    int id;
    double salary;

    public Employees(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    abstract void calculateSalary();



}
interface Bonus{

    void calculateBonus();
}

class PermentEmployye  extends Employees implements Bonus {

    double bonus;
    public PermentEmployye(String name, int id, double salary) {
        super(name, id, salary);
    }

    @Override
    public void calculateBonus() {

       bonus = salary * 15 /100;
        System.out.println(" Bonus :  " + bonus);
    }

    @Override
    void calculateSalary() {
         double final_amount = salary + bonus;
        System.out.println("Final Amount : " + final_amount);
    }
}

class ContractEmployee  extends Employees implements Bonus{
double bonus;
    public ContractEmployee(String name, int id, double salary) {
        super(name, id, salary);
    }

    @Override
    public void calculateBonus() {
         bonus = salary * 5 / 100;
        System.out.println(" Bonus :  " + bonus);

    }

        void calculateSalary() {
            double final_amount = salary + bonus;
            System.out.println("Final Amount : " + final_amount);
    }
}
public class AbstractExample {
    public static void main(String[] args) {

        PermentEmployye abc = new PermentEmployye("Rahul",101,60000);
        ContractEmployee abc1 = new ContractEmployee("Amit" ,102,50000);

        abc.calculateBonus();
        abc.calculateSalary();

        abc1.calculateBonus();
        abc1.calculateSalary();

    }
}
