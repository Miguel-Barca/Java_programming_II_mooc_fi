package notifier;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Miguel
 */
public class NotifierApplication extends Application {

    @Override
    public void start(Stage window) {
        TextField topMostComponent = new TextField();
        Label bottomComponent = new Label();
        Button button = new Button("Update");

        button.setOnAction((event) -> {
            bottomComponent.setText(topMostComponent.getText());
        });

        VBox componentGroup = new VBox();
        componentGroup.getChildren().addAll(topMostComponent, button, bottomComponent);

        Scene scene = new Scene(componentGroup);

        window.setScene(scene);
        window.show();
    }
    
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        launch(NotifierApplication.class);
    }
}