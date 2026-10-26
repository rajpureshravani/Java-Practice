public class MCQ_12 {
    static int x = 5;
    static class Inner {
        void show() { System.out.println(x); }
    }
    public static void main(String[] args) {
        Inner i = new Inner();
        i.show();
    }
}
