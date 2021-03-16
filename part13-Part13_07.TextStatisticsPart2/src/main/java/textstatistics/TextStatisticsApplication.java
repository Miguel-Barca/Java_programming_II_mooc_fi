package textstatistics;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.util.Arrays;

/**
 *
 * @author Miguel
 */
public class TextStatisticsApplication extends Application {

    /**
     *
     * @param window
     * @throws Exception
     */
    @Override
    public void start(Stage window) throws Exception {
        BorderPane pane = new BorderPane();
        TextArea textArea = new TextArea();
        pane.setCenter(textArea);



        HBox labelBar = new HBox(); //at the bottom
        labelBar.setSpacing(10);

        Label firstLabel = new Label("Letters: ");
        Label secondLabel = new Label("Words: ");
        Label thirdLabel = new Label("The longest word is: ");

        textArea.textProperty().addListener((change, oldValue, newValue) -> {
            int characters = newValue.length();
            String[] parts = newValue.split(" ");
            int words = parts.length;
            String longest = Arrays.stream(parts)
                    .sorted((s1, s2) -> s2.length() - s1.length())
                    .findFirst()
                    .get();
            // set values of text elements
            firstLabel.setText("Letters: " + characters);
            secondLabel.setText("Words: " + words);
            thirdLabel.setText("The longest word is: " + longest);
        });

        labelBar.getChildren().add(firstLabel);
        labelBar.getChildren().add(secondLabel);
        labelBar.getChildren().add(thirdLabel);
        pane.setBottom(labelBar);

        Scene view = new Scene(pane, 500, 500);


        window.setScene(view);
        window.show();
    }
}
