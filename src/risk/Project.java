/*
 *
 * Developed by Sara Sandager (sara590x@edu.easj.dk)
 * Licensed under the MIT License
 * 16/12/2020
 *
 */

package risk;
import java.io.FileWriter;
import java.util.ArrayList;

public class Project {

    private ArrayList<RiskAnalysis> riskAnalyzes = new ArrayList<>();
    private ArrayList<RiskAnalysis> currentRiskAnalysis = new ArrayList<>(); // max one riskanalysis in this arrayList

    // A Class that represents use-defined exception
    class NoCurrentRiskAnalysis extends Exception {
        private String r;

        public NoCurrentRiskAnalysis(String r) {
            // Call constructor of parent Exception
            super(r + " was not created");
        }
    }

    /*Create new riskAnalysis*/
/*    public void createRiskAnalysis(RiskAnalysis riskAnalysis){

        if (riskAnalysis == null) throw new NullPointerException("riskAnalysis");

        else{
            RiskAnalysis currentRiskAnalysis = new RiskAnalysis();
            currentRiskAnalysis.setRiskAnalysisTitle(currentRiskAnalysis.getRiskAnalysisTitle());
            System.out.println("RiskAnalysis created");
            //call save?
        }
    }
    */

    /*Create new riskAnalysis*/
    public void createRiskAnalysis(String riskAnalysisTitle){

        if (riskAnalysisTitle == null) throw new NullPointerException("riskAnalysis");

        else{
            RiskAnalysis currentRiskAnalysis = new RiskAnalysis();
            currentRiskAnalysis.setRiskAnalysisTitle(currentRiskAnalysis.getRiskAnalysisTitle());
            riskAnalyzes.add(currentRiskAnalysis);
            System.out.println("RiskAnalysis created");
            //call save?
        }
    }

    /*edit a riskAnalysis*/
    public void editRiskAnalysis(String riskAnalysisTitle){

    }
    /*delete a riskAnalysis*/
    public void deleteRiskAnalysis(String riskAnalysisTitle){

    }
    /*save a riskAnalysis*/
    public void saveRiskAnalysis(String riskAnalysisTitle){

    }
}
