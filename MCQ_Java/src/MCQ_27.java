 abstract  class MCQ_27 {
    abstract void display();
}
class SubQ27 extends MCQ_27 {
    void display() { System.out.println("Hello"); }
    public static void main(String[] args) {
        new SubQ27().display();
    }
}
