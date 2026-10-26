
class School {
    String name;
    int id;
    int age;


    School ( String name , int id , int age){

        this.name = name;
        this.id = id;
        this.age = age;

    }

    void display() {

        System.out.println("name is: " + name);
        System.out.println("id is: " + id);
        System.out.println("age is: " + age);

    }
}




public class JavaClass {
    public static void main(String[] args) {

        School obj = new School("shri" , 101 , 23);

//        obj.name = "shri";
//        obj.id = 101;
//        obj.age = 23;

        obj.display();

    }
}
