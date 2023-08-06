package application; //22BCE9109
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
public class Main extends Application {
private TextField tfAnnualInterestRate = new TextField();
private TextField tfNumberOfYears = new TextField();
private TextField tfLoanAmount = new TextField();
private TextField tfMonthlyPayment = new TextField();
private TextField tfTotalPayment = new TextField();
private Button btCalculate = new Button("Calculate");
@Override
public void start(Stage primaryStage) {
// Create UI
GridPane gridPane = new GridPane();
gridPane.setHgap(5);
gridPane.setVgap(5);
gridPane.add(new Label("Annual Interest Rate:"), 0, 0);
gridPane.add(tfAnnualInterestRate, 1, 0);
gridPane.add(new Label("Number of Years:"), 0, 1);
gridPane.add(tfNumberOfYears, 1, 1);
gridPane.add(new Label("Loan Amount:"), 0, 2);
gridPane.add(tfLoanAmount, 1, 2);
gridPane.add(new Label("Monthly Payment:"), 0, 3);
gridPane.add(tfMonthlyPayment, 1, 3);
gridPane.add(new Label("Total Payment:"), 0, 4);
gridPane.add(tfTotalPayment, 1, 4);
gridPane.add(btCalculate, 1, 5);
btCalculate.setOnAction(e -> calculateLoanPayment());
Scene scene = new Scene(gridPane, 400, 250);
primaryStage.setTitle("22BCE9109");
primaryStage.setScene(scene);
primaryStage.show();
}
private void calculateLoanPayment() {
// Get values from text fields
double interest = Double.parseDouble(tfAnnualInterestRate.getText());
int year = Integer.parseInt(tfNumberOfYears.getText());
double loanAmount = Double.parseDouble(tfLoanAmount.getText());
// Create a loan object
loancal1 loan = new loancal1(interest, year, loanAmount);
// Display monthly payment and total payment
tfMonthlyPayment.setText(String.format("$%.2f", loan.getMonthlyPayment()));
tfTotalPayment.setText(String.format("$%.2f", loan.getTotalPayment()));
}
public static void main(String[] args) {
launch(args);
}}