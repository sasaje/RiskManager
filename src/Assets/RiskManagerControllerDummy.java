package Assets;

import risk.Observer;
import risk.RiskAnalysis;
import risk.RiskManagerController;

import java.io.FileNotFoundException;

public class RiskManagerControllerDummy implements RiskManagerController {
    @Override
    public void bootUp() throws FileNotFoundException {

    }

    @Override
    public void save() throws FileNotFoundException {

    }

    @Override
    public void createRiskAnalysis(String riskAnalysisTitle) {
        System.out.println("Create risk analysis: " + riskAnalysisTitle);
    }

    @Override
    public RiskAnalysis editRiskAnalysis(String riskAnalysisTitle) {
        return null;
    }

    @Override
    public void deleteRiskAnalysis(String riskAnalysisTitle) {

    }

    @Override
    public void saveRiskAnalysis(String riskAnalysisTitle) {

    }

    @Override
    public void editRisk(String riskTitle) {

    }

    @Override
    public void saveRisk(String title, double probability, String consequence, int priority, String responseStrategy, String revisedConsequence, double revisedPriority) {

    }

    @Override
    public void addObserver(Observer observer) {

    }
}
