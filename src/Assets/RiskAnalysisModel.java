package Assets;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import java.util.Date;

public class RiskAnalysisModel {
    private final StringProperty title;

    //Den her og den RiskModel klass henter tekstværdierne så de kan indsættes fra RiskAnalysisModel/RiskModel til tableview
    //Skal laves om så der kan hentes/skrives til filer


    public RiskAnalysisModel(String title) {
        this.title = new SimpleStringProperty(title);

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


}
