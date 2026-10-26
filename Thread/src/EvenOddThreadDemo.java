
class EvenThread extends Thread{
    @Override
    public void run() {
        for(int i = 2 ; i<=20 ;i +=2){
            System.out.println("Even: " + i);

        }

    }
}


class OddThread extends Thread{
    @Override
    public void run() {
        for(int i = 1 ; i <=19  ; i +=2){
            System.out.println("Odd : "+i);
        }
    }
}

public class EvenOddThreadDemo {
    public static void main(String[] args) {

        OddThread obj = new OddThread();
        EvenThread obj1 = new EvenThread();

        obj.start();
        System.out.println("\n");
        obj1.start();

    }
}
