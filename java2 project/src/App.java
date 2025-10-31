import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


 public class App extends Application {
     public static void main(String[] args) {
        launch();
        }

    @Override
    public void start(Stage stage) {
        // Give the scene some root, width and height
        // Perhaps create a class that builds the root for you
        Photos view = new Photos();

        Scene scene = new Scene(view.build(), 400, 300);

        // Put a title on the window
        stage.setTitle("Hippopotamus");
        stage.setScene(scene);
        stage.show();
    }
 }
