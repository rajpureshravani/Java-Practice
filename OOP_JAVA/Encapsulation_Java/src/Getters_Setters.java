
class Student{

    String name ;
    int rollNo;
    private String course;

    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setrollNo (int rollNo) {
        this.rollNo = rollNo;
    }

    public int getRollNo(){
        return rollNo;
    }

    public void setCourse (String course) {
        this.course = course;
    }

    public String getcourse(){
        return course;
    }
}



public class Getters_Setters {
    public static void main(String[] args) {

        Student obj = new Student();
        obj.setName("Shravani");
        obj.setrollNo(232);
        obj.setCourse("MCA");

        System.out.println(obj.getName() + " : " + obj.getRollNo()+ " : "+ obj.getcourse());
    }
}
