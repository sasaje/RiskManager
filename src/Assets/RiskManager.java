package Assets;

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
    }

    public void setStartPage() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(RiskManager.class.getResource("RiskManager_start.fxml"));
            VBox start = loader.load();
            rootLayout.setCenter(start);

            StartController controller = loader.getController();
            controller.setMain(this);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

        public int setCreatePage(RiskAnalysisModel model) {
            try{
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(RiskManager.class.getResource("RiskManager_creat.fxml"));
                AnchorPane creat = loader.load();

                Stage creatPage = new Stage();
                creatPage.setTitle("Risk Manager 2020");
                creatPage.initModality(Modality.WINDOW_MODAL);
                creatPage.initOwner(primaryStage);
                Scene scene = new Scene(creat);
                creatPage.setScene(scene);

                CreatController controller1 = loader.getController();
                controller1.setCreatStage(creatPage);
                controller1.setModel(model);

                creatPage.showAndWait();
                return controller1.getReturnValue();

            } catch (IOException e) {
                e.printStackTrace();
                return 0;
            }
        }


        public void setAddPage(RiskModel riskModel) {
            try {
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(RiskManager.class.getResource("RiskManager_creat.fxml"));
                AnchorPane add = loader.load();

                Stage addPage = new Stage();
                addPage.setTitle("Risk Manager 2020");
                addPage.initModality(Modality.WINDOW_MODAL);
                addPage.initOwner(primaryStage);
                Scene scene = new Scene(add);
                addPage.setScene(scene);

                AddController addController = loader.getController();
                addController.setAddStage(addPage);
                addController.setRiskModel(riskModel);

                addPage.show();
            }catch (IOException e) {
                e.printStackTrace();
            }

        }

    public static void main(String[] args) {
        launch(args);
    }
}
