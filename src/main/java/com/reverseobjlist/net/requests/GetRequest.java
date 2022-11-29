package com.reverseobjlist.net.requests;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class GetRequest {

    // aggiungi un costruttore con l'url e il metodo
    // aggiungo un metodo fetch non statico chiamato Request
    // aggiungi metodi privati con get/post ecc
    public static String getCall (String url) throws IOException {

        URL getURL = new URL(url);
        StringBuilder response = new StringBuilder();

        HttpURLConnection httpURLConnection = (HttpURLConnection) getURL.openConnection();
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.connect();

        if(httpURLConnection.getResponseCode() != HttpURLConnection.HTTP_OK){
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

        return response.toString();

    }
}
