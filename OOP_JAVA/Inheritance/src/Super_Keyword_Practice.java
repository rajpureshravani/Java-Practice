

class Employee{
    String companyName = "Google";
    String employeeName;

    Employee(String employeeName){
        this.employeeName = employeeName;
        System.out.println("Employee Constructor Called");
    }

    void display(){
        System.out.println("Company Name: " + companyName);
        System.out.println("Employee Name: " + employeeName);
    }
}

class Developer extends Employee{
    String companyName = "Microsoft" ;
    String programmingLanguage;

    Developer(String employeeName , String programmingLanguage){

       super(employeeName);

       this.programmingLanguage = programmingLanguage;

        System.out.println("Developer Constructor Called");

    }

    void show(){
        System.out.println(super.companyName);
        System.out.println(this.companyName);
        super.display();
        System.out.println("Programming Language: " + programmingLanguage);
    }
}

public class Super_Keyword_Practice {
    public static void main(String[] args) {

        Developer obj = new Developer("Shravani" , "Java");
        obj.show();

    }
}
