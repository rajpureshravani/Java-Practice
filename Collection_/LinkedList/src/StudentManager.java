import java.util.ArrayList;
import java.util.Scanner;

class Student{
    private int id;
    private String name;
    private String course;
    private float marks;

    Student(){

    }
    Student(int id , String name , String course , float marks){
       this.id = id ;
       this.name = name;
       this.course = course;
       this.marks = marks;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public float getMarks() {
        return marks;
    }

    public void setMarks(float marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", course='" + course + '\'' +
                ", marks=" + marks +
                '}';
    }
}

public class StudentManager {

    ArrayList<Student> students = new ArrayList<>();

    Scanner sc = new Scanner(System.in);

    Student student = new Student();


    public void addStudent(){
        System.out.println("Enter your name : ");

    }

    public void removeStudent(){

    }

    public void searchStudent(){

    }

    public void displayStudents(){

    }

    public void updateStudent(){

    }

    public static void main(String[] args) {

        }
    }
