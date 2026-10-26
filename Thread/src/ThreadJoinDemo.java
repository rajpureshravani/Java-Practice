
class LoadingTask extends  Thread{

    public void run() {
        for(int i=1;i<=5;i++){
            System.out.println("Loading files");
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}


public class ThreadJoinDemo {
    public static void main(String[] args) throws InterruptedException {

        LoadingTask loader  = new LoadingTask();


        loader.setName("Loader");
        loader.start();
        loader.join();
        System.out.println("Application Started");


    }
}
