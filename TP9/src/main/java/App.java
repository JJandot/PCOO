import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Group group = new Group();
        Drawer drawer = new Drawer(800, 600);
        group.getChildren().add(drawer);
        primaryStage.setScene(new Scene(group));
        primaryStage.setTitle("Tp 9");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
