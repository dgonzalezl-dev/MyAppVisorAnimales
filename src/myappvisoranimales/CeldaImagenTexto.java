/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myappvisoranimales;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

public class CeldaImagenTexto extends ListCell<Animal> {
    VBox vb;
    ImageView imagen;
    Label etq;
    
    public CeldaImagenTexto(){
        imagen=new ImageView();
        vb=new VBox();
        etq=new Label();
        imagen.setFitWidth(100);
        imagen.setFitHeight(100);
        vb.getChildren().add(imagen);
        vb.getChildren().add(etq);
        vb.setAlignment(Pos.CENTER);
    }
    @Override
    protected void updateItem(Animal animal, boolean vacia) {
        super.updateItem(animal, vacia);
        if(animal!=null){
            etq.setText(animal.getNombre());
            imagen.setImage(new Image(animal.getImagenG()));
            setGraphic(vb);
        }
    }
}
