package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Miguel
 */
public class MultipleViews extends Application {

    @Override
    public void start(Stage window) {

        //first view
        BorderPane borderPane = new BorderPane();
        Button transferToSecondView = new Button("To the second view!");
        Label text = new Label("First view!");
        borderPane.topProperty().setValue(text);
        borderPane.centerProperty().setValue(transferToSecondView);
        Scene firstScene = new Scene(borderPane, 300, 300);

        //second view
        VBox vBox = new VBox();
        Button transferToThirdView = new Button("To the third view!");
        Label text2 = new Label("Second view!");
        vBox.getChildren().addAll(transferToThirdView, text2);
        Scene secondScene = new Scene(vBox, 300, 300);

        //third view
        GridPane gridPane = new GridPane();
        Button transferToFirst = new Button("To the first view");
        Label text3 = new Label("Third view");
        gridPane.add(text3, 0, 0);
        gridPane.add(transferToFirst, 1, 1);
        Scene thirdScene = new Scene(gridPane, 300, 300);

        //Event listener --- Tranfer from first to second view
        transferToSecondView.setOnAction((actionEvent) -> {window.setScene(secondScene);});

        //Event listener --- Tranfer from second to third view
        transferToThirdView.setOnAction((actionEvent) -> {window.setScene(thirdScene);});

        //Event listener --- Tranfer from third to first view
        transferToFirst.setOnAction((actionEvent) -> {window.setScene(firstScene);});

        window.setScene(firstScene);
        window.show();
    }
    
    /**
     *
     * @param args
     */
    public static void main(String[] args) {

        launch(MultipleViews.class);
    }
}
