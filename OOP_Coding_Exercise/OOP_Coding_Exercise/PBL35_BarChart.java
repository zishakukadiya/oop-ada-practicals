import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class PBL35_BarChart extends Application {

    @Override
    public void start(Stage stage) {
        String[] labels  = {"Projects", "Quizzes", "Midterm", "Final"};
        int[]    percents = {20, 10, 30, 40};
        Color[]  colors   = {Color.RED, Color.BLUE, Color.GREEN, Color.ORANGE};

        double maxHeight = 300.0;
        double barWidth  = 80.0;

        HBox hbox = new HBox(30);
        hbox.setAlignment(Pos.BOTTOM_CENTER);
        hbox.setPadding(new Insets(20, 40, 20, 40));
        hbox.setStyle("-fx-background-color: #1a1a2e;");

        for (int i = 0; i < labels.length; i++) {
            double barHeight = (percents[i] / 100.0) * maxHeight;

            Rectangle bar = new Rectangle(barWidth, barHeight, colors[i]);
            bar.setArcWidth(6);
            bar.setArcHeight(6);

            Text pctText = new Text(percents[i] + "%");
            pctText.setFill(Color.WHITE);
            pctText.setFont(Font.font("Arial", FontWeight.BOLD, 14));

            Text labelText = new Text(labels[i] + "\n" + percents[i] + "%");
            labelText.setFill(Color.LIGHTGRAY);
            labelText.setFont(Font.font("Arial", 12));

            VBox col = new VBox(6, pctText, bar, labelText);
            col.setAlignment(Pos.BOTTOM_CENTER);
            hbox.getChildren().add(col);
        }

        Text title = new Text("Grade Distribution Chart");
        title.setFill(Color.WHITE);
        title.setFont(Font.font("Arial", FontWeight.BOLD, 18));

        VBox root = new VBox(15, title, hbox);
        root.setAlignment(Pos.CENTER);
        root.setStyle("-fx-background-color: #1a1a2e;");
        root.setPadding(new Insets(20));

        Scene scene = new Scene(root, 600, 460);
        stage.setTitle("PBL 35 - Grade Bar Chart");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
