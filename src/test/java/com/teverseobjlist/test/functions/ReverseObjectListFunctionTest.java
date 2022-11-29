package com.teverseobjlist.test.functions;

import com.reverseobjlist.functions.ListUtils;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class ReverseObjectListFunctionTest {

    @Test
    void reverseStringListTest() {

        // List of String objects test
        List<String> inputList = new ArrayList<>(Arrays.asList(("This is a string test case").split(" ")));
        // Reverse the list with the appropriate function
        List<String> reversedArrayList = ListUtils.reverse(inputList);
        // Reverse the list with Collections method
        Collections.reverse(inputList);
        // check if the two outputs are the same
        Assertions.assertEquals(reversedArrayList, inputList);
    }
    @Test
    void reverseIntListTest(){

        // List of String objects test
        List<Integer> inputList = Arrays.asList(1, 2, 3, 4, 5);
        // Reverse the list with the appropriate function
        List<Integer> reversedArrayList = ListUtils.reverse(inputList);
        // Reverse the list with Collections method
        Collections.reverse(inputList);
        // check if the two outputs are the same
        Assertions.assertEquals(reversedArrayList, inputList);
    }
}