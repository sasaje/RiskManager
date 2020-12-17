package risk;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class RiskManagerControllerImpl implements RiskManagerController {
    Archive archive = new Archive();
    Project project = new Project();

    private ArrayList<Observer> observers = new ArrayList<Observer>();

    @Override
    public void bootUp() throws FileNotFoundException {
        //archive.load();
    }

    @Override
    public void save() throws FileNotFoundException {
        //archive.save(project);
    }
    @Override
    public void createRiskAnalysis(String riskAnalysisTitle){
        project.createRiskAnalysis(riskAnalysisTitle);
        //TODO: notifyObservers();
    }
    @Override
    public RiskAnalysis editRiskAnalysis(String riskAnalysisTitle){
        return project.editRiskAnalysis(riskAnalysisTitle);
    }
    @Override
    public void deleteRiskAnalysis(String riskAnalysisTitle){
        project.deleteRiskAnalysis(riskAnalysisTitle);
        //TODO: notifyObservers();
    }
   @Override
   public void saveRiskAnalysis(String riskAnalysisTitle){
        project.saveRiskAnalysis(riskAnalysisTitle);
       //TODO: notifyObservers();
   }
    @Override
    public void editRisk(String riskTitle) {
        //TODO: delegate activation of risk to project
    }
    @Override
    public void saveRisk(String title, double probability, String consequence, int priority, String responseStrategy, String revisedConsequence, double revisedPriority){
        project.saveRisk(title, probability, consequence, priority, responseStrategy, revisedConsequence, revisedPriority);
        //TODO: notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        //TODO: add observer to observers
        observers.add(observer);
    }

    private void notifyObservers() {
        //TODO: for each observer in observers, send update
        for (Observer observer : observers)
            observer.update();
    }
//addRisk
//deleteRisk

}
    /* CLASS DIAGRAM
        - currentRiskAnalysis : RiskAnalysis

    /////////////

        + addRisk(title: String, probability: double, consequence: String, priority: int, responseStrategy: String, revisedConsequence: String, revisedPriority: double)

        + deleteRisk(riskTitle: String)
        + editRisk(riskTitle: String)
        + saveRisk(riskTitle: String)
        + confirmDeletionRisk(riskTitle: String)

        + createRiskAnalysis(riskAnalysisTitle: String)
        + deleteRiskAnalysis(riskAnalysisTitle: String)
        + editRiskAnalysis(riskAnalysisTitle: String)
        + saveRiskAnalysis(riskAnalysisTitle: String)
        + confirmDeletionRiskAnalysis(riskAnalysisTitle: String)


}


    RiskAnalysis - Sara
    Risk - Malte
    Archive (Louise)
    GUI.FXML  (id buttons) - Jenna/Laila/Louise
       # Prototype -> Sara
    Controller - all
    RiskManagerController - Sara
*/