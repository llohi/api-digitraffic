import java.util.ArrayList;

/**
 * This class represents the response when fetching for traffic messages
 * from the Digitraffic API.
 * @author J.L.
 */
public class TrafficMessagesResponse {

    private String type, dataUpdatedTime, dataLastCheckedTime;
    private ArrayList<TrafficMessage> features;

    // Required empty constructor
    TrafficMessagesResponse() { }

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

    public ArrayList<TrafficMessage> getFeatures() {
        return features;
    }

    public void setFeatures(ArrayList<TrafficMessage> features) {
        this.features = features;
    }
}
