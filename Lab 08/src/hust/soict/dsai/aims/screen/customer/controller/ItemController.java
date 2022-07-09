package hust.soict.dsai.aims.screen.customer.controller;

import java.io.IOException;

import hust.soict.dsai.aims.disc.Playable;
import hust.soict.dsai.aims.media.Media;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class ItemController {

    @FXML
    private Label IblTitle;

    @FXML
    private Button btnAddToCart;

    @FXML
    private Button btnPlay;

    @FXML
    private Label lblCost;

    @FXML
    void btnAddToCartClicked(ActionEvent event) {
    }

    @FXML
    void btnPlayClicked(ActionEvent event) throws IOException {
    	final String CART_FXML_FILE_PATH = "/hust/soict/dsai/aims/screen/customer/view/Play.fxml";
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(CART_FXML_FILE_PATH));
			fxmlLoader.setController(new PlayController());
			Parent root = fxmlLoader.load();
			Stage stage = (Stage)((Node) event.getSource()).getScene().getWindow();
			stage.setScene(new Scene(root));
			stage.setTitle("Play");
			stage.show();
    }
    
    private Media media;
    public void setData(Media media) {
    	this.media = media;
    	IblTitle.setText(media.getTitle());
    	lblCost.setText(media.getCost()+" $");
    	if (media instanceof Playable) {
    		btnPlay.setVisible(true);
    	}
    	else {
    		btnPlay.setVisible(false);
    		HBox.setMargin(btnAddToCart, new Insets(0, 0, 0, 60));
    	}
    }

}

