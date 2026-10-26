
class NumberThread extends  Thread{

    public void run(){
        for(int i= 1;i<=5;i++){
            System.out.println(i);
        }
    }
}


public class ThreadPractice1 {
    public static void main(String[] args) {
         System.out.println("Main Thread Started");
         NumberThread obj = new NumberThread();
         obj.run();
         System.out.println("Main Thread Finished");
    }
}
