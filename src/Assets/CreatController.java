package Assets;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

 //TODO recent riskanalysis choice box

public class CreatController {
    @FXML
    TextField riskAnalysisTitleTextField;


    private Stage creatStage;
    private RiskAnalysisModel model;
    private RiskModel riskModel;
    private int returnValue = 0;

    @FXML
    private void initialize(){

    }

    public void setCreatStage(Stage creatStage) {

        this.creatStage = creatStage;
    }

    public void setModel(RiskAnalysisModel model) {  //Putter RiskAnalysis titel ind i textfeltet, som er hentet fra RiskAnalysisModel klassen
        this.model = model;
        riskAnalysisTitleTextField.setText(model.getTitle());

    }

    public int getReturnValue() { //Når saveRiskAnalysisBtn-eventet er færdigt returnerer den returnvalue. Hvis der står noget i feltet er den 1
        return returnValue;
    }

    @FXML
    private void saveRiskAnalysisAction(){ //Hvis der står noget i feltet sættes titlen = textfeltet
        if(valid()) {
            model.setTitle(riskAnalysisTitleTextField.getText());
            returnValue = 1;
            creatStage.close();
        }
    }

    @FXML
    private void cancelAction() {  // Lukker nuværende side og gælder til topoverviewBtn i creat side
        creatStage.close();

    }

    private boolean valid() {  // Hvis der står en tekst i textfeltet så giver den true ellers false
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

    @FXML
    private void addRiskAction(){      //Add Risk button event handler
        RiskManager main = new RiskManager();

        creatStage.close();
        main.setAddPage(riskModel);

    }

}
