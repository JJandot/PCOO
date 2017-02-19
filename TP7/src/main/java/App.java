import Drawers.Drawer;
import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;


public class App extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws InterruptedException {
        Group root = new Group();
        final Drawer container = new Drawer(800, 600);
        root.getChildren().add(container);
        primaryStage.setScene(new Scene(root));
        primaryStage.setTitle("TP 7");
        primaryStage.show();
    }
}
