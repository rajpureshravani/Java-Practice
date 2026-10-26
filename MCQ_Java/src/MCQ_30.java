abstract  class MCQ_30 {
    abstract void display();
    void hello() { System.out.println("Hello"); }
}
class SubQ30 extends MCQ_30 {
    void display() { System.out.println("World"); }
    public static void main(String[] args) {
        SubQ30 obj = new SubQ30();
        obj.display();
        obj.hello();
    }
}
