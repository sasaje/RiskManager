/*
 *
 * Developed by Sara Sandager (sara590x@edu.easj.dk)
 * Licensed under the MIT License
 * 11/12/2020
 *
 */
/*
package Assets;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;



import java.io.IOException;
import java.net.URL;
import java.util.Date;
import java.util.ResourceBundle;

public class Controller implements Initializable{
    // eventHandlers, @FXML osv.
    @FXML
    Button creatBtn, addBtn, saveBtnRA, cancelBtnRisk, saveBtnRisk;

    @FXML
    Button menuBtcreat, menuBtoverview;

    @FXML
    TableView<ModelRA> tableView = new TableView<>();

    @FXML
    public TableColumn<ModelRA, String> riskAnalysisTitle = new TableColumn<>();

    @FXML
    TextField RAtitleTextField;
   /* @FXML
    TableColumn<ModelRA, Date> publishedDate;
    @FXML
    TableColumn<ModelRA, Date> lastSavedDate;

    */
 /*  private ObservableList<ModelRA> models;
           //= FXCollections.observableArrayList(
          // new ModelRA("title1"),
          // new ModelRA("title2")
  // );

    @FXML
    @Override
    public void initialize(URL location, ResourceBundle resources) {
         models = FXCollections.observableArrayList();
        riskAnalysisTitle.setCellValueFactory(new PropertyValueFactory<>("title"));
        //title.setCellValueFactory(new PropertyValueFactory<>("publishedDate"));
        // title.setCellValueFactory(new PropertyValueFactory<>("lastSavedDate"));
        tableView.setItems(models);

    } */

   /* private ObservableList<ModelRA> models = FXCollections.observableArrayList(
            new ModelRA("title1"),
            new ModelRA("title2")
    );



    public void creatBtnHandler(ActionEvent event) {
        try {
            Parent root1 = FXMLLoader.load(getClass().getResource("RiskManager_creat.fxml"));
            Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
            window.setTitle("RISK MANAGER 2020");
            window.setScene(new Scene(root1));
            window.show();

        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void addBtnHandler(ActionEvent event) {
        try {
            Parent root2 = FXMLLoader.load(getClass().getResource("RiskManager_add.fxml"));
            Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
            window.setTitle("RISK MANAGER 2020");
            window.setScene(new Scene(root2));
            window.show();

        } catch (IOException e) {
            e.printStackTrace();

        }

    }

    public void saveBtnRAHandler(ActionEvent event) {
        try {
            Parent root3 = FXMLLoader.load(getClass().getResource("RiskManager_start.fxml"));
            Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
            window.setTitle("RISK MANAGER 2020");
            window.setScene(new Scene(root3));
            window.show();

            //TableView
            riskAnalysisTitle.setCellValueFactory(new PropertyValueFactory<>("title"));

            ModelRA modelclass = new ModelRA(RAtitleTextField.getText());
            models.add(modelclass);
            tableView.setItems(models);



            System.out.println(RAtitleTextField.getText());









        }catch (IOException e) {
            e.printStackTrace();
        }

    }
    public void clickBtToStart(ActionEvent event) {  //going to start(view)page without update
        try {
            Parent root4 = FXMLLoader.load(getClass().getResource("RiskManager_start.fxml"));
            Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
            window.setTitle("RISK MANAGER 2020");
            window.setScene(new Scene(root4));
            window.show();

        }catch (IOException e) {
            e.printStackTrace();
        }
     }

     public void SaveBtnRiskHandler(ActionEvent event) {
         try {
             Parent root5 = FXMLLoader.load(getClass().getResource("RiskManager_overview.fxml"));
             Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
             window.setTitle("RISK MANAGER 2020");
             window.setScene(new Scene(root5));
             window.show();

             //Tableview - all saved risks data and RiskAnalysis Title

         }catch (IOException e) {
             e.printStackTrace();
         }

     }



    }


*/