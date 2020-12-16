package Assets;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class CreatController {
    @FXML
    TextField riskAnalysisTitleTextField;

    private Stage creatStage;
    private RiskAnalysisModel model;
    private int returnValue = 0;

    @FXML
    private void initialize(){

    }

    public void setCreatStage(Stage creatStage) {
        this.creatStage = creatStage;
    }

    public void setModel(RiskAnalysisModel model) {
        this.model = model;
        riskAnalysisTitleTextField.setText(model.getTitle());

    }

    public int getReturnValue() {
        return returnValue;
    }

    @FXML
    private void saveChangeAction(){
        if(valid()) {
            model.setTitle(riskAnalysisTitleTextField.getText());
            returnValue = 1;
            creatStage.close();
        }
    }

    @FXML
    private void cancelAction() {
        creatStage.close();
    }

    private boolean valid() {
        String errorMessage = "";
        if (riskAnalysisTitleTextField.getText() == null || riskAnalysisTitleTextField.getText().equals("")) {
            errorMessage += "Insert Title. \n";
        }
        if(errorMessage.equals("")){
            return true;
        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR);    //FX errorMsg alert
            alert.initOwner(creatStage);
            alert.setTitle("Error Message");
            alert.setHeaderText("Please Insert RiskAnalysis Title");
            alert.showAndWait();
            return false;
        }
    }

}
