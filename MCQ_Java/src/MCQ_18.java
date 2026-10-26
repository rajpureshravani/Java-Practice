public class MCQ_18 {
    int a = 1;
    static int b = 2;
    static class Inner {
        void display() { System.out.println(b); }
    }
    public static void main(String[] args) {
        Inner i = new Inner();
        i.display();
    }
}
