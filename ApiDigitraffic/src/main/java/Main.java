import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.util.*;

/**
 * Class used to test code.
 * @author J.L.
 */
public class Main {
    public static void main(String[] args) throws IOException {

        List<Task> tasks = ServerRequest.getObject(
                DigiURL.MAINTENANCE_ALL, new TypeToken<List<Task>>() {}
        );

        for (Task task : tasks) {
            System.out.println(task.getNameEn());
        }
    }
}
