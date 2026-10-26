

class Order {
    String customer_name;
    int order_id;
    double delivery_fee;

    Order(String customer_name, int order_id, double delivery_fee) {
        this.customer_name = customer_name;
        this.order_id = order_id;
        this.delivery_fee = delivery_fee;
    }

    void displayOrderDetails() {
        System.out.println("Customer Name: " + customer_name);
        System.out.println("Order ID: " + order_id);
        System.out.println("Delivery Fee: " + delivery_fee);
    }

}

    class ExpressOrder extends  Order {
        double express_delivery_charge;



        ExpressOrder(String customer_name , int order_id , double delivery_fee,double express_delivery_charge) {

            super(customer_name,order_id,delivery_fee);
            this.express_delivery_charge= express_delivery_charge;


        }



        void display() {
            super.displayOrderDetails();

            System.out.println("Express Delivery Charge: " + express_delivery_charge);
            System.out.println("Final Amount: " +
                    (delivery_fee + express_delivery_charge));
        }


    }


public class SuperKeywordPractice {
    public static void main(String[] args) {

       ExpressOrder expressOrder = new ExpressOrder("ABC",101,450,36.8);
       expressOrder.display();

    }
}
