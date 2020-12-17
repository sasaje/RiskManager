package Assets;

import risk.*;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.FileNotFoundException;
import java.io.IOException;

public class RiskManager extends Application {

    private Stage primaryStage;
    private BorderPane rootLayout;
    private ObservableList<RiskAnalysisModel> riskAnalysisTitleList = FXCollections.observableArrayList();

    public RiskManager(){
        //riskAnalysisTitleList.add(new RiskAnalysisModel("Title1"));
    }

    public ObservableList<RiskAnalysisModel> getRiskAnalysisTitleList() {
        return riskAnalysisTitleList;
    }


    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("Risk Manager 2020");
        setRootLayout();
        setStartPage();
    }

  public void setRootLayout() {
        try{
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(RiskManager.class.getResource("RootLayout.fxml"));
            rootLayout = loader.load();
            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }    // Planen med denne var at man kunne vise de forskellige scener inde den her blanke scene, så man på den måde ikke
    //skulle skifte scene og lukke tidligere scene, men blot vise dem. Det virkede dog ikke og den kan ignoreres.

    public void setStartPage() {   //Viser start scenen
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(RiskManager.class.getResource("RiskManager_start.fxml"));
            VBox start = loader.load();
            rootLayout.setCenter(start);

            StartController controller = loader.getController();
            controller.setMain(this);//Indgangspunktet for controller klasserne så alle variablene
                                    // er tilgængelige fra controller og over i RiskManager

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

        public int setCreatePage(RiskAnalysisModel model) { //Viser create scenen, som bruges til at indsætte Riskanalysis titel
            try{
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(RiskManager.class.getResource("RiskManager_creat.fxml"));
                AnchorPane creat = loader.load();
                // rootLayout.setCenter(creat);

                Stage creatPage = new Stage();
                creatPage.setTitle("Risk Manager 2020");
                creatPage.initModality(Modality.WINDOW_MODAL);
                creatPage.initOwner(primaryStage);
                Scene scene = new Scene(creat);
                creatPage.setScene(scene);

                CreatController creatController = loader.getController(); //Kommunikerer med controlleren og sætter scenen
                creatController.setCreatStage(creatPage);
                creatController.setModel(model);

                creatPage.showAndWait();//Viser scenen og venter til den bliver lukket
                return creatController.getReturnValue();

            } catch (IOException e) {
                e.printStackTrace();
                return 0;
            }
        }

        public void setAddPage(RiskModel riskModel) { //Viser add scenen, som bruges til at indsætte en Risk
            try {
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(RiskManager.class.getResource("RiskManager_add.fxml"));
                AnchorPane add = loader.load();


                Stage addPage = new Stage();
                addPage.setTitle("Risk Manager 2020");
                addPage.initModality(Modality.WINDOW_MODAL);
                addPage.initOwner(primaryStage);
                Scene scene = new Scene(add);
                addPage.setScene(scene);

                AddController addController = loader.getController();
                addController.setAddStage(addPage);
               // addController.setRiskModel(riskModel);

                addPage.show();

            }catch (IOException e) {
                e.printStackTrace();
            }

        }

    public void setViewRisksPage(RiskModel riskModel) { //Viser viewrisk scenen, som bruges til at vise alle risks
        try{
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(RiskManager.class.getResource("RiskManager_viewRisks.fxml"));
            AnchorPane viewRisks = loader.load();


            Stage viewRisksPage = new Stage();
            viewRisksPage.setTitle("Risk Manager 2020");
            viewRisksPage.initModality(Modality.WINDOW_MODAL);
            viewRisksPage.initOwner(primaryStage);
            Scene scene = new Scene(viewRisks);
            viewRisksPage.setScene(scene);

            ViewRiskController viewRiskController = loader.getController();
            viewRiskController.setViewRiskStage(viewRisksPage);
            //viewController.setModel(riskModel);

            viewRisksPage.show();

        } catch (IOException e) {
            e.printStackTrace();

        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        RiskManagerController riskManagerController = new RiskManagerControllerImpl();
        System.out.println("RiskManagerController created:" + riskManagerController);
        StartController.riskManagerController = riskManagerController;
        riskManagerController.bootUp();
        launch(args);
    }
}
