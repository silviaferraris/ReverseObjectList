package Main.java;

import java.io.IOException;

public class Business {

    public static void invertObjectList() throws IOException {
        //make the rest GET call
        String url = "https://swapi.dev/api/people";
        //pass the object as parameter to the reverseObject class
        ReverseObjectList.reverseList(GetRestCall.makeRestCall(url));
    }



}
