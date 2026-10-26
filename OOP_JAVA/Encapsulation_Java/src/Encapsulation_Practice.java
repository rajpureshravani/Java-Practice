
class Book{
    private int bookId ;
    private String bookName;
    private String author;
    private int price;

    public void setBookId(int bookId){

        this.bookId = bookId;

    }

    public int getBookId(){
        return bookId;
    }

    public void setBookName(String bookName){
        this.bookName = bookName;
    }

    public String getBookName(){
        return bookName;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public String getAuthor(){
        return author;
    }

    public void setPrice(int price){
        if(price >= 0){
            this.price = price;
        }
        else{
            System.out.println(" Sorry Invalid book price ");
        }
    }

    public int getPrice(){
        return price;
    }

    void displayBookDetails(){
        System.out.println("Book ID : "+getBookId());
        System.out.println("Book Name : "+getBookName());
        System.out.println("Book Author : "+getAuthor());
        System.out.println("Book Price : "+getPrice());

    }

}

public class Encapsulation_Practice {
    public static void main(String[] args) {

        Book book1 = new Book();
        Book book2 = new Book();

        book1.setBookId(101);
        book1.setBookName("Java Programming");
        book1.setAuthor("James Gosling");
        book1.setPrice(500);

        //book1.displayBookDetails();

        book2.setBookId(102);
        book2.setBookName("Python Programming");
        book2.setAuthor("Guido van Rossum");
        book2.setPrice(-100);

        System.out.println("\n");
        book1.displayBookDetails();
        System.out.println("\n");
        book2.displayBookDetails();

    }
}
