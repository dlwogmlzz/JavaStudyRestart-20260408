package review.ex;

public class BookMain {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.displayInfo();

        Book book2 = new Book("Hello Java", "Lee");
        book2.displayInfo();

        Book book3 = new Book("JPA 프로그래밍", "Kim", 700);
        book3.displayInfo();

//        Book[] books = {book1, book2, book3};

//        for (Book book : books) {
//            System.out.println("제목: " + book.title + ", 저자: " + book.author + ", 페이지수: " + book.page);
//        }
    }
}
