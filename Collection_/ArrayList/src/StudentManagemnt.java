import java.util.ArrayList;

class Student{
    private int id ;
    private String name;

   Student(){

   }


    public Student(int id,String name) {
        this.name = name;
        this.id = id;
    }

    public void setId(int id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +"id=" + id + ", name='" + name + '\'' + '}';
    }
}
public class StudentManagemnt {
    public static void main(String[] args) {

//        Student student = new Student();
//        Student student1 = new Student();

//        student.setId(101);
//        student.setName("Akash Rajpure");
//
//        student1.setId(102);
//        student1.setName("Avinash Rajpure");
//
//        System.out.println();
//
//        System.out.println("----Student 1---------");
//        System.out.println("ID   :" + student.getId());
//        System.out.println("Name :"+ student.getName());
//
//        System.out.println();
//
//        System.out.println("----Student 2---------");
//        System.out.println("ID   :" + student1.getId());
//        System.out.println("Name :"+ student1.getName());

        ArrayList<Student> listOfObjects = new ArrayList<>();

        Student s1=new Student();
        s1.setId(101);
        s1.setName("shravani rajpure");

        Student s2=new Student();
        s2.setId(102);
        s2.setName("sanika rajpure");


        listOfObjects.add(s1);
        listOfObjects.add(s2);
        listOfObjects.add(new Student(2,"ankit"));


        System.out.println(listOfObjects.get(2));








    }
}
