public class MCQ_6 {
    int x = 5;
    void change(MCQ_6 obj) { obj.x = 10; }
    public static void main(String[] args) {
        MCQ_6 obj = new MCQ_6();
        obj.change(obj);
        System.out.println(obj.x);
    }
}
