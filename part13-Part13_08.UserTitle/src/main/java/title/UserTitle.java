package title;

import javafx.application.Application;
import javafx.stage.Stage;
import java.util.Scanner;

/**
 *
 * @author Miguel
 */
public class UserTitle extends Application {

    @Override
    public void start(Stage window) {
        System.out.println("Give me a title");
        Scanner scanner = new Scanner(System.in);

        String inputTitle = scanner.nextLine();

        Parameters params = getParameters();
        String title = params.getNamed().get("title");

        window.setTitle(title + ": " + inputTitle);
        window.show();
    }

}
