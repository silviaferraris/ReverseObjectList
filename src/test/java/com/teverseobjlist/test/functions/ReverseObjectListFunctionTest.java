package com.teverseobjlist.test.functions;

import com.reverseobjlist.functions.ArrayToListFunction;
import com.reverseobjlist.functions.ReverseObjectListFunction;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class ReverseObjectListFunctionTest {

    @Test
    void reverseStringListTest() {

        // List of String objects test
        List<String> inputList = ArrayToListFunction.stringToArrayList("This is a string test case");
        // Reverse the list with the appropriate function
        List<String> reversedArrayList = ReverseObjectListFunction.reverseList(inputList);
        // Reverse the list with Collections method
        Collections.reverse(inputList);
        // check if the two ouputs are the same
        Assertions.assertEquals(reversedArrayList, inputList);
    }
    @Test
    void reverseIntListTest(){
        // List of String objects test
        List<Integer> inputList = Arrays.asList(1, 2, 3, 4, 5);
        // Reverse the list with the appropriate function
        List<Integer> reversedArrayList = ReverseObjectListFunction.reverseList(inputList);
        // Reverse the list with Collections method
        Collections.reverse(inputList);
        // check if the two ouputs are the same
        Assertions.assertEquals(reversedArrayList, inputList);
    }
}