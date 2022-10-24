package edu.sdccd.cisc191;

import java.util.ArrayList;

public class ArrayConsumer {

    // array list
    String[] list;
    // index i
    int i = 0;

    public ArrayConsumer(String[] arrayList){

        // constructor for array list
        list = arrayList;

    }

    public String consume(){

        // element in index e
        String e;

        // e corresponds with element in array list
        e = list[i];
        i++;

        // returns element in index
        return e;

    }

}
