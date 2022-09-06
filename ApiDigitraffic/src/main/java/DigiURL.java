/**
 * This class contains methods to generate an url for the Digitraffic API.
 * @author J.L.
 */
public class DigiURL {

    static final String MAINTENANCE_ROOT = "https://tie.digitraffic.fi/api/maintenance/v1/tracking/";
    static final String CONDITIONS_ROOT = "https://tie.digitraffic.fi/api/v3/data/road-conditions/";
    static final String TRAFFIC_ROOT = "https://tie.digitraffic.fi/api/traffic-message/v1/";

    static final String MAINTENANCE_ALL = "https://tie.digitraffic.fi/api/maintenance/v1/tracking/tasks";


    static String makeURL() {
        String url = "";
        return url;
    }

    /**
     * Generate an url to get road maintenance tracking tasks
     * for a specific area.
     * @param start_time the "minimum" starting time for the tasks
     * @param end_time the "deadline" for the tasks
     * @param x_min the minimum x coordinate
     * @param y_min the minimum y coordinate
     * @param x_max the maximum x coordinate
     * @param y_max the maximum y coordinate
     * @param task_name the name of the task (if empty, all tasks)
     * @return the formatted url
     */
    static String maintenanceURL(String start_time, String end_time,
                                 double x_min, double y_min, double x_max, double y_max,
                                 String task_name) {
        return MAINTENANCE_ROOT +
                "routes?endFrom="+start_time+"&endBefore="+end_time+
                "&xMin="+x_min+"&yMin="+y_min+"&xMax="+x_max+"&yMax="+y_max+
                "&taskId="+task_name+"&domain=state-roads";
    }

    /**
     * Generate an url to get the road conditions for a specific area.
     * @param x_min the minimum x coordinate
     * @param y_min the minimum y coordinate
     * @param x_max the maximum x coordinate
     * @param y_max the maximum y coordinate
     * @return the formatted url
     */
    static String conditionsURL(double x_min, double y_min,
                                double x_max, double y_max) {
        return CONDITIONS_ROOT +
                x_min+"/"+y_min+"/"+x_max+"/"+y_max;
    }

    /**
     * Generate an url to get traffic messages according to the situation type.
     * @param situation_type the type of the situation
     * @return the formatted url
     */
    static String trafficURL(String situation_type) {

        return TRAFFIC_ROOT +
                "messages?inactiveHours=0&includeAreaGeometry=false" +
                "&situationType="+situation_type;
    }

}
