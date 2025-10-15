package vaniercollege.zyd;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.shape.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 * @author Yu Duo Zhang (2480549)
 * https://github.com/zyd-074/Vanier_F25_420-SF3-RE_Lab06.git
 */
public class YuDuoZhang_Lab06 extends Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    /**
     * Task 1
     * @param stage stage of the program
     */
    @Override
    public void start(Stage stage) {
        // Constants for the scene size
        final double SCENE_WIDTH = 520.0;
        final double SCENE_HEIGHT = 520.0;
        
        // Constants for each square's XY coorfinates
        final int X1 = 10, Y1 = 10;
        final int X2 = 60, Y2 = 60;
        final int X3 = 110, Y3 = 110;
        
        // Constants for each square's width and height
        final int WIDTH1 = 500, HEIGHT1 = 500;
        final int WIDTH2 = 400, HEIGHT2 = 400;
        final int WIDTH3 = 300, HEIGHT3 = 300;
        
        // Constants for the circle's geometry
        final int CENTER_X = 260, CENTER_Y = 260, RADIUS = 150;
    }
}
