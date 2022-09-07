/**
 * This class represents a road condition fetched from the Digitraffic API.
 * @author J.L.
 */
public class RoadCondition {

    private String time, type, forecastName, roadTemperature,
            temperature, overallRoadCondition, weatherSymbol, reliability;

    // Required empty constructor
    RoadCondition() { }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getForecastName() {
        return forecastName;
    }

    public void setForecastName(String forecastName) {
        this.forecastName = forecastName;
    }

    public String getRoadTemperature() {
        return roadTemperature;
    }

    public void setRoadTemperature(String roadTemperature) {
        this.roadTemperature = roadTemperature;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getOverallRoadCondition() {
        return overallRoadCondition;
    }

    public void setOverallRoadCondition(String overallRoadCondition) {
        this.overallRoadCondition = overallRoadCondition;
    }

    public String getWeatherSymbol() {
        return weatherSymbol;
    }

    public void setWeatherSymbol(String weatherSymbol) {
        this.weatherSymbol = weatherSymbol;
    }

    public String getReliability() {
        return reliability;
    }

    public void setReliability(String reliability) {
        this.reliability = reliability;
    }
}
