 interface MCQ_29 {
     int x = 10;
 }
 class Q29 implements MCQ_29 {
     void print() { System.out.println(x); }
     public static void main(String[] args) {
         new Q29().print();
     }
}
