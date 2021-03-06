
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Miguel
 */
public class LiteracyComparison {
    
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        List<Country> countries = new ArrayList<>();
        
        try {
            // reading the file line by line
            Files.lines(Paths.get("literacy.csv"))
                // splitting the row into parts on the ", " character
                .map(row -> row.split(","))
                // creating countries from the parts
                .map(parts -> new Country(parts[0], parts[1], parts[2].replace(" (%)", ""), parts[3], Integer.valueOf(parts[4]), Double.valueOf(parts[5])))
                // and finally add the book to the list
                .forEach(country -> countries.add(country));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
       
        countries.stream()
               
               .sorted((c1, c2) -> {
                return c1.getLiteracyPerc().compareTo(c2.getLiteracyPerc());
                })
                .forEach(c -> System.out.println(c.toString()));
    }
    
    //In the future try working on the stream
    public static String trimOperation(String string) {
        return "";
    }
}
