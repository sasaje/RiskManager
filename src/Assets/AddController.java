package Assets;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class AddController {
    @FXML
    TextField riskTitleTextField, riskFileNameTextField, riskProbabilityTextField,
               riskConsequenceTextField, riskRevisedProbabilityTextField, riskRevisedConsequenceTextField;
    @FXML
    ChoiceBox riskPriorityChoicebox;
    @FXML
    TextArea riskResponseStrategyTextArea;

    @FXML
    Button topOverViewBtn, topRiskAnalysisTitleBtn;

    @FXML
    Button saveRiskBtn, cancelRiskBtn;

    private Stage addStage;
    private RiskModel riskModel;


    @FXML
    private void initialize(){

    }

    public void setAddStage(Stage addStage) {
        this.addStage = addStage;
    }

    public void setRiskModel(RiskModel riskModel) {
        this.riskModel = riskModel;
        riskTitleTextField.setText(riskModel.getRiskTitle());
        riskFileNameTextField.setText(riskModel.getRiskFileName());
        riskProbabilityTextField.setText(riskModel.getRiskProbability());
        riskConsequenceTextField.setText(riskModel.getRiskConsequence());
        // riskPriorityChoicebox
        riskRevisedProbabilityTextField.setText(riskModel.getRiskRevisedProbability());
        riskRevisedConsequenceTextField.setText(riskModel.getRiskRevisedConsequence());
        riskResponseStrategyTextArea.setText(riskModel.getRiskResponseStrategy());
    }

    @FXML
    private void saveRiskAction() {

        // riskModel.setRiskTitle(riskTitleTextField.getText());

    }


}
