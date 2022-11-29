package com.reverseobjlist.functions;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class JsonUtils {

    public static List<Object> jsonArrayToList(String json, String arrayKey){

        List<Object> list = new ArrayList<>();
        JSONObject obj = new JSONObject(json);
        JSONArray array = (JSONArray) obj.get(arrayKey);

        for (int i = 0; i < array.length(); i++) {

            JSONObject new_obj = (JSONObject) array.get(i);
            list.add(new_obj);
        }

        return list;

    }

}
