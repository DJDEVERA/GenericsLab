package edu.sdccd.cisc191;

public class ArrayProducer {

    private String[] array;

    public ArrayProducer(String[] arrayList){

        // constructor for array list
        array = arrayList;

    }

    public void produce(int i, String s){

        // index i in array list replaces string s
        array[i] = s;

    }

}
