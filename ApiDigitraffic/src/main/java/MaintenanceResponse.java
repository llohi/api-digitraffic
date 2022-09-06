import java.util.ArrayList;

/**
 * This class represents the response from the Digitraffic API when fetching
 * road maintenance tracking tasks for a specific area.
 * @author J.L.
 */
public class MaintenanceResponse {

    private String type, dataUpdatedTime, dataLastCheckedTime;
    private ArrayList<Maintenance> features;

    // Required empty constructor
    MaintenanceResponse() { }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDataUpdatedTime() {
        return dataUpdatedTime;
    }

    public void setDataUpdatedTime(String dataUpdatedTime) {
        this.dataUpdatedTime = dataUpdatedTime;
    }

    public String getDataLastCheckedTime() {
        return dataLastCheckedTime;
    }

    public void setDataLastCheckedTime(String dataLastCheckedTime) {
        this.dataLastCheckedTime = dataLastCheckedTime;
    }

    public ArrayList<Maintenance> getFeatures() {
        return features;
    }

    public void setFeatures(ArrayList<Maintenance> features) {
        this.features = features;
    }
}
