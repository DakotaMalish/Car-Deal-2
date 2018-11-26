/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package malish.assignment.pkg3.pkg6.pkg0.car.dealership;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author RedPanda13
 */
public class FXMLDocumentController implements Initializable {
    
    private Label label;
    @FXML
    private ComboBox<String> carMakeInput;
    ObservableList<String> carListMake = FXCollections.observableArrayList(
            "Dodge","Ford","Honda","Toyota");
    
    @FXML
    private ComboBox<String> carModelInput;
    ObservableList<String> carListModel = FXCollections.observableArrayList(
            "Coupe","Hatchback","Sedan","Convertible","Sports Utility","Crossover");
   
    private Button updateInput;
    @FXML
    private ComboBox<?> carColorInput;
    @FXML
    private ComboBox<String> carRemoveSelect;
    @FXML
    private Button carRemoveBTN;
    @FXML
    private Button viewSelectedCar;    
    @FXML
    private ComboBox<?> truckMakeInput;
    @FXML
    private ComboBox<?> truckModelInput;
    @FXML
    private TextField truckPricePurchasedInput;
    @FXML
    private ComboBox<?> truckColorInput;
    @FXML
    private Button truckUpdateInput;
    @FXML
    private Label carInventory;
    
    
    @FXML
    private Label truckInventory;
    @FXML
    private Label motorcycleInventory;
    @FXML
    private TextField carPricePurchasedInput;
    @FXML
    private Button carUpdateInput;
    @FXML
    private Label doorsDisplay;
    @FXML
    private Label capacityDisplay;
    @FXML
    private Label colorDisplay;
    @FXML
    private Label pricePurchasedDisplay;
    @FXML
    private Label commissionDisplay;
    @FXML
    private Label makeDisplay;
    @FXML
    private Label modelDisplay;
    @FXML
    private ComboBox<?> motoColorInput;
    @FXML
    private Button motoUpdateInput;
    @FXML
    private TextField motoPricePurchasedInput;
    @FXML
    private ComboBox<?> motoModelInput;
    @FXML
    private ComboBox<?> motoMakeInput;
    @FXML
    private Label colorDisplay1;
    @FXML
    private Label towingDisplay;
    @FXML
    private ComboBox<?> truckDoorsInput;
    @FXML
    private ComboBox<?> truckCapacityInput;
    @FXML
    private ComboBox<?> carDoorsInput;
    @FXML
    private ComboBox<?> carCapacityInput;
    @FXML
    private ComboBox<?> motoDoorsInput;
    @FXML
    private ComboBox<?> motoCapacityInput;
    @FXML
    private TextField askingPriceInput;
    
    
     
//CAR BLOCK***************************************************************************************************************************    
    @Override
//    @FXML
    public void initialize(URL url, ResourceBundle rb) {
//
//    @FXML
//    public void comboChanged(URL url, ResourceBundle rb){
        carMakeInput.setItems(carListMake);
        carModelInput.setItems(carListModel);
    }
    
    public void comboChanged(ActionEvent event){
        updateInput.setOnAction(e ->{
            
            makeDisplay.setText(carMakeInput.getValue());
            modelDisplay.setText(carModelInput.getValue());
        });
         
        
        carUpdateInput.setOnAction(e -> {
        
        Car[] carArray = new Car[10];
        carArray[10] = new Car( make, model, color, purchasePrice);
            
        
        });  
            
        
    }
//**********************************************************************************************************************************
        
    
    
    }    
    

