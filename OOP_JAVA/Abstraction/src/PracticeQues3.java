
abstract class Notification{

    abstract void sendNotification();
}

class EmailNotification extends  Notification{

    @Override
    void sendNotification(){
        System.out.println("Email Sent");
    }
}
class SMSNotification extends Notification{

    @Override
    void sendNotification(){
        System.out.println("SMS Sent");

    }
}
class PushNotification extends  Notification{

    @Override
    void sendNotification(){
        System.out.println("Push Notification Sent");
    }
}
public class PracticeQues3 {
    public static void main(String[] args) {

        Notification notifications[] = {

                new EmailNotification(),
                new SMSNotification(),
                new PushNotification()

        };

        for(Notification n : notifications){

            n.sendNotification();

        }
    }
}
