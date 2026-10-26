
class Book{

    int bookId;
    String title;
    String author;
    float price;
    String status;

    static String  libraryName ;
    static int totalBooks;

    Book( int bookId, String title, String author, float price){
        this.bookId = bookId;
        this.title = title;
        this.author= author;
        this.price=price;

        this.status = "Available";
        totalBooks++;
    }


    void displayBook() {

        System.out.println("Book ID       : " + bookId);
        System.out.println("Title         : " + title);
        System.out.println("Author        : " + author);
        System.out.println("Price         : " + price);
        System.out.println("Status        : " + status);
        System.out.println("Library       : " + libraryName);
        System.out.println("----------------------------");
    }

    static void searchBook(Book[] books, int bookId) {

        for (int i = 0; i < totalBooks; i++) {

            if (books[i].bookId == bookId) {

                System.out.println("Book Found!");
                books[i].displayBook();
                return;
            }
        }

        System.out.println("Book not found.");
    }
}
public class LibraryManagement {
    public static void main(String[] args) {

        Book.libraryName = "DES College Library";
        Book[] books = new Book[1000];

        Book book1 = new Book(101, "Java Programming", "James Gosling", 500);
        Book book2 = new Book(102, "Pyhton Programming", "Guido", 590);
        Book book3 = new Book(103, "Ai Programming", "PSF", 900);


        books[0] = book1;
        books[1] = book2;
        books[2] = book3;

        Book.searchBook(books , 109);

        System.out.println("Total Books : " + Book.totalBooks);

        System.out.println("--------Book Details-----------");
        for (int i = 0; i < Book.totalBooks; i++) {

            books[i].displayBook();

        }


    }
}
