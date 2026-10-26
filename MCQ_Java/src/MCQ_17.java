public class MCQ_17 {
    int x = 5;
    class Inner {
        int x = 10;
        void show() { System.out.println(this.x); }
    }
    public static void main(String[] args) {
        MCQ_17 o = new MCQ_17();
        Inner i = o.new Inner();
        i.show();
    }
}
