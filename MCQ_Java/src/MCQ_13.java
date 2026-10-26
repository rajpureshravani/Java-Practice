public class MCQ_13 {
    int a = 1;
    void outerMethod() {
        class Local {
            void display() { System.out.println(a); }
        }
        Local l = new Local();
        l.display();
    }
    public static void main(String[] args) {
        MCQ_13 o = new MCQ_13();
        o.outerMethod();
    }
}

