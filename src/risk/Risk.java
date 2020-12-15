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
    private double probability;
    private String altProbability;
    private String consequence;
    private int priority;
    private String responseStrategy;
    private String revisedConsequence;
    private double revisedPriority;

    public String getRiskTitle(){
        return riskTitle;
    }
    public void setRiskTitle(String riskTitle) {
        this.riskTitle = riskTitle;
    }

    public double getProbability() {
        return probability;
    }
    public void setProbability(double probability) {
        this.probability = probability;
    }

    public String getAltProbability() {
        return altProbability;
    }
    public void setAltProbability(String altProbability) {
        this.altProbability = altProbability;
    }

    public String getConsequence() {
        return consequence;
    }
    public void setConsequence(String consequence) {
        this.consequence = consequence;
    }

    public int getPriority() {
        return priority;
    }
    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getResponseStrategy() {
        return responseStrategy;
    }
    public void setResponseStrategy(String responseStrategy) {
        this.responseStrategy = responseStrategy;
    }

    public String getRevisedConsequence() {
        return revisedConsequence;
    }
    public void setRevisedConsequence(String revisedConsequence) {
        this.revisedConsequence = revisedConsequence;
    }

    public double getRevisedPriority() {
        return revisedPriority;
    }
    public void setRevisedPriority(double revisedPriority) {
        this.revisedPriority = revisedPriority;
    }

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
        this.altProbability = probability;
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