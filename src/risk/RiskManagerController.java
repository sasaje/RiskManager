package risk;

import java.io.FileNotFoundException;

public interface RiskManagerController {
    void bootUp() throws FileNotFoundException;

    void save() throws FileNotFoundException;

    void createRiskAnalysis(String riskAnalysisTitle);

    RiskAnalysis editRiskAnalysis(String riskAnalysisTitle);

    void deleteRiskAnalysis(String riskAnalysisTitle);

    void saveRiskAnalysis(String riskAnalysisTitle);

    void editRisk(String riskTitle);

    void saveRisk(String title, double probability, String consequence, int priority, String responseStrategy, String revisedConsequence, double revisedPriority);

    void addObserver(Observer observer);
}
