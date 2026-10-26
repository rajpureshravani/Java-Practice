
class Countdown extends  Thread{

    public void run() {
        for(int i = 10 ; i>=1 ;i--){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + i);
        }
    }
}

public class ThreadSleepsDemo {
    public static void main(String[] args) {
        Countdown c1 = new Countdown();
        c1.start();
    }
}
