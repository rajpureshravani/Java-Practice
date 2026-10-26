public class MCQ_19 {
    int a = 5;
    class Inner {
        int a = 10;
        void print() { System.out.println(MCQ_19.this.a); }
    }
    public static void main(String[] args) {
        MCQ_19 o = new MCQ_19();
        Inner i = o.new Inner();
        i.print();
    }
}
