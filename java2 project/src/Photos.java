import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;

public class Photos {

    public BorderPane build() {
        
        BorderPane root = new BorderPane();

        
        Image image1 = new Image("file:C:/Users/runip/OneDrive/Skrivebord/Java2 project//flothestur.jpg");
        Image image2 = new Image("file:C:/Users/runip/OneDrive/Skrivebord/Java2 project//badger.jpg");

        
        ImageView photo1 = new ImageView(image1);
        photo1.setFitWidth(1500);
        photo1.setFitHeight(500);
        photo1.setPreserveRatio(true);

        ImageView photo2 = new ImageView(image2);
        photo2.setFitWidth(1600);
        photo2.setFitHeight(500);
        photo2.setPreserveRatio(true);

        
        root.setCenter(photo1);
        root.setTop(photo2);

        return root;
    }
}