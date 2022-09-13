
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.net.HttpURLConnection;

import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.zip.GZIPInputStream;

/**
 * Class used to connect to an API with a web address and extract an object of any type.
 * @author J.L.
 */
public class ServerRequest {

    /**
     * Use Gson to return an object of type T from a web address.
     *
     * Example usage (get response for road conditions):
     *      RoadConditionResponse response =
     *              ServerRequest.getObject(
     *                   "this should be an accurate url",
     *                   new TypeToken<RoadConditionResponse>(){});
     *
     * @param url The web address to the raw data
     * @param token A TypeToken for the returned type
     * @param <T> The type to be returned
     * @return An object of type T with the data from the web address
     */
    static <T> T getObject(String url, TypeToken<T> token) throws IOException {
        return new Gson().fromJson(
                getRawData(url),
                token.getType());
    }

    /**
     * Connect to a URL and return its raw data as a String.
     * @param url The web address to the raw data
     * @return Raw data as a string
     */
    static String getRawData(String url) throws IOException {
        
        // Configure url connection
        HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
        conn.setRequestMethod("GET");
        conn.setRequestProperty("Accept-Encoding", "gzip");

        // Get gzip stream
        InputStream stream = conn.getInputStream();
        InputStream bodyStream = new GZIPInputStream(stream);

        // Decompress gzip to byte array
        ByteArrayOutputStream outStream = new ByteArrayOutputStream();
        byte[] buffer = new byte[4096];
        int length;
        while ((length = bodyStream.read(buffer)) > 0)
            outStream.write(buffer, 0, length);

        // Return the content of the stream as a String
        return outStream.toString(StandardCharsets.UTF_8);
    }
}
