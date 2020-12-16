package Assets;


import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class RiskModel {
    private final StringProperty riskTitle;
    private final StringProperty riskFileName;
    private final StringProperty riskProbability;
    // private final DoubleProperty riskProbabilityDouble;
    private final StringProperty riskConsequence;
    private final IntegerProperty riskPriorityChoicebox;
    private final StringProperty riskRevisedProbability;
    private final StringProperty riskRevisedConsequence;
    private final StringProperty riskResponseStrategy;




    public RiskModel(String riskTitle, String riskFileName, String riskProbability, String riskConsequence, int riskPriorityChoicebox,
                      String riskRevisedProbability, String riskRevisedConsequence, String riskResponseStrategy) {
        this.riskTitle = new SimpleStringProperty(riskTitle);
        this.riskFileName = new SimpleStringProperty(riskFileName);
        this.riskProbability = new SimpleStringProperty(riskProbability);
        this.riskConsequence = new SimpleStringProperty(riskConsequence);
        this.riskPriorityChoicebox = new SimpleIntegerProperty(riskPriorityChoicebox);
        this.riskRevisedProbability = new SimpleStringProperty(riskRevisedProbability);
        this.riskRevisedConsequence = new SimpleStringProperty(riskRevisedConsequence);
        this.riskResponseStrategy = new SimpleStringProperty(riskResponseStrategy);
    }

    public String getRiskTitle() {
        return riskTitle.get();
    }

    public StringProperty getriskTitleProperty() {
        return riskTitle;
    }

    public void setRiskTitle(String riskTitle) {
        this.riskTitle.set(riskTitle);
    }

    public String getRiskFileName() {
        return riskFileName.get();
    }

    public StringProperty getriskFileNameProperty() {
        return riskFileName;
    }

    public void setRiskFileName(String riskFileName) {
        this.riskFileName.set(riskFileName);
    }

    public String getRiskProbability() {
        return riskProbability.get();
    }

    public StringProperty getriskProbabilityProperty() {
        return riskProbability;
    }

    public void setRiskProbability(String riskProbability) {
        this.riskProbability.set(riskProbability);
    }

    public String getRiskConsequence() {
        return riskConsequence.get();
    }

    public StringProperty getriskConsequenceProperty() {
        return riskConsequence;
    }

    public void setRiskConsequence(String riskConsequence) {
        this.riskConsequence.set(riskConsequence);
    }

    public String getRiskRevisedProbability() {
        return riskRevisedProbability.get();
    }

    public StringProperty getriskRevisedProbabilityProperty() {
        return riskRevisedProbability;
    }

    public void setRiskRevisedProbability(String riskRevisedProbability) {
        this.riskRevisedProbability.set(riskRevisedProbability);
    }

    public String getRiskRevisedConsequence() {
        return riskRevisedConsequence.get();
    }

    public StringProperty getriskRevisedConsequenceProperty() {
        return riskRevisedConsequence;
    }

    public void setRiskRevisedConsequence(String riskRevisedConsequence) {
        this.riskRevisedConsequence.set(riskRevisedConsequence);
    }

    public String getRiskResponseStrategy() {
        return riskResponseStrategy.get();
    }

    public StringProperty getriskResponseStrategyProperty() {
        return riskResponseStrategy;
    }

    public void setRiskResponseStrategy(String riskResponseStrategy) {
        this.riskResponseStrategy.set(riskResponseStrategy);
    }
}
