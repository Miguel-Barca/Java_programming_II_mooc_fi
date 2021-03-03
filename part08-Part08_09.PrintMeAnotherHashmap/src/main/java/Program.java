
import java.util.ArrayList;
import java.util.HashMap;

public class Program {

    public static void main(String[] args) {
        // Test your program here!
        HashMap<String, Book> hashmap = new HashMap<>();
        hashmap.put("sense", new Book("Sense and Sensibility", 1811, "..."));
        hashmap.put("prejudice", new Book("Pride and prejudice", 1813, "...."));

        printValues(hashmap);
        System.out.println("---");
        printValueIfNameContains(hashmap, "prejud");
    }

    public static void printValues(HashMap<String,Book> hashmap) {
        for(Book book : hashmap.values()) {
            System.out.println(book.toString());
        }
    }
    
    public static void printValueIfNameContains(HashMap<String,Book> hashmap, String text) {
        text = sanitizedString(text);

        for(Book book : hashmap.values()) {
            if(!book.getName().contains(text)) {
                continue;
            } else {
                System.out.println(book.toString());
            }
        }

    }
    
    public static String sanitizedString(String string) {
        if (string == null) {
            return "";
        }

        string = string.toLowerCase();
        return string.trim();
    }
}