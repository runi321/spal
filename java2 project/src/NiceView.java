import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.control.*;

public class NiceView {

    public VBox build() {
        VBox root = new VBox();
        TextField number1 = new TextField();
        TextField number2 = new TextField();
        Button computeBtn = new Button("Compute");
        Label resultLabel = new Label();


        computeBtn.setOnAction(e -> {
            int n1 = Integer.parseInt(number1.getText());
            int n2 = Integer.parseInt(number2.getText());
            int result = n1 + n2;

            resultLabel.setText(String.valueOf(result));


        });
        root.getChildren().addAll(number1, number2, computeBtn, resultLabel);
        return root;
        
    }
}



