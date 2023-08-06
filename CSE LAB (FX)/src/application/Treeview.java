package application; //22BCE9109
import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
public class Main extends Application {
 private final Node rootIcon = new ImageView( //for importing image files
 //new Image(getClass().getResourceAsStream("folder_16.png"))  
 );
 public static void main(String[] args) {
 launch(args);
 }
 public void start(Stage primaryStage) {
 primaryStage.setTitle("22BCE9109");
 TreeItem<String> rootItem = new TreeItem<String> ("Inbox", rootIcon);
 rootItem.setExpanded(true);
 for (int i = 1; i < 6; i++) {
 TreeItem<String> item = new TreeItem<String> ("Message" + i);
 rootItem.getChildren().add(item);
 }
 TreeView<String> tree = new TreeView<String> (rootItem);
 StackPane root = new StackPane();
 root.getChildren().add(tree);
 primaryStage.setScene(new Scene(root, 300, 250));
 primaryStage.show();
 }}