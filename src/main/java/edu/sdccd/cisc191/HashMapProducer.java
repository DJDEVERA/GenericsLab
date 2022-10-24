package edu.sdccd.cisc191;

import java.util.HashMap;

public class HashMapProducer {

    // hash map K String, K Value <Key, Value>
    private HashMap<String, String> map;

    public HashMapProducer(HashMap<String, String> hashMap){

        // constructor for hash map
        map = hashMap;

    }

    public void produce(String K, String V){

        // puts string value into hash map using string key
        map.put(K, V);

    }

}
