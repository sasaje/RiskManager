/*
 *
 * Developed by Sara Sandager (sara590x@edu.easj.dk)
 * Licensed under the MIT License
 * 16/12/2020
 *
 */

package risk;
import java.util.ArrayList;

public class Project {

    private ArrayList<RiskAnalysis> riskAnalyzes = new ArrayList<>();
    private ArrayList<RiskAnalysis> currentRiskAnalysis = new ArrayList<>(); // max one riskanalysis in this arrayList

    public ArrayList<RiskAnalysis> getRiskAnalyzes() {
        return riskAnalyzes;
    }

    public void setRiskAnalyzes(ArrayList<RiskAnalysis> riskAnalyzes) {
        this.riskAnalyzes = riskAnalyzes;
    }

    public ArrayList<RiskAnalysis> getCurrentRiskAnalysis() {
        return currentRiskAnalysis;
    }

    public void setCurrentRiskAnalysis(ArrayList<RiskAnalysis> currentRiskAnalysis) {
        this.currentRiskAnalysis = currentRiskAnalysis;
    }

    // A Class that represents use-defined exception
    class NoCurrentRiskAnalysis extends Exception {
        private String r;

        public NoCurrentRiskAnalysis(String r) {
            // Call constructor of parent Exception
            super(r + " was not created");
        }
    }

    /*Create new riskAnalysis*/
    public void createRiskAnalysis(String riskAnalysisTitle){
        if (riskAnalysisTitle == null) throw new NullPointerException("RiskAnalysis doesn't exist");

        //checkForDublicates exception()?

        else{
            RiskAnalysis riskAnalysis = new RiskAnalysis();
            riskAnalysis.setRiskAnalysisTitle(riskAnalysisTitle);
            currentRiskAnalysis.set(0, riskAnalysis); //adds the currentRiskAnalysis to currentRiskAnalysis ArrayList
            riskAnalyzes.add(riskAnalysis);
            System.out.println("RiskAnalysis created");
        }
    }

    /*edit a riskAnalysis*/
    public RiskAnalysis editRiskAnalysis(String riskAnalysisTitle){
        //if no riskAnalysisTitle throw exception
        if (riskAnalysisTitle == null) throw new NullPointerException("RiskAnalysis doesn't exist");

        else{
            int indexNr = riskAnalyzes.indexOf(riskAnalysisTitle); //index number for the entered riskAnalysisTitle in the riskAnalyzes arrayList
            RiskAnalysis riskAnalysis = riskAnalyzes.get(indexNr); //gets the object with the index of the current editable riskAnalysis from the arrayList
            currentRiskAnalysis.set(0, riskAnalysis); //adds the currentRiskAnalysis to currentRiskAnalysis ArrayList
            return riskAnalysis;
        }
    }

    /*delete a riskAnalysis*/
    public void deleteRiskAnalysis(String riskAnalysisTitle){
        int indexNr = riskAnalyzes.indexOf(riskAnalysisTitle);
        riskAnalyzes.remove(indexNr);
    }

    /*save a riskAnalysis*/
    public void saveRiskAnalysis(String riskAnalysisTitle){

        // get changes made from edit/create?
        // get riskAnalysis from editRiskAnalysis() or from createRiskAnalysis();
        String formerRiskAnalysisTitle = currentRiskAnalysis.get(0).getRiskAnalysisTitle();

        // overwrite the previous version of arrayList riskAnalyzes with the new changes.
        RiskAnalysis riskAnalysis = new RiskAnalysis();
        riskAnalysis.setRiskAnalysisTitle(riskAnalysisTitle);
        int indexNr = riskAnalyzes.indexOf(formerRiskAnalysisTitle);
        riskAnalyzes.set(indexNr, riskAnalysis);
    }
}
