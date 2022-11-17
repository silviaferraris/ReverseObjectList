package Main.java;

import java.util.List;
import java.util.ListIterator;

public class ReverseObjectList {

    private static final String GET_URL = "https://gist.github.com/palianytsia/2157265";

    public static List<Object> reverseList(List<Object> objectListToBeReversed){

        if(objectListToBeReversed == null || objectListToBeReversed.size() <=1){
            throw new IllegalArgumentException("A list is required.");
        }

        ListIterator<Object> startPoint = objectListToBeReversed.listIterator();
        ListIterator<Object> endPoint = objectListToBeReversed.listIterator(objectListToBeReversed.size());

        System.out.println(objectListToBeReversed);

        for (int i= 0; i <objectListToBeReversed.size() / 2; i++){

            Object startElement = startPoint.next();
            Object endElement = endPoint.previous();

            startPoint.set(endElement);
            endPoint.set(startElement);

        }

        System.out.println(objectListToBeReversed);
        return  objectListToBeReversed;

    }

}
