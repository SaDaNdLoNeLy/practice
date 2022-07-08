import java.net.URL;
import java.util.ResourceBundle;

import data.Place;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.ContextMenuEvent;
import javafx.scene.input.MouseEvent;

public class SceneController implements Initializable {

    @FXML
    private TableView<Place> table;

    @FXML
    private TableColumn<Place, String> label;

    @FXML
    private TableColumn<Place, Float> latitude;

    @FXML    
    private TableColumn<Place, Float> longtitude;

    @FXML
    private TableColumn<Place, String> type;

    @FXML
    private TreeView treeView;

    private ObservableList<Place> listHistoricBd = FXCollections.observableArrayList(
        new Place("Chua mot cot", 12.54, 15.65, "historic building"),
        new Place("Chua mot cot", 12.54, 15.65, "historic building"),
        new Place("Chua mot cot", 12.54, 15.65, "historic building")
    );

    private ObservableList<Place> listReligiousBd = FXCollections.observableArrayList(
        new Place("Chua hai cot", 12.54, 15.65, "religious building"),
        new Place("Chua hai cot", 12.54, 15.65, "religious building"),
        new Place("Chua hai cot", 12.54, 15.65, "religious building")
    );

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        // TODO Auto-generated method stub

        TreeItem<String> vnTourism = new TreeItem<>("VN TOURISM");

        TreeItem<String> building = new TreeItem<>("BUILDING");
        TreeItem<String> naturalPlace = new TreeItem<>("NATURAL PLACE");

        TreeItem<String> skyscraper = new TreeItem<>("SKYSCRAPER");
        TreeItem<String> historicBuilding = new TreeItem<>("HISTORIC BUILDING");
        TreeItem<String> religiousBuilding = new TreeItem<>("RELIGIOUS BUILDING");
        TreeItem<String> museum = new TreeItem<>("MUSEUM");

        TreeItem<String> nationalPark = new TreeItem<>("NATIONAL PARK");
        TreeItem<String> cave = new TreeItem<>("CAVE");
        TreeItem<String> beach = new TreeItem<>("BEACH");
        TreeItem<String> bodyOfWater = new TreeItem<>("BODY OF WATER");

        building.getChildren().addAll(skyscraper, historicBuilding, religiousBuilding, museum);
        naturalPlace.getChildren().addAll(nationalPark, cave, beach, bodyOfWater);



        vnTourism.getChildren().addAll(building, naturalPlace);

        treeView.setRoot(vnTourism);


    }

    @FXML
    void selectItem(MouseEvent event) {
        TreeItem<String> item = (TreeItem<String>) treeView.getSelectionModel().getSelectedItem();

        if (item.getValue()=="HISTORIC BUILDING"){
            label.setCellValueFactory(new PropertyValueFactory<Place, String>("label"));
            latitude.setCellValueFactory(new PropertyValueFactory<Place, Float>("la"));
            longtitude.setCellValueFactory(new PropertyValueFactory<Place, Float>("lo"));
            type.setCellValueFactory(new PropertyValueFactory<Place, String>("type"));
            table.setItems(listHistoricBd);
        }
        else if (item.getValue()=="RELIGIOUS BUILDING"){
            label.setCellValueFactory(new PropertyValueFactory<Place, String>("label"));
            latitude.setCellValueFactory(new PropertyValueFactory<Place, Float>("la"));
            longtitude.setCellValueFactory(new PropertyValueFactory<Place, Float>("lo"));
            type.setCellValueFactory(new PropertyValueFactory<Place, String>("type"));
            table.setItems(listReligiousBd);
        }
        else if (item.getValue()=="SKYSCRAPER"){
            label.setCellValueFactory(new PropertyValueFactory<Place, String>("label"));
            latitude.setCellValueFactory(new PropertyValueFactory<Place, Float>("la"));
            longtitude.setCellValueFactory(new PropertyValueFactory<Place, Float>("lo"));
            type.setCellValueFactory(new PropertyValueFactory<Place, String>("type"));
            table.setItems(listReligiousBd);
        }
        else if (item.getValue()=="MUSEUM"){
            label.setCellValueFactory(new PropertyValueFactory<Place, String>("label"));
            latitude.setCellValueFactory(new PropertyValueFactory<Place, Float>("la"));
            longtitude.setCellValueFactory(new PropertyValueFactory<Place, Float>("lo"));
            type.setCellValueFactory(new PropertyValueFactory<Place, String>("type"));
            table.setItems(listReligiousBd);
        }
        else if (item.getValue()=="NATIONAL PARK"){
            label.setCellValueFactory(new PropertyValueFactory<Place, String>("label"));
            latitude.setCellValueFactory(new PropertyValueFactory<Place, Float>("la"));
            longtitude.setCellValueFactory(new PropertyValueFactory<Place, Float>("lo"));
            type.setCellValueFactory(new PropertyValueFactory<Place, String>("type"));
            table.setItems(listReligiousBd);
        }
        else if (item.getValue()=="CAVE"){
            label.setCellValueFactory(new PropertyValueFactory<Place, String>("label"));
            latitude.setCellValueFactory(new PropertyValueFactory<Place, Float>("la"));
            longtitude.setCellValueFactory(new PropertyValueFactory<Place, Float>("lo"));
            type.setCellValueFactory(new PropertyValueFactory<Place, String>("type"));
            table.setItems(listReligiousBd);
        }
        else if (item.getValue()=="BEACH"){
            label.setCellValueFactory(new PropertyValueFactory<Place, String>("label"));
            latitude.setCellValueFactory(new PropertyValueFactory<Place, Float>("la"));
            longtitude.setCellValueFactory(new PropertyValueFactory<Place, Float>("lo"));
            type.setCellValueFactory(new PropertyValueFactory<Place, String>("type"));
            table.setItems(listReligiousBd);
        }
        else if (item.getValue()=="BODY OF WATER"){
            label.setCellValueFactory(new PropertyValueFactory<Place, String>("label"));
            latitude.setCellValueFactory(new PropertyValueFactory<Place, Float>("la"));
            longtitude.setCellValueFactory(new PropertyValueFactory<Place, Float>("lo"));
            type.setCellValueFactory(new PropertyValueFactory<Place, String>("type"));
            table.setItems(listReligiousBd);
        }

        


        

        System.out.println(item.getValue());
    }

    

}
