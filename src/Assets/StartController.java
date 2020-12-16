package Assets;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

 //TODO date(published,lastSaved) two buttons (edit/delete) in tableView

public class StartController {
    @FXML
    TableView<RiskAnalysisModel> tableView = new TableView<>();

    @FXML
    TableColumn<RiskAnalysisModel, String> riskAnalysisTitle = new TableColumn<>();

    private RiskManager main;//Opretter forbindelser over imod main klassen som er RiskManager


    @FXML
    private void initialize() { //Initialiserer disse værdier når start scenen kører
        riskAnalysisTitle.setCellValueFactory(cellData -> cellData.getValue().getTitleProperty()); //Indsætter titel værdien i tableview
        riskAnalysisTitle.setStyle("-fx-alignment: CENTER");
    }

    public void setMain(RiskManager main) {//Henter værdierne ind i tableview
        this.main = main;//Kører imod RiskManager klassen da den er main
        tableView.setItems(main.getRiskAnalysisTitleList());
    }

    public StartController() {  //default constructor

    }
    @FXML
    private void creatBtnAction() {     //Create button eventhandler

        RiskAnalysisModel model = new RiskAnalysisModel("");
        int returnValue = main.setCreatePage(model);
        if (returnValue == 1) {
            main.getRiskAnalysisTitleList().add(model);

        }
    }
    }




