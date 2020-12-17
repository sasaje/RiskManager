package Assets;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import risk.Observer;
import risk.RiskManagerController;

public class RiskAnalysisModel implements Observer {
    private final StringProperty title;

    //Den her og den RiskModel klass henter tekstværdierne så de kan indsættes fra RiskAnalysisModel/RiskModel til tableview
    //Skal laves om så der kan hentes/skrives til filer


    public RiskAnalysisModel(String title, RiskManagerController controller) {
        this.title = new SimpleStringProperty(title);

        // Add itself as observer of the associated Risk Manager Controller
        controller.addObserver(this);

    }

    public String getTitle() {
        return title.get();
    }

    public StringProperty getTitleProperty() {

        return title;
    }

    public void setTitle(String title) {
        this.title.set(title);
    }


    @Override
    public void update() {
        //TODO: get data from associated RiskManagerController
        //      and update view model

        // RiskAnalysis analysis = riskManagerController.getCurrentRiskAnalysis();
        // riskAnalysisTitle = analysis.getTitle();
        // for (...) {
        //   update row for tableview
        // }
    }
}
