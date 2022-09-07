import java.util.ArrayList;

/**
 * This class represents the response when fetching for road conditions
 * from the Digitraffic API.
 * @author J.L.
 */
public class RoadConditionResponse {

    private String dataUpdatedTime;
    private ArrayList<WeatherData> weatherData;

    // Required empty constructor
    RoadConditionResponse() { }

    public ArrayList<RoadCondition> getRoadConditions() {
        return weatherData.get(0).roadConditions;
    }

    public String getDataUpdatedTime() {
        return dataUpdatedTime;
    }

    public void setDataUpdatedTime(String dataUpdatedTime) {
        this.dataUpdatedTime = dataUpdatedTime;
    }

    public ArrayList<WeatherData> getWeatherData() {
        return weatherData;
    }

    public void setWeatherData(ArrayList<WeatherData> weatherData) {
        this.weatherData = weatherData;
    }

    static class WeatherData {

        private String id;
        private ArrayList<RoadCondition> roadConditions;

    }

}
