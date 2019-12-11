/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myappvisoranimales;

import java.lang.reflect.Field;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.util.Callback;
import myappvisoranimales.Animal;

/**
 *
 * @author Usuario
 */
public class FXMLDocumentController implements Initializable {
    ObservableList<Animal> animales;
    Animal animalSeleccionado;
    @FXML
    private ListView<Animal> listV;
    @FXML
    private ImageView image;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        listV.setCellFactory(new Callback<ListView<Animal>, ListCell<Animal>>() {
            @Override
            public ListCell<Animal> call(ListView<Animal> param) {
                return new CeldaImagenTexto();
            }
        });
        animales=FXCollections.observableArrayList();
        Animal delfin=new Animal("Delfin","","Recursos/Delfin.jpg");
        animales.add(delfin);
        animales.add(new Animal("Elefante","","Recursos/Elefante.jpg"));
        animales.add(new Animal("Leon","","Recursos/Leon.jpg"));
        listV.setItems(animales);
        listV.getSelectionModel().select(delfin);
        image.setImage(new Image(delfin.getImagenG()));
        
        listV.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Animal>(){
            @Override
            public void changed(ObservableValue<? extends Animal> observable, Animal oldValue, Animal newValue) {
                animalSeleccionado=newValue;
                image.setImage(new Image(animalSeleccionado.getImagenG()));
            }
        });
    }     
}