/*
 *
 * Developed by Sara Sandager (sara590x@edu.easj.dk)
 * Licensed under the MIT License
 * 11/12/2020
 *
 */

package risk;

import java.util.ArrayList;

public class RiskAnalysis {

    ArrayList<Risk> risks = new ArrayList<>();
    String riskAnalysisTitle;

    public void addRisk(){
        Risk risk = new Risk();
        risk.setRiskTitle("");
        risks.add(risk);
        System.out.println("Risk added");
    }



    /*
        - lastSavedDate : LocalDate
        - publishedDate : LocalDate
        - Risks : Risk[]

    /////////

        + addRisk(title: String, probability: double, consequence: String, priority: int, responseStrategy: String, revisedConsequence: String, revisedPriority: double)
        + getPublishedDate : LocalDate
        + getLastSavedDate : LocalDate

    * */


}
