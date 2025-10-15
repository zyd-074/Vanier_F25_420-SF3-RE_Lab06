package vaniercollege.zyd;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.shape.*;
import javafx.stage.Stage;

/**
 * @author Yu Duo Zhang (2480549)
 */
public class YuDuoZhang_Lab06 extends Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        Rectangle rect = new Rectangle();
        rect.setWidth(10);
        rect.setHeight(15);
        rect.setX(100);
        rect.setY(200);
        
        HBox root = new HBox();
        
        Scene scene = new Scene(root, 300, 200);
        stage.setScene(scene);
        stage.show();
    }
}
