package application; //22BCE9109
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    public void start(Stage primaryStage) {
        TreeItem<String> rootItem = new TreeItem<String>("Tutorials");
        TreeItem<String> webItem = new TreeItem<String>("Web Tutorials");
        webItem.getChildren().add(new TreeItem<String>("HTML  Tutorial"));
        webItem.getChildren().add(new TreeItem<String>("HTML5 Tutorial"));
        webItem.getChildren().add(new TreeItem<String>("CSS Tutorial"));
        webItem.getChildren().add(new TreeItem<String>("SVG Tutorial"));
        rootItem.getChildren().add(webItem);
        TreeItem<String> javaItem = new TreeItem<String>("Java Tutorials");
        javaItem.getChildren().add(new TreeItem<String>("Java Language"));
        javaItem.getChildren().add(new TreeItem<String>("Java Collections"));
        javaItem.getChildren().add(new TreeItem<String>("Java Concurrency"));
        rootItem.getChildren().add(javaItem);
        TreeView<String> treeView = new TreeView<String>();
        treeView.setRoot(rootItem);
        treeView.setShowRoot(false);
        VBox vbox = new VBox(treeView);
        Scene scene = new Scene(vbox);
        primaryStage.setTitle("22BCE9109");
        primaryStage.setScene(scene);
        primaryStage.show();
    }}