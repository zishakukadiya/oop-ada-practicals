import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.Random;

public class PBL33_TextNodes extends Application {

    @Override
    public void start(Stage stage) {
        VBox vbox = new VBox(15);
        vbox.setAlignment(Pos.CENTER);
        vbox.setPadding(new Insets(30));
        vbox.setStyle("-fx-background-color: #1a1a2e;");

        Random rand = new Random();
        Font font = Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 22);

        for (int i = 1; i <= 5; i++) {
            Text text = new Text("Text " + i);
            text.setFont(font);

            double r = rand.nextDouble();
            double g = rand.nextDouble();
            double b = rand.nextDouble();
            double opacity = 0.3 + rand.nextDouble() * 0.7; // 0.3 to 1.0

            text.setFill(new Color(r, g, b, opacity));
            vbox.getChildren().add(text);
        }

        Scene scene = new Scene(vbox, 400, 350);
        stage.setTitle("PBL 33 - Random Text Nodes");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
