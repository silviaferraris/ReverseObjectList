package com.reverseobjlist.app;

import com.reverseobjlist.functions.JsonToListFunction;
import com.reverseobjlist.functions.ReverseObjectListFunction;
import com.reverseobjlist.net.requests.GetRequest;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Business {

    public static void invertObjectList() throws IOException {

        // make the rest GET call
        System.out.println("Digit the url for the connection: ");
        Scanner scanner = new Scanner(System.in);
        String url = scanner.next();
        // get the json response
        String jsonResponse = GetRequest.getCall(url);
        // get the list of json response of a specified element
        System.out.println("Which json element do you want to reverse?");
        String jsonElement = scanner.next();

        List<Object> listFromJsonElement = JsonToListFunction.addElementsToList(jsonResponse, jsonElement);
        // reverse the input list
        ReverseObjectListFunction.reverseList(listFromJsonElement);

    }



}
