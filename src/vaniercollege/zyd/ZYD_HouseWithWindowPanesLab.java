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
        Rectangle door = new Rectangle(230, 325, 60, 105);
        Circle doorHandle = new Circle(280, 390, 5);
        door.setFill(Color.MAROON);
        doorHandle.setFill(Color.WHITE);
        
        // Windows
        Rectangle windowLeft = new Rectangle(130, 280, 70, 70);
        Rectangle windowRight = new Rectangle(310, 280, 70, 70);
        windowLeft.setFill(Color.LIGHTBLUE);
        windowRight.setFill(Color.LIGHTBLUE);
        Line vertLeft = new Line(165,280,165,350);
        Line vertRight = new Line(345,280,345,350);
        Line horLeft = new Line(130, 315, 200, 315);
        Line horRight = new Line(310, 315, 380, 315);
        
        // Display
        Pane root = new Pane();
        root.getChildren().addAll(base,roof,chemney,
                door, doorHandle,
                windowLeft, windowRight,
                vertLeft, vertRight,
                horLeft, horRight);
        Scene scene = new Scene(root, 500, 500);
        stage.setScene(scene);
        stage.show();
    }
}
