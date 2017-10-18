/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxbankmoklet;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.layout.GridPane;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author HP
 */
public class FXMLDocumentController implements Initializable {
    
    String pin = "";
    String PIN = "1234";
    int kesempatan = 3;
    int tmp;

      @FXML
    private Rectangle kotakan;

    @FXML
    private Label selamatdatang;

    @FXML
    private Separator garisbawah;

    @FXML
    private Label masukkanpin;

    @FXML
    private JFXPasswordField editPin;

    @FXML
    private GridPane grid;
    
    @FXML
    private JFXButton nomor4;

    @FXML
    private JFXButton nomor1;

    @FXML
    private JFXButton hurufC;

    @FXML
    private JFXButton nomor7;

    @FXML
    private JFXButton nomor2;

    @FXML
    private JFXButton nomor5;

    @FXML
    private JFXButton nomor3;

    @FXML
    private JFXButton nomor6;

    @FXML
    private JFXButton hurufOK;

    @FXML
    private JFXButton nomor0;

    @FXML
    private JFXButton nomor9;

    @FXML
    private JFXButton nomor8;
    
    @FXML
    void tekan1(ActionEvent event){
        pin +="1";
        editPin.setText(pin);
    }
    @FXML
    void tekan2(ActionEvent event){
        pin +="2";
        editPin.setText(pin);
    }
    @FXML
    void tekan3(ActionEvent event){
        pin +="3";
        editPin.setText(pin);
    }
    @FXML
    void tekan4(ActionEvent event){
        pin +="4";
        editPin.setText(pin);
    }
    @FXML
    void tekan5(ActionEvent event){
        pin +="5";
        editPin.setText(pin);
    }
    @FXML
    void tekan6(ActionEvent event){
        pin +="6";
        editPin.setText(pin);
    }
    @FXML
    void tekan7(ActionEvent event){
        pin +="7";
        editPin.setText(pin);
    }
    @FXML
    void tekan8(ActionEvent event){
        pin +="8";
        editPin.setText(pin);
    }
    @FXML
    void tekan9(ActionEvent event){
        pin +="9";
        editPin.setText(pin);
    }
    @FXML
    void tekanC(ActionEvent event){
        pin +="";
        editPin.setText(pin);
    }
    @FXML
    void tekan0(ActionEvent event){
        pin +="0";
        editPin.setText(pin);
    }
    @FXML
    void tekanOK(ActionEvent event){
        if (pin.equals(PIN)){
        try {
        //Hide this current window (if this is what you want)
        ((Node) (event.getSource())).getScene().getWindow().hide();
        //Load the new fxml
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("FXMLMenuAwal.fxml"));
        Scene scene = new Scene (fxmlLoader.load(), 830, 450);
        //Create new stage (Window), then set the new Scene
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("MenuAwal");
        stage.show();
        }
        catch (IOException e){
        System.out.println("Failed to create new Window." +e);
        }
        }
        else{
                kesempatan-= 1;
                JOptionPane.showMessageDialog(null, "PIN salah \nTersisa " + 
                kesempatan + "kesempatan lagi!");
                editPin.setText("");
                pin = "";
                if (kesempatan == 0){
                System.exit(0);
                }
        }
        }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    }


    /**
     * Initializes the controller class.
     */
    

    //@Override
    //public void initialize(URL url, ResourceBundle rb) {
        // TODO
    //}    
    

