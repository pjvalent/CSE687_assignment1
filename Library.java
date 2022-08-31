package syr.edu.hw1;

import java.util.ArrayList;
import java.util.List;

public class Library {

    List<String> x = new ArrayList<String>();

    public void init(String[] strings) {
        for(String z : strings) {
            x.add(z);
        }
    }

    /**
     * The search function takes in a string, and looks for a match ignoring the case.
     * The function searches for an exact match to the book, as to not return a value that matches a substring
     * @param s the string to search for
     * @return the found string, or if nothing is found returns error message
     */
    public String search(String s) {
        for(String temp : x) {
            if(temp.toLowerCase().equals(s.toLowerCase())) {
                return temp;
            }
        }
        return "No book found by that name........";
    }

}
