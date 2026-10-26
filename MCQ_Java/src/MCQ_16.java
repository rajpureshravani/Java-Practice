public class MCQ_16 {
    static int x = 10;
    class Inner {
        void show() { System.out.println(x); }
    }
    public static void main(String[] args) {
        MCQ_16 o = new MCQ_16();
        Inner i = o.new Inner();
        i.show();
    }
}
