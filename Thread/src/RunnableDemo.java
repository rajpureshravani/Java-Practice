

class Machine implements Runnable{

    public void run() {
        for(int i = 1 ;i<=5;i++){
            //System.out.println(i);
            System.out.println(Thread.currentThread().getName()+i);
        }

    }
}
public class RunnableDemo {
    public static void main(String[] args) {

        Machine m1 = new Machine();

        Thread t1 = new Thread(m1);
        Thread t2 = new Thread(m1);

        t1.setName("Worker-1");
        t2.setName("Worker-2");

        t1.start();
        t2.start();
    }
}
