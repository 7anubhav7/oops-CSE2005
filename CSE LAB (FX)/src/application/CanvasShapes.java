package application; //22BCE9109
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.canvas.*;
import javafx.scene.paint.Color;
import javafx.scene.Group;
public class Main extends Application {
    public void start(Stage stage)
    {
        stage.setTitle("22BCE9109");
        Canvas canvas = new Canvas();
        canvas.setHeight(400);
        canvas.setWidth(400);
        GraphicsContext graphics_context = 
            canvas.getGraphicsContext2D();
        graphics_context.setFill(Color.PINK);
        graphics_context.fillRect(40, 40, 100, 100);
        
        graphics_context.setFill(Color.RED);
        graphics_context.fillRect(20, 20, 70, 70);

        graphics_context.setFill(Color.BLUE);
        graphics_context.fillOval(30, 30, 70, 70);
        
        Group group = new Group(canvas);
        Scene scene = new Scene(group, 400, 400);
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String args[])
    {
        launch(args);
}}