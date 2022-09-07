import java.util.Map;

/**
 * This class represents a traffic message fetched from the Digitraffic API.
 * @author J.L.
 */
public class TrafficMessage {

    private String type;
    private Properties properties;

    // Required empty constructor
    TrafficMessage() {}

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    static class Properties {

        String situationId, situationType, trafficAnnouncementType, releaseTime, versionTime;
        int version;
        Map<String, String> contact;

        public String getSituationId() {
            return situationId;
        }

        public void setSituationId(String situationId) {
            this.situationId = situationId;
        }

        public String getSituationType() {
            return situationType;
        }

        public void setSituationType(String situationType) {
            this.situationType = situationType;
        }

        public String getTrafficAnnouncementType() {
            return trafficAnnouncementType;
        }

        public void setTrafficAnnouncementType(String trafficAnnouncementType) {
            this.trafficAnnouncementType = trafficAnnouncementType;
        }

        public String getReleaseTime() {
            return releaseTime;
        }

        public void setReleaseTime(String releaseTime) {
            this.releaseTime = releaseTime;
        }

        public String getVersionTime() {
            return versionTime;
        }

        public void setVersionTime(String versionTime) {
            this.versionTime = versionTime;
        }

        public int getVersion() {
            return version;
        }

        public void setVersion(int version) {
            this.version = version;
        }

        public Map<String, String> getContact() {
            return contact;
        }

        public void setContact(Map<String, String> contact) {
            this.contact = contact;
        }
    }

}
