package Assets;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import java.util.Date;

public class RiskAnalysisModel {
    private final StringProperty title;


    public RiskAnalysisModel(String title) {
        this.title = new SimpleStringProperty(title);

    }

    public String getTitle() {
        return title.get();
    }

    public StringProperty getTitleProperty() {

        return title;
    }

    public void setTitle(String title) {
        this.title.set(title);
    }

   /* public Date getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(Date publishedDate) {
        this.publishedDate = publishedDate;
    }

    public Date getLastSavedDate() {
        return lastSavedDate;
    }

    public void setLastSavedDate(Date lastSavedDate) {
        this.lastSavedDate = lastSavedDate;
    } */
}
