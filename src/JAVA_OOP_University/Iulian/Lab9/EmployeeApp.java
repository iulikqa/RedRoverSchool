/*package JAVA_OOP_University.Iulian.Lab9;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeApp extends Application {
    private List<EmployeeLab1> employees = new ArrayList<>();
    private TextArea displayArea = new TextArea();

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Employee Management");

        TextField idField = new TextField();
        idField.setPromptText("ID");
        TextField firstNameField = new TextField();
        firstNameField.setPromptText("First Name");
        TextField lastNameField = new TextField();
        lastNameField.setPromptText("Last Name");
        TextField positionField = new TextField();
        positionField.setPromptText("Position");
        TextField addressField = new TextField();
        addressField.setPromptText("Address");
        TextField phoneField = new TextField();
        phoneField.setPromptText("Phone");
        TextField salaryField = new TextField();
        salaryField.setPromptText("Salary");

        Button addButton = new Button("Add Employee");
        addButton.setOnAction(e -> {
            try {
                int id = Integer.parseInt(idField.getText());
                double salary = Double.parseDouble(salaryField.getText());
                EmployeeLab1 emp = new EmployeeLab1(id, firstNameField.getText(), lastNameField.getText(),
                        positionField.getText(), addressField.getText(), phoneField.getText(), salary);
                employees.add(emp);
                displayEmployees();
            } catch (NumberFormatException ex) {
                showAlert("Invalid input", "Please enter valid numeric values for ID and Salary.");
            }
        });

        Button saveButton = new Button("Save to File");
        saveButton.setOnAction(e -> saveToFile());

        VBox layout = new VBox(10, idField, firstNameField, lastNameField, positionField, addressField, phoneField, salaryField, addButton, saveButton, displayArea);
        Scene scene = new Scene(layout, 400, 500);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void displayEmployees() {
        StringBuilder sb = new StringBuilder();
        for (EmployeeLab1 emp : employees) {
            sb.append(emp.getId()).append(" - ").append(emp.getFirstName()).append(" ").append(emp.getLastName()).append("\n");
        }
        displayArea.setText(sb.toString());
    }

    private void saveToFile() {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("employees.dat"))) {
            out.writeObject(employees);
        } catch (IOException e) {
            showAlert("Error", "Failed to save data.");
        }
    }

    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(title);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
*/
