package com.reverseobjlist.functions;

public class IntUtils {
    public static int findLastOne(int total, int size){

        int sum = size * (size+1) / 2,
                firstValue = (total - sum) / size;

        return firstValue + size;

    }
}
