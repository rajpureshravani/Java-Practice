
class Person{
    String name ;
    int age;

    void displayPerson(){
        System.out.println("name: "+ name +"\n"+"age: "+ age);
    }
}

class Student extends Person{
    int rollNo ;

    void displayStudent(){
        System.out.println("RollNo: "+rollNo);
    }
}

public class Inheritance_Practice {
    public static void main(String[] args) {

       Student student1 = new Student();
       student1.name = " shri";
       student1.age = 22;
       student1.rollNo = 101;

        System.out.println("\n");
       student1.displayStudent();
       student1.displayPerson();

    }
}
