import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Class used to test code.
 * @author J.L.
 */
public class Main {
    public static void main(String[] args) throws IOException {

        for (Maintenance m : getMaintenance("2022-01-19T09%3A00%3A00Z",
                                            "2022-01-19T14%3A00%3A00Z",
                                            21, 61, 22, 62, "")) {
            System.out.println("Maintenance id: " + m.getProperties().getId());
            System.out.println("Start time: " + m.getProperties().getStartTime());
            System.out.println("End time: " + m.getProperties().getEndTime());
            System.out.println(m.getProperties().getTasks());
            System.out.println();
        }
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

}
