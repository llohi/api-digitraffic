import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Class used to test code.
 * @author J.L.
 */
public class Main {
    public static void main(String[] args) throws IOException {

        /*  TEST MAINTENANCE
        for (Maintenance m : getMaintenance("2022-01-19T09%3A00%3A00Z",
                                            "2022-01-19T14%3A00%3A00Z",
                                            21, 61, 22, 62, "")) {
            System.out.println("Maintenance id: " + m.getProperties().getId());
            System.out.println("Start time: " + m.getProperties().getStartTime());
            System.out.println("End time: " + m.getProperties().getEndTime());
            System.out.println(m.getProperties().getTasks());
            System.out.println();
        }*/

        /*  TEST ROAD CONDITION
        for (RoadCondition r : getRoadConditions(21, 61, 22, 62)) {
            System.out.println("time: " + r.getTime());
            System.out.println("type: " + r.getType());
            System.out.println("forecastName: " + r.getForecastName());
            System.out.println();
        }*/

        /*  TEST TRAFFIC MESSAGES
        for (TrafficMessage m : getTrafficMessages("ROAD_WORK")) {

            System.out.println("situationId: " + m.getProperties().getSituationId());
            System.out.println("situationType: " + m.getProperties().getSituationType());
            System.out.println("trafficAnnouncementType: " + m.getProperties().getTrafficAnnouncementType());
            System.out.println("releaseTime: " + m.getProperties().getReleaseTime());
            System.out.println();

        }*/

    }


    static ArrayList<Task> getTasks() throws IOException {
        return ServerRequest.getObject(
                DigiURL.MAINTENANCE_ALL, new TypeToken<>(){});
    }

    static ArrayList<Maintenance> getMaintenance(String start_time, String end_time,
                                                 double x_min, double y_min, double x_max, double y_max,
                                                 String task_name) throws IOException {
        return ServerRequest.getObject(
                DigiURL.maintenanceURL(start_time, end_time,
                                       x_min, y_min, x_max, y_max,
                                       task_name),
                new TypeToken<MaintenanceResponse>(){})
                .getFeatures();
    }

    static ArrayList<RoadCondition> getRoadConditions(double x_min, double y_min,
                                                      double x_max, double y_max) throws IOException {
        return ServerRequest.getObject(
                DigiURL.conditionsURL(x_min, y_min, x_max, y_max),
                new TypeToken<RoadConditionResponse>(){}).getRoadConditions();
    }

    static ArrayList<TrafficMessage> getTrafficMessages(String situation_type) throws IOException {

        return ServerRequest.getObject(
                DigiURL.trafficURL(situation_type),
                new TypeToken<TrafficMessagesResponse>(){}).getFeatures();
    }

}
