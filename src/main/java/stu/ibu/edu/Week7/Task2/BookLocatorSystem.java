package stu.ibu.edu.Week7.Task2;

public class BookLocatorSystem {
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook(new Book("Java Programming", "John Doe", "12345", "Available"));
        library.addBook(new Book("Data Structures", "Jane Smith", "67890", "Checked Out"));
        library.addBook(new Book("Database Systems", "Mike Johnson", "11111", "Reserved"));

        Book defaultBook = new Book("Default Book", "Unknown Author", "00000", "Unavailable");

        String isbn1 = "12345";
        Book book1 = library.findBookByISBN(isbn1).orElse(defaultBook);
        System.out.println("Using orElse: " + book1);


        String isbn2 = "99999";
        Book book2 = library.findBookByISBN(isbn2).orElseGet(() ->
                new Book("Lazy Default Book", "Lazy Author", "99999", "Unavailable"));
        System.out.println("Using orElseGet: " + book2);


        try {
            String isbn3 = "55555";
            Book book3 = library.findBookByISBN(isbn3)
                    .orElseThrow(() -> new BookNotFoundException("Book with ISBN " + isbn3 + " not found!"));
            System.out.println("Using orElseThrow: " + book3);
        } catch (BookNotFoundException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
