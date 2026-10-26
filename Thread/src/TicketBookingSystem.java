
class TicketCounter {
   private int ticketNum = 10 ;

    public synchronized void bookTicket(int tickets){
        if(ticketNum  >=  tickets){
            System.out.println(Thread.currentThread().getName() + "Booked" + tickets + "Ticket(s)");

            ticketNum -= tickets;
            System.out.println("Available Tickets : " + tickets);
        }
        else {
            System.out.println(Thread.currentThread().getName()
                    + "Booking Failed! Not Enough Tickets.");
        }
    }
}

class User extends  Thread{
    TicketCounter counter;

    User(TicketCounter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        counter.bookTicket(2);
    }
}

public class TicketBookingSystem {
    public static void main(String[] args) {

        TicketCounter counter = new TicketCounter();
        for(int i=1;i<=5;i++){
            User user = new User(counter);
            user.setName("User-"+i);
            user.start();
        }
    }
}
