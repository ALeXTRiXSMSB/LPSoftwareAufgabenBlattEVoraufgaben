package E3;

/**
 * @author Alexander Karg
 */

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class E3Controller {

    @FXML
    private ListView begriffe;
    @FXML
    private TextField begriff;


    public void addToList(){
        ObservableList<String> liste = begriffe.getItems();
        liste.add(begriff.getText());
        begriffe.setItems(liste);
    }

    public void reset(){
        ObservableList<String> liste = begriffe.getItems();
        liste.clear();
        begriffe.setItems(liste);
    }
}
