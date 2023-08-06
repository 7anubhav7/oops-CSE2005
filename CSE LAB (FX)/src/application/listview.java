package application; //22BCE9109
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.SelectionMode;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.collections.FXCollections;
public class Main extends Application {
private String[] flagTitles = {"United States of America", "Canada", "China", 
"Denmark", "France", "Germany", "India"};
private ImageView[] ImageViews = { //for image linking
//new ImageView("image/us.gif"),
//new ImageView("image/ca.gif"),
//new ImageView("image/china.gif"),
//new ImageView("image/denmark.gif"),
//new ImageView("image/fr.gif"),
//new ImageView("image/germany.gif"),
//new ImageView("image/india.gif")
}; 
public void start(Stage primaryStage) {
ListView<String> lv = new ListView<>(FXCollections
.observableArrayList(flagTitles));
lv.setPrefSize(400, 400);
lv.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

FlowPane imagePane = new FlowPane(10, 10);
BorderPane pane = new BorderPane();
pane.setLeft(new ScrollPane(lv)); 
pane.setCenter(imagePane);
lv.getSelectionModel().selectedItemProperty().addListener(
ov -> { 
imagePane.getChildren().clear();
for (Integer i: lv.getSelectionModel().getSelectedIndices()) {
imagePane.getChildren().add(ImageViews[i]);
}
});
Scene scene = new Scene(pane, 450, 170);
primaryStage.setTitle("22BCE9109"); 
primaryStage.setScene(scene); 
primaryStage.show(); 
}
public static void main(String[] args) {
launch(args);}}