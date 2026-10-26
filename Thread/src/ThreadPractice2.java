

class Flipkart extends  Thread{
    public void run(){

        for(int i =1 ;i <=10 ;i++){

            try{
                Thread.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
        }
    }
}

class Meesho extends Thread {


    public void run() {
        for (int j = 11; j <= 20; j++) {
            try{
                Thread.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(j);
        }
    }

}

public class ThreadPractice2 {
    public static void main(String[] args) {

        Flipkart f = new Flipkart();
        Meesho m = new Meesho();

        //System.out.println(m.getPriority());
       f.setPriority(Thread.MIN_PRIORITY);

        f.start();

        try{
            Thread.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        m.start();
    }
}
