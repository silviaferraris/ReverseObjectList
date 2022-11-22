package com.reverseobjlist.functions;

import java.util.ArrayList;
import java.util.List;

public class ArrayToListFunction {

    public static List<String> stringToArrayList(String inputString) {

        List<String> inputArraylist = new ArrayList<>();

        for (String s : inputString.split(" ")) {
            inputArraylist.add(s);
        }
        return inputArraylist;
    }

}
