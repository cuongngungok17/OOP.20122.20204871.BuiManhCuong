package hust.soict.dsai.aims.screen.customer.controller;

import hust.soict.dsai.aims.media.Media;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;

public class PlayController {
	private Media media;
    
    @FXML
    private AnchorPane play;
    
    @FXML
    private Text TextPlay;

    @FXML
    void playmedia(ActionEvent event) {
    	//TextPlay.set = "Play "+ media.getTitle();
    }

}
