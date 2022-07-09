package hust.soict.dsai.aims.screen.customer.controller;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.disc.Playable;
import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.store.Store;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.Region;

public class CartController {
	private Cart cart;
    public CartController(Store store, Cart cart) {
		this.cart = cart;
	}
	@FXML
    private Label costLabel;

    @FXML
    private ToggleGroup filterCategory;
    
    @FXML
    private TableView<Media> tblMedia;
    
    @FXML
    private TableColumn<Media, Integer> colMediaId;

    @FXML
    private TableColumn<Media, Float> colMediaCost;

    @FXML
    private Button btnPlay;
    
    @FXML
    private Button btnRemove;


    @FXML
    private TableColumn<Media, String> colMediaTitle;

    @FXML
    private TableColumn<Media, String> colMediaCategory;
    
    
    @FXML
    void btnViewStorePressed(ActionEvent event) {

    }
    
    @FXML
    public void initialize() {
    	colMediaId.setCellValueFactory(
    			new PropertyValueFactory<Media, Integer>("id"));
    	colMediaTitle.setCellValueFactory(
    			new PropertyValueFactory<Media, String>("Title"));
    	colMediaCategory.setCellValueFactory(
    			new PropertyValueFactory<Media, String>("Category"));
    	colMediaCost.setCellValueFactory(
    			new PropertyValueFactory<Media, Float>("Cost"));
    	if  (cart.getItemsOrdered() != null)
    		tblMedia.setItems(cart.getItemsOrdered());
    	
    	btnPlay.setVisible(false);
    	btnRemove.setVisible(false);
    	tblMedia.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Media>() {
    		@Override
    		public void changed(ObservableValue<? extends Media> observable, Media oldValue, Media newValue) {
    			updateButtonBar(newValue);
    		}
    	});
    }
    void updateButtonBar(Media media) {
    	if (media == null) {
    		btnPlay.setVisible(false);
    		btnRemove.setVisible(false);
    	}
    	else {
    		btnRemove.setVisible(true);
    		if (media instanceof Playable) {
    			btnPlay.setVisible(true);
    		}
    		else {
    			btnPlay.setVisible(false);
    		}
    	}
    }
    
    @FXML
    void btnRemovePressed(ActionEvent event) {
    	Media media = (Media) tblMedia.getSelectionModel().getSelectedItem();
    	cart.removeMedia(media);
    }

    @FXML
    void btnPlayPressed(ActionEvent event) {

    }





}

