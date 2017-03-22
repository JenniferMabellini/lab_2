/**
 * Sample Skeleton for 'Alien.fxml' Controller Class
 */

package it.polito.tdp.alien;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class AlienController {
	AlienDictionaryEnhanced elenco;

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="lblAlien"
    private Label lblAlien; // Value injected by FXMLLoader

    @FXML // fx:id="txtWord"
    private TextField txtWord; // Value injected by FXMLLoader

    @FXML // fx:id="btnTraslate"
    private Button btnTraslate; // Value injected by FXMLLoader

    @FXML // fx:id="txtResult"
    private TextArea txtResult; // Value injected by FXMLLoader

    @FXML // fx:id="btnReset"
    private Button btnReset; // Value injected by FXMLLoader

    @FXML
    void doReset(ActionEvent event) {
  
    	//cosi facendo cancello sia il testo nella test area e anche
    	//l'elenco col testo cosi che quando rifaro una successiva ricerca l'elenco sara
    	//vuoto poiche saranno state eliminate le parole aggiunte o ricercate in precedenza
    	txtResult.clear();
    	elenco.reset();

    }

    @FXML
    void doTranslate(ActionEvent event) {
    	String s= txtWord.getText().toLowerCase();
    	if(s.contains(" "))
    			{
    		String array[]= s.split(" ");
    		if(array[0].matches("[a-zA-Z]+")&&array[1].matches("[a-zA-Z]+"))
    		elenco.addWord(array[0], array[1]);
    			}
    	else {
    		List<String> c=null;
    		c=elenco.traslateWord(s);
    		String d = "";
    		for (String str : c)
    			d += str+"\n";
    		txtResult.setText(d);
    	}
    	
    	//txtResult.clear();
    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert lblAlien != null : "fx:id=\"lblAlien\" was not injected: check your FXML file 'Alien.fxml'.";
        assert txtWord != null : "fx:id=\"txtWord\" was not injected: check your FXML file 'Alien.fxml'.";
        assert btnTraslate != null : "fx:id=\"btnTraslate\" was not injected: check your FXML file 'Alien.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Alien.fxml'.";
        assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Alien.fxml'.";

        elenco= new AlienDictionaryEnhanced();
    }
}
