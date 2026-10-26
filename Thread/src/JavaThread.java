
class Test extends Thread{
    public void run(){
        for(int i = 1 ; i <=5 ;i++){
            System.out.println("I : "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class JavaThread {
    public static void main(String[] x) {

        Test test = new Test();
        test.start();

    }
}
