
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Book> books = new ArrayList<>();
        
        
        while(true) {
            System.out.print("Input the name of the book, empty stops: ");
            String nameInput = scanner.nextLine();
            
            if(nameInput.isEmpty()) {
                break;
            }
            
            System.out.print("Input the age recommendation: ");
            int ageInput = Integer.valueOf(scanner.nextLine());
            
            books.add(new Book(nameInput, ageInput));
        }
        
        System.out.println(books.size() + " books in total.");
//        books.stream()
//                .forEach(book -> System.out.println(book.toString()));
        
        Comparator<Book> comparator = Comparator.comparing(Book::getAgeRecommended).thenComparing(Book::getName);
                            
        Collections.sort(books, comparator);
        books.stream()
                 .forEach(book -> System.out.println(book.toString()));
    }

}
