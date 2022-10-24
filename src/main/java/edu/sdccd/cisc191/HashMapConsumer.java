package edu.sdccd.cisc191;

import java.util.HashMap;

public class HashMapConsumer {

    // hash map with K String and V String <Key, Value>
    private HashMap<String, String> map;

    public HashMapConsumer(HashMap<String, String> hashMap){

        // constructor for hash map
        map = hashMap;

    }

    public String consume(String s){

        // gets string value of hash map from key
        return map.get(s);

    }

}
