package com.reverseobjlist.functions;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ReverseObjectListFunction {

    public static <T> List<T> reverseList(List<T> objectListToBeReversed){

        if(objectListToBeReversed == null || objectListToBeReversed.size() <=1){
            throw new IllegalArgumentException("A list is required.");
        }

        ListIterator<T> startPoint = objectListToBeReversed.listIterator();
        ListIterator<T> endPoint = objectListToBeReversed.listIterator(objectListToBeReversed.size());

        System.out.println("Lista degli oggetti prima dell'inversione degli elementi: " + objectListToBeReversed);

        for (int i= 0; i <objectListToBeReversed.size() / 2; i++){

            T startElement = startPoint.next();
            T endElement = endPoint.previous();

            startPoint.set(endElement);
            endPoint.set(startElement);

        }
        System.out.println("Lista degli oggetti dopo l'inversione degli elementi:"  + objectListToBeReversed);
        return  objectListToBeReversed;

    }

}
