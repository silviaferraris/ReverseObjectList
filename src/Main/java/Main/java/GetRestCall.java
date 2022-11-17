package Main.java;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class GetRestCall {

    public static List<Object> makeRestCall (String url) throws IOException {

        URL getURL = new URL(url);
        StringBuilder response = new StringBuilder();

        HttpURLConnection httpURLConnection = (HttpURLConnection) getURL.openConnection();
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.connect();

        if(httpURLConnection.getResponseCode() != httpURLConnection.HTTP_OK){
            throw new RuntimeException("HttpResponseCode: " + httpURLConnection.getResponseCode());
        }
        // Retrieve GET response
        else{

            System.out.println("Response code: " + httpURLConnection.getResponseCode());
            InputStream inputStream = httpURLConnection.getInputStream();

            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            for (String line; (line = reader.readLine()) != null; ) {
                response.append(line);
            }

        }

        //retrieve the object from the json response and add them into a List
        List<Object> list = new ArrayList<>();
        JSONObject obj = new JSONObject(response);
        JSONArray array = (JSONArray) obj.get("results");

        for (int i = 0; i < array.length(); i++) {

            JSONObject new_obj = (JSONObject) array.get(i);
            list.add(new_obj);

        }
        return list;
    }
}
