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

    private double probability;
    private String consequence;
    private int priority;
    private String responseStrategy;
    private String revisedConsequence;
    private double revisedPriority;

    Risk(){}

    Risk(String title, double probability, String consequence, int priority, String responseStrategy, String revisedConsequence, double revisedPriority){
        this.riskTitle = title;
        this.probability = probability;
        this.consequence = consequence;
        this.priority = priority;
        this.responseStrategy = responseStrategy;
        this.revisedConsequence = revisedConsequence;
        this.revisedPriority = revisedPriority;
    }
    Risk(String title, String probability, String consequence, int priority, String responseStrategy, String revisedConsequence, double revisedPriority){
        this.riskTitle = title;
        //this.probability = probability;
        this.consequence = consequence;
        this.priority = priority;
        this.responseStrategy = responseStrategy;
        this.revisedConsequence = revisedConsequence;
        this.revisedPriority = revisedPriority;
    }

    //TODO checkForDuplicateName
    public void checkForDuplicateName(riskTitle) {
        boolean nameInUse = false;
        for (Risk risk : risk) {
            nameInUse = risk.checkForDuplicateName(riskTitle);
            if (nameInUse) {
                throw new DuplicateRiskException();
            }
        }
    }

    /*
        title: String
        probability: double
        consequence: String
        priority: int
        responseStrategy: String
        revisedConsequence: String
        revisedPriority: double

    //////////////////////////////

        <<constructor>> Risk()
        <<constructor>> Risk(title: String, probability: double, consequence: String, priority: int, responseStrategy: String, revisedConsequence: String, revisedPriority: double)
        <<constructor>> Risk(title: String, probability: String, consequence: String, priority: int, responseStrategy: String, revisedConsequence: String, revisedPriority: double)
        + checkForDuplicateName(riskTitle: String)


        boolean nameInUse = false;

        for(Risk risk : risk){
            nameInUse = risk.checkForDuplicateName(riskTitle);
            if(nameInUse){
                throw new DuplicateRiskException();
            }
        }


        public boolean checkForDuplicateName(String riskTitle){
            return this.name.equals(name);
        }
    */
}