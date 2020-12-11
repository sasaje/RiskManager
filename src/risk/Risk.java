/*
 *
 * Developed by Sara Sandager (sara590x@edu.easj.dk)
 * Licensed under the MIT License
 * 11/12/2020
 *
 */

package risk;

public class Risk {

    private String riskTitle;

    public String getRiskTitle(){
        return riskTitle;
    }

    public void setRiskTitle(String riskTitle) {
        this.riskTitle = riskTitle;
    }

    /*
        - title: String
        - probability: double
        - consequence: String
        - priority: int
        - responseStrategy: String
        - revisedConsequence: String
        - revisedPriority: double

    //////////////////////////////

        <<constructor>> Risk()
        <<constructor>> Risk(title: String, probability: double, consequence: String, priority: int, responseStrategy: String, revisedConsequence: String, revisedPriority: double)
        <<constructor>> Risk(title: String, probability: String, consequence: String, priority: int, responseStrategy: String, revisedConsequence: String, revisedPriority: double)
        + checkForDuplicateName(riskTitle: String)

        public boolean checkForDuplicateName(String riskTitle){
            return this.name.equals(name);
        }
    */
}