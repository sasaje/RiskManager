/*
 *
 * Developed by Sara Sandager (sara590x@edu.easj.dk)
 * Licensed under the MIT License
 * 11/12/2020
 *
 */

package risk;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Archive {

    /* save()
        - gennemsøg Arraylist riskAnalyzes<> i Project klassen og udskriv hvert element og dens værdier til archive.txt


    load()
        - Indlæs fra archive.txt og overfør alle elementer til Arraylist riskAnalyzes<> i Project klassen.


     */
/*
    void save(ActionEvent event) {

        try {
            Scanner input = new Scanner(System.in);
            FileWriter myWriter = new FileWriter("archive.txt", true);
            myWriter.write("" + riskAnalysis.getText() + '\n');

            myWriter.close();
            System.out.println("Der er skrevet i filen");

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    void load(ActionEvent event) {

        try {
            File myObj = new File("archive.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String archiveData = myReader.nextLine();

                // split the line on your splitter(s)
                String[] splitted = archiveData.split(",(?=(?:[^\\\"]*\\\"[^\\\"]*\\\")*[^\\\"]*$)"); // set , as delimiter

                String riskAnalysisTitleFelt = splitted[0];
                riskAnalysisTitle.setText(riskAnalysisTitleFelt);

                String riskTitleFelt = splitted[1];
                riskTitle.setText(riskTitleFelt);

                String probabilityFelt = splitted[2];
                probability.setText(probabilityFelt);

                String consequenceFelt = splitted[3];
                consequence.setText(consequenceFelt);

                String priorityFelt = splitted[4];
                priority.setText(priorityFelt);

                String responseStrategyFelt = splitted[5];
                responseStrategy.setText(responseStrategyFelt);

                String revisedConsequenceFelt = splitted[6];
                revisedConsequence.setText(revisedConsequenceFelt);

                String revisedPriorityFelt = splitted[7];
                revisedPriority.setText(revisedPriorityFelt);

            }
            myReader.close();

        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    //Forslag til save funktion:
    public void save(Project project) throws FileNotFoundException {
        java.io.File file = new java.io.File("archive.txt");
        java.io.PrintWriter output = new java.io.PrintWriter(file);
        for (RiskAnalysis riskAnalysis : project.getRiskAnalyzes()) {
            output.println(riskAnalysis.toString());
            for (Risk risk : riskAnalysis.getRisks()) {
                output.println("@#" + risk.getRiskTitle() + "\n" + "#" + risk.getProbability() + "\n" + "#" + risk.getAltProbability() + "\n"
                        + "#" + risk.getConsequence() + "\n" + "#" + risk.getPriority() + "\n" + "#" + risk.getResponseStrategy() + "\n" +
                        "#" + risk.getRevisedConsequence() + "\n" + "#" + risk.getRevisedPriority() + "\n");
            }
        }
        output.close();
    }
public void load() throws FileNotFoundException {

}*/
}


