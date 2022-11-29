package com.reverseobjlist.functions;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListUtils {

    public static <T> List<T> reverse(List<T> objectListToBeReversed){

        if(objectListToBeReversed == null){
            throw new IllegalArgumentException("A list is required.");
        }

        if(objectListToBeReversed.size() <= 1){
            return objectListToBeReversed;
        }

        ListIterator<T> forwardIterator = objectListToBeReversed.listIterator();
        ListIterator<T> backwardIterator = objectListToBeReversed.listIterator(objectListToBeReversed.size());

        System.out.println("Lista degli oggetti prima dell'inversione degli elementi: " + objectListToBeReversed);

        for (int i= 0; i <objectListToBeReversed.size() / 2; i++){

            T startElement = forwardIterator.next();
            T endElement = backwardIterator.previous();

            forwardIterator.set(endElement);
            backwardIterator.set(startElement);

        }
        System.out.println("Lista degli oggetti dopo l'inversione degli elementi:"  + objectListToBeReversed);
        return  objectListToBeReversed;

    }



}
