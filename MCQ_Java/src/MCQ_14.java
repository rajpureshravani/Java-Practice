public class MCQ_14 {
    void display() {
        Runnable r = new Runnable() {
            public void run() { System.out.println("Anonymous"); }
        };
        r.run();
    }
    public static void main(String[] args) {
        new MCQ_14().display();
    }
}
