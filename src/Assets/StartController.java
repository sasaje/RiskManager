package Assets;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class StartController {
    @FXML
    TableView<RiskAnalysisModel> tableView = new TableView<>();

    @FXML
    TableColumn<RiskAnalysisModel, String> riskAnalysisTitle = new TableColumn<>();

    private RiskManager main;

    @FXML
    private void initialize() {
        riskAnalysisTitle.setCellValueFactory(cellData -> cellData.getValue().getTitleProperty());
        riskAnalysisTitle.setStyle("-fx-alignment: CENTER");
    }

    public void setMain(RiskManager main) {
        this.main = main;
        tableView.setItems(main.getRiskAnalysisTitleList());
    }

    public StartController() {

    }
    @FXML
    private void creatBtnAction() {
        RiskAnalysisModel model = new RiskAnalysisModel("");
        int returnValue = main.setCreatPage(model);
        if (returnValue == 1) {
            main.getRiskAnalysisTitleList().add(model);
        }

    }


}
