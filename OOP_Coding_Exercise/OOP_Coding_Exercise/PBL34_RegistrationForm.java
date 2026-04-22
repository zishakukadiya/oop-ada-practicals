import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class PBL34_RegistrationForm extends Application {

    @Override
    public void start(Stage stage) {
        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(12);
        grid.setPadding(new Insets(20));
        grid.setStyle("-fx-background-color: #1a1a2e; -fx-font-size: 14px;");

        Label lblRoll  = new Label("Roll No:");
        Label lblName  = new Label("Name:");
        Label lblAge   = new Label("Age:");
        Label lblEmail = new Label("Email:");
        for (Label l : new Label[]{lblRoll, lblName, lblAge, lblEmail}) {
            l.setStyle("-fx-text-fill: white;");
        }

        TextField tfRoll  = new TextField();
        TextField tfName  = new TextField();
        TextField tfAge   = new TextField();
        TextField tfEmail = new TextField();

        Button btnSubmit = new Button("Submit");
        btnSubmit.setStyle("-fx-background-color: #00b894; -fx-text-fill: white; -fx-font-weight: bold;");

        grid.add(lblRoll,  0, 0); grid.add(tfRoll,  1, 0);
        grid.add(lblName,  0, 1); grid.add(tfName,  1, 1);
        grid.add(lblAge,   0, 2); grid.add(tfAge,   1, 2);
        grid.add(lblEmail, 0, 3); grid.add(tfEmail, 1, 3);
        grid.add(btnSubmit, 1, 4);

        btnSubmit.setOnAction(e -> {
            String roll  = tfRoll.getText().trim();
            String name  = tfName.getText().trim();
            String age   = tfAge.getText().trim();
            String email = tfEmail.getText().trim();

            // Validation
            try {
                Integer.parseInt(roll);
            } catch (NumberFormatException ex) {
                showAlert(Alert.AlertType.ERROR, "Validation Error", "Roll No must be an integer.");
                return;
            }
            try {
                Integer.parseInt(age);
            } catch (NumberFormatException ex) {
                showAlert(Alert.AlertType.ERROR, "Validation Error", "Age must be an integer.");
                return;
            }
            if (!email.contains("@") || !email.contains(".")) {
                showAlert(Alert.AlertType.ERROR, "Validation Error", "Invalid email address.");
                return;
            }
            if (name.isEmpty()) {
                showAlert(Alert.AlertType.ERROR, "Validation Error", "Name cannot be empty.");
                return;
            }

            String msg = "Roll No : " + roll + "\nName    : " + name +
                         "\nAge     : " + age + "\nEmail   : " + email;
            showAlert(Alert.AlertType.INFORMATION, "Registration Successful", msg);
        });

        Scene scene = new Scene(grid, 380, 260);
        stage.setTitle("PBL 34 - Registration Form");
        stage.setScene(scene);
        stage.show();
    }

    private void showAlert(Alert.AlertType type, String title, String msg) {
        Alert alert = new Alert(type);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(msg);
        alert.showAndWait();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
