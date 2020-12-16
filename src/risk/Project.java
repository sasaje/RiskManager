/*
 *
 * Developed by Sara Sandager (sara590x@edu.easj.dk)
 * Licensed under the MIT License
 * 16/12/2020
 *
 */

package risk;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Project {

    private ArrayList<RiskAnalysis> riskAnalyzes = new ArrayList<>();
    private ArrayList<RiskAnalysis> currentRiskAnalysis = new ArrayList<>(); // max one riskanalysis in this arrayList

    /*Create new riskAnalysis*/
    public void createRiskAnalysis(RiskAnalysis riskAnalysis){

        if (riskAnalysis == null) throw new NullPointerException("riskAnalysis");

        else{
            riskAnalysis.setRiskAnalysisTitle(riskAnalysisTitle);
            System.out.println("RiskAnalysis created");
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
