package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Miguel
 */
public class GreeterApplication extends Application {

    public static void main(String[] args) {
        launch(GreeterApplication.class);
    }

    @Override
    public void start(Stage stage) throws Exception {
        
        //first view
        Label intructionText = new Label("Enter your name and start.");
        Button startButton = new Button("Start");
        TextField textField = new TextField();
        GridPane firstLayout = new GridPane();
        firstLayout.add(intructionText, 0, 1);
        firstLayout.add(textField, 0, 2);
        firstLayout.add(startButton, 0, 3);
        
        //make layout prettier
        firstLayout.setAlignment(Pos.CENTER);
        firstLayout.setVgap(10);
        firstLayout.setHgap(10);
        firstLayout.setPadding(new Insets(20, 20, 20, 20));
        
        Scene firstView = new Scene(firstLayout, 300 , 180);
        
        //second View
        StackPane welcomeLayout = new StackPane();
        Label greeting = new Label();
        welcomeLayout.setPrefSize(300, 180);
        welcomeLayout.getChildren().add(greeting);
        
        Scene secondView = new Scene(welcomeLayout);
        
        startButton.setOnAction((event) -> {
            if(!textField.getText().isEmpty()) {
                String name = textField.getText();
                greeting.setText("Welcome " + name + "!");
            }
            stage.setScene(secondView);
        });
        
        stage.setScene(firstView);
        stage.show();
    }
}
