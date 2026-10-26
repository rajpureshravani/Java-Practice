interface MCQ_28 {
    void show();
}
class Q28 implements MCQ_28 {
    public void show() { System.out.println("Interface"); }
    public static void main(String[] args) {
        new Q28().show();
    }
}
