public class MCQ_10 {
    int a = 10;
    void test(MCQ_10 obj) { obj.a += 5; }
    public static void main(String[] args) {
        MCQ_10 obj = new MCQ_10();
        obj.test(obj);
        System.out.println(obj.a);
    }
}
