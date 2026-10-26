public class MCQ_11 {
    int x = 10;

    class Inner{
        void display(){
            System.out.println(x);
        }

        public static void main(String[] args) {
            MCQ_11 m = new MCQ_11();
            Inner i = m.new Inner();
            i.display();
        }
    }
}
