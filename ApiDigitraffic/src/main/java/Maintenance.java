import java.util.ArrayList;

/**
 * This class represents a road maintenance feature from the Digitraffic API.
 * @author J.L.
 */
public class Maintenance {

    private String type;
    private MProperties properties;
    private MGeometry geometry;

    // Required empty constructor
    Maintenance() { }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public MProperties getProperties() {
        return properties;
    }

    public void setProperties(MProperties properties) {
        this.properties = properties;
    }

    public MGeometry getGeometry() {
        return geometry;
    }

    public void setGeometry(MGeometry geometry) {
        this.geometry = geometry;
    }

    static class MProperties {

        private String sendingTime, created, startTime, endTime, direction, domain, source;
        private int id;
        private ArrayList<String> tasks;

        MProperties() { }

        public String getSendingTime() {
            return sendingTime;
        }

        public void setSendingTime(String sendingTime) {
            this.sendingTime = sendingTime;
        }

        public String getCreated() {
            return created;
        }

        public void setCreated(String created) {
            this.created = created;
        }

        public String getStartTime() {
            return startTime;
        }

        public void setStartTime(String startTime) {
            this.startTime = startTime;
        }

        public String getEndTime() {
            return endTime;
        }

        public void setEndTime(String endTime) {
            this.endTime = endTime;
        }

        public String getDirection() {
            return direction;
        }

        public void setDirection(String direction) {
            this.direction = direction;
        }

        public String getDomain() {
            return domain;
        }

        public void setDomain(String domain) {
            this.domain = domain;
        }

        public String getSource() {
            return source;
        }

        public void setSource(String source) {
            this.source = source;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public ArrayList<String> getTasks() {
            return tasks;
        }

        public void setTasks(ArrayList<String> tasks) {
            this.tasks = tasks;
        }
    }

    static class MGeometry {
        private String type;
        private ArrayList<ArrayList<Double>> coordinates;

        MGeometry() { }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public ArrayList<ArrayList<Double>> getCoordinates() {
            return coordinates;
        }

        public void setCoordinates(ArrayList<ArrayList<Double>> coordinates) {
            this.coordinates = coordinates;
        }
    }
}
