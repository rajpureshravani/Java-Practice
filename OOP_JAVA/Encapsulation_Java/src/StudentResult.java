package OOPS_Concepts;

class Student {

    private int studentId;
    private String studentName;
    private String course;
    private int fees;

    // Getters
    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getCourse() {
        return course;
    }

    public int getFees() {
        return fees;
    }

    // Setters
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setFees(int fees) {

        if (fees >= 10000) {
            this.fees = fees;
        } else {
            System.out.println("Minimum fees should be 10000");
            this.fees = 10000;
        }
    }

    // Display Method
    public void display() {
        System.out.println("Student ID   : " + studentId);
        System.out.println("Student Name : " + studentName);
        System.out.println("Course       : " + course);
        System.out.println("Fees         : " + fees);
    }
}

public class StudentResult {

    public static void main(String[] args) {

        Student s1 = new Student();
        s1.setStudentId(101);
        s1.setStudentName("Shravani");
        s1.setCourse("MCA");
        s1.setFees(8000);

        Student s2 = new Student();
        s2.setStudentId(102);
        s2.setStudentName("Priyanka");
        s2.setCourse("MCA");
        s2.setFees(80000);

        Student s3 = new Student();
        s3.setStudentId(103);
        s3.setStudentName("Samiksha");
        s3.setCourse("MCA");
        s3.setFees(10000);

        Student s4 = new Student();
        s4.setStudentId(104);
        s4.setStudentName("Mayur");
        s4.setCourse("BCA");
        s4.setFees(9000);

        Student s5 = new Student();
        s5.setStudentId(105);
        s5.setStudentName("Siddhi");
        s5.setCourse("MSC CS");
        s5.setFees(54000);

        System.out.println("\n------ Student 1 ------");
        s1.display();

        System.out.println("\n------ Student 2 ------");
        s2.display();

        System.out.println("\n------ Student 3 ------");
        s3.display();

        System.out.println("\n------ Student 4 ------");
        s4.display();

        System.out.println("\n------ Student 5 ------");
        s5.display();
    }
}