package edu.sdccd.cisc191;

import java.util.ArrayList;

public class ArrayListConsumer
{

    // array list
    private ArrayList<String> list;

    public ArrayListConsumer(ArrayList<String> arrayList)
    {
        // constructor for array list
        list = arrayList;

    }

    public String consume()
    {
        // returns removed index value
        return list.remove(0);
    }

}
