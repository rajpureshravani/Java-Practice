public class MCQ_15 {
    int x = 10;
    static class Inner {
        static int y = 20;
        void show() { System.out.println(y); }
    }
    public static void main(String[] args) {
        Inner i = new Inner();
        i.show();
    }
}
