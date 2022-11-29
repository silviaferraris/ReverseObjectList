package com.reverseobjlist.app;

import com.reverseobjlist.functions.IntUtils;
import com.reverseobjlist.functions.JsonUtils;
import com.reverseobjlist.functions.ListUtils;
import com.reverseobjlist.net.requests.GetRequest;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Business {

    static Scanner scanner = new Scanner(System.in);
    public static void invertObjectList() throws IOException {

        // make the rest GET call
        System.out.println("Digit the url for the connection: ");
        String url = scanner.next();
        // get the json response
        String jsonResponse = GetRequest.getCall(url);
        // get the list of json response of a specified element
        System.out.println("Which json element do you want to reverse?");
        String jsonElement = scanner.next();

        List<Object> listFromJsonElement = JsonUtils.jsonArrayToList(jsonResponse, jsonElement);
        // reverse the input list
        ListUtils.reverse(listFromJsonElement);

    }

    public static void findLastNumber() {

        System.out.println("Digit the total number: ");
        int total = scanner.nextInt();
        System.out.println("Digit the number of reps: ");
        int size = scanner.nextInt();
        System.out.println("L'ultimo numero è: " + IntUtils.findLastOne(total,size));

    }

}
