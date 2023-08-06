package application; //22BCE9109
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
public class Main extends Application {
public void start(Stage outStageObject) {
outStageObject.setTitle("22BCE9109");
Pane paneObject = new Pane();
Canvas canvasRef = new Canvas(300, 300);
GraphicsContext graphicsContext = canvasRef.getGraphicsContext2D();
graphicsContext.beginPath();

graphicsContext.moveTo(35, 35);
graphicsContext.lineTo(155, 35);
graphicsContext.lineTo(155, 155);
graphicsContext.lineTo(35, 35);
graphicsContext.stroke();
paneObject.getChildren().add(canvasRef);
Scene sceneObject = new Scene(paneObject, 300, 250, Color.CHARTREUSE);
outStageObject.setScene(sceneObject);
outStageObject.show();
}
public static void main(String[] args) {
launch(args);
}}