import java.util.ArrayList;

public class StudentListDemo {
    public static void main(String[] args) {
        ArrayList<String> student = new ArrayList<>();

        student.add("Shravani");
        student.add("Namrata");
        student.add("Prathem");
        student.add("Sanket");
        student.add("Ram");
        student.add("Sanika");
        System.out.println(student.size());
        System.out.println("Student List: "+student);

        student.remove("Namrata");
        System.out.println(student.size());
        System.out.println(student);
    }
}
