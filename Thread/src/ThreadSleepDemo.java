


class countdown extends Thread{

    public void run() {
       for(int i = 10 ; i >= 1 ;i--){
           System.out.println(Thread.currentThread().getName() + i);

       }
    }
}
public class ThreadSleepDemo {
    public static void main(String[] args) {

        countdown c1 = new countdown();

        c1.start();
    }
}
