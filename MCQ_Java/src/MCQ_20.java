public class MCQ_20 {
    void method() {
        final int x = 50;
        class Local {
            void show() { System.out.println(x); }
        }
        new Local().show();
    }
    public static void main(String[] args) {
        new MCQ_20().method();
    }
}
