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
    private ArrayList<Risk> currentRisks = new ArrayList<>();
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

    public LocalDateTime getLastSavedDate() {
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

    public void addRisk() {
        Risk risk = new Risk();
        risk.setRiskTitle("");
        risks.add(risk);
        System.out.println("Risk added");
    }

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

    //deleteRisk
    public void deleteRisk(String riskTitle) {
        //boolean arrayListContainsRisk = risks.contains(riskTitle);
        //if (arrayListContainsRisk) {
        int indexNr = risks.indexOf(riskTitle);
        risks.remove(indexNr);
        // }
        //else throw new riskDoesntExistException;
    }

    //editRisk
    public Risk editRisk(String riskTitle) {
        //boolean arrayListContainsRisk = risks.contains(riskTitle);
        //if (arrayListContainsRisk) {
        int indexNr = risks.indexOf(riskTitle);
        Risk risk = risks.get(indexNr);
        currentRisks.set(0, risk); //adds the currentRisk to currentRisks ArrayList
        return risk;
    }

    //saveRisk with double probability
    public void saveRisk(String title, double probability, String consequence, int priority, String responseStrategy, String revisedConsequence, double revisedPriority) {
        Risk risk = new Risk();
        risk.setRiskTitle(title);
        risk.setProbability(probability);
        risk.setConsequence(consequence);
        risk.setPriority(priority);
        risk.setResponseStrategy(responseStrategy);
        risk.setRevisedConsequence(revisedConsequence);
        risk.setRevisedPriority(revisedPriority);

        String formerTitle = currentRisks.get(0).getRiskTitle();

        int indexNr = risks.indexOf(formerTitle);
        risks.set(indexNr, risk);
    }

    //saveRisk with String probability
    public void saveRisk(String title, String altProbability, String consequence, int priority, String responseStrategy, String revisedConsequence, double revisedPriority) {
        Risk risk = new Risk();
        risk.setRiskTitle(title);
        risk.setAltProbability(altProbability);
        risk.setConsequence(consequence);
        risk.setPriority(priority);
        risk.setResponseStrategy(responseStrategy);
        risk.setRevisedConsequence(revisedConsequence);
        risk.setRevisedPriority(revisedPriority);

        String formerTitle = currentRisks.get(0).getRiskTitle();

        int indexNr = risks.indexOf(formerTitle);
        risks.set(indexNr, risk);
    }
    public String toString () {
        return riskAnalysisTitle;
    }
}