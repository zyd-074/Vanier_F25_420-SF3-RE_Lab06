package vaniercollege.zyd;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.Stage;

/**
 * @author Yu Duo Zhang(2480549)
 */
public class ZYD_HouseWithWindowPanesLab extends Application {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage stage) {
        // Base
        Rectangle base = new Rectangle(100, 230, 300, 200);
        base.setFill(Color.LIGHTGRAY);
        base.setStroke(Color.BLACK);
        
        // Roof
        Polygon roof = new Polygon(100,230,400,230,250,100);
        roof.setFill(Color.CHOCOLATE);
        roof.setStroke(Color.BLACK);
        
        // Chemney
        Rectangle chemney = new Rectangle(175, 120, 25, 75);
        chemney.setFill(Color.GRAY);
        chemney.setStroke(Color.BLACK);
        
        // Door
        Rectangle door = new Rectangle(275, 325, 60, 105);
        Circle doorHandle = new Circle(325, 390, 5);
        door.setFill(Color.MAROON);
        doorHandle.setFill(Color.WHITE);
        
        // Display
        Pane root = new Pane();
        root.getChildren().addAll(base,roof, chemney, door, doorHandle);
        Scene scene = new Scene(root, 500, 500);
        stage.setScene(scene);
        stage.show();
    }
}
