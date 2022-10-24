package edu.sdccd.cisc191;

import java.util.ArrayList;

public class ArrayListProducer
{
    // array list
    private ArrayList<String> list;

    public ArrayListProducer(ArrayList<String> arrayList)
    {
        // constructor for array list
        list = arrayList;

    }

    public void produce(int i, String string)
    {
        // adds string to index
        list.add(i, string);
    }

}
