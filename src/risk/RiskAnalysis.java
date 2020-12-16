/*
 *
 * Developed by Sara Sandager (sara590x@edu.easj.dk)
 * Licensed under the MIT License
 * 11/12/2020
 *
 */

package risk;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class RiskAnalysis {

    private String riskAnalysisTitle;
    private ArrayList<Risk> risks = new ArrayList<>();
    private LocalDateTime lastSaveDate;
    private LocalDate publishedDate;

    public String getRiskAnalysisTitle() {
        return riskAnalysisTitle;
    }

    public void setRiskAnalysisTitle(String riskAnalysisTitle) {
        this.riskAnalysisTitle = riskAnalysisTitle;
    }

    public ArrayList<Risk> getRisks() {
        return risks;
    }

/*    public void setRisks(ArrayList<Risk> risks) {
        this.risks = risks;
    }*/

    public LocalDateTime getLastSavedDate(){
        //Getting the current date-time value
        LocalDateTime dateTime = LocalDateTime.now();
        return dateTime;
    }

    //not needed
    /*    public void setLastSaveDate(LocalDate lastSaveDate) {
            this.lastSaveDate = lastSaveDate;
        }
    */

    public LocalDate getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(LocalDate publishedDate) {
        this.publishedDate = publishedDate;
    }

/*    public void addRisk(){
        Risk risk = new Risk();
        risk.setRiskTitle("");
        risks.add(risk);
        System.out.println("Risk added");
    }
*/
    /*addRisk with probability as double*/
    public void addRisk(String title, double probability, String consequence, int priority, String responseStrategy, String revisedConsequence, double revisedPriority) {
        Risk risk = new Risk();
        risk.setRiskTitle(title);
        risk.setProbability(probability);
        risk.setConsequence(consequence);
        risk.setPriority(priority);
        risk.setResponseStrategy(responseStrategy);
        risk.setRevisedConsequence(revisedConsequence);
        risk.setRevisedPriority(revisedPriority);
        risks.add(risk);
        System.out.println("Risk added (probability as double)");
    }
    /*addRisk with probability as String*/
    public void addRisk(String title, String altProbability, String consequence, int priority, String responseStrategy, String revisedConsequence, double revisedPriority) {
        Risk risk = new Risk();
        risk.setRiskTitle(title);
        risk.setAltProbability(altProbability);
        risk.setConsequence(consequence);
        risk.setPriority(priority);
        risk.setResponseStrategy(responseStrategy);
        risk.setRevisedConsequence(revisedConsequence);
        risk.setRevisedPriority(revisedPriority);
        risks.add(risk);
        System.out.println("Risk added (with probability as String)");
    }





    /*confirmDeletionRiskAnalysis*/
    public void confirmDeletionRiskAnalysis(String riskAnalysisTitle){

    }

    /*
        - lastSavedDate : LocalDate
        - publishedDate : LocalDate
        - Risks : Risk[]

    /////////

        + addRisk(title: String, probability: double, consequence: String, priority: int, responseStrategy: String, revisedConsequence: String, revisedPriority: double)
        + getPublishedDate : LocalDate
        + getLastSavedDate : LocalDate
        + createRiskAnalysis(riskAnalysisTitle: String)
        + deleteRiskAnalysis(riskAnalysisTitle: String)
        + editRiskAnalysis(riskAnalysisTitle: String)
        + saveRiskAnalysis(riskAnalysisTitle: String)
        + confirmDeletionRiskAnalysis(riskAnalysisTitle: String)
    * */
}
