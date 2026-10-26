
class Books{

    private int bookId;
    private String bookName;
    private String author;
    private double price;

    Books(){
        System.out.println("Default Constructor Called");
    }

    Books(int bookId , String bookName){
        this.bookId = bookId;
        this.bookName = bookName;
        this.author ="Unknown";
        this.price = 100;
    }

    Books(int bookId , String bookName , String author , double price){
        this.bookId = bookId;
        this.bookName = bookName;
        this.author = author;
        if(price >= 100){
            this.price = price;
        }
        else{
            System.out.println("Minimum price should be 100");
            this.price = 100;
        }
    }

    public void display(){
        System.out.println("Book ID         :" +bookId);
        System.out.println("Book Name       :" +bookName);
        System.out.println("Book Author     :" +author);
        System.out.println("Book Price      :" +price);

    }

}

public class BookManagement {
    public static void main(String[] args) {

        Books b1 = new Books();
        Books b2 = new Books(101, "Java Programming");
        Books b3 = new Books(102, "Hibernate", "Gavin King", 80);
        System.out.println();
        b1.display();
        System.out.println();
        b2.display();
        System.out.println();
        b3.display();

    }
}
