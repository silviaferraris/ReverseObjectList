package com.reverseobjlist.functions;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class JsonToListFunction {

    public static List<Object> addElementsToList(String jsonResponse, String jsonElement){

        List<Object> list = new ArrayList<>();
        JSONObject obj = new JSONObject(jsonResponse);
        JSONArray array = (JSONArray) obj.get(jsonElement);

        for (int i = 0; i < array.length(); i++) {

            JSONObject new_obj = (JSONObject) array.get(i);
            list.add(new_obj);

        }
        return list;

    }

}
