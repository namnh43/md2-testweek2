import model.book.Book;
import model.book.FictionBook;
import model.book.ProgrammingBook;

import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ArrayList< Book> bookList = new ArrayList<>();
        Book programming1 = new ProgrammingBook("book1", "programming 1", 300, "bill gate", "word", "microsoft");
        Book programming2 = new ProgrammingBook("book2", "programming 2", 400, "steve job", "iphone", "apple");
        Book programming3 = new ProgrammingBook("book3", "programming 3", 500, "tim cook", "macbook", "apple");
        Book programming4 = new ProgrammingBook("book4", "programming 4", 200, "elon musk", "testla", "testla");
        Book programming5 = new ProgrammingBook("book5", "programming 5", 100, "pham nhat vuong", "vfe8", "vinfast");
        Book fiction1 = new FictionBook("book6","Fiction 1", 50, "nguyen du", "truyen kieu");
        Book fiction2 = new FictionBook("book7","Fiction 2", 60, "vu trong phung", "so do");
        Book fiction3 = new FictionBook("book8","Fiction 3", 70, "Kim dung", "vien tuong 1");
        Book fiction4 = new FictionBook("book9","Fiction 4", 80, "herminway", "vien tuong 1");
        Book fiction5 = new FictionBook("book10","Fiction 5", 90, "nguyen nhat anh", "tinh yeu");
        bookList.add(programming1);
        bookList.add(programming2);
        bookList.add(programming3);
        bookList.add(programming4);
        bookList.add(programming5);
        bookList.add(fiction1);
        bookList.add(fiction2);
        bookList.add(fiction3);
        bookList.add(fiction4);
        bookList.add(fiction5);
        long totalPrice = 0;
        int fiction1_category = 0;
        int price100 = 0;

        for (Book book: bookList) {
            totalPrice += book.getPrice();
            if (book instanceof FictionBook) {
                if (((FictionBook) book).getCategory().equals("vien tuong 1")) {
                    fiction1_category ++;
                }
            }
            if (book.getPrice() < 100) {
                price100 ++;
            }
        }
        System.out.println("Total price: " + totalPrice);
        System.out.println("Number book category of \"vien tuong 1\" is "+fiction1_category);
        System.out.println("Number books have price less than 100 is " + price100);
    }
}