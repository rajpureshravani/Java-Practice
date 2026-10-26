
class Ecommerce{

    void placeOrder(String productName , double price){

        System.out.println("--------Single Product--------");
        System.out.println("Product Name    : " + productName);
        System.out.println("Product Price   :" + price);

    }

    void placeOrder(String product1Name , double product1_price , String product2Name , double product2_price){
        System.out.println("\n-----------Multiple Product----------");
        System.out.println("Product1 Name    : " + product1Name);
        System.out.println("Product1 Price   :" + product1_price);
        System.out.println("Product2 Name    : " + product2Name);
        System.out.println("Product2 Price   :" + product2_price);

    }

    double placeOrder(double price , String coupon){
        System.out.println("\n--------Discount Coupon-----------");
        System.out.println("Original Price : " + price);
        System.out.println("Coupon         : " + coupon);

        if(coupon.equals("SAVE10")){
            return price-(price * 10 /100);
        }
        return price;
    }

}

public class ECommerceApplication {
    public static void main(String[] args) {

        Ecommerce ecm = new Ecommerce();
        ecm.placeOrder("Pizza",340);
        ecm.placeOrder("Burgar",234,"Pasta", 346);
        double finalPrice = ecm.placeOrder(340, "SAVE10");

        System.out.println("Final Price    : " + finalPrice);

    }
}
