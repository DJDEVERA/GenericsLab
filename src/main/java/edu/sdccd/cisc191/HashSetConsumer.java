package edu.sdccd.cisc191;

import java.util.HashSet;

public class HashSetConsumer {

    private HashSet<String> hashSet;

    public HashSetConsumer(HashSet<String> HashSet){

        // constructor for hash set
        hashSet = HashSet;

    }

    public boolean consume(String e){

        // removes element e value from hash set and returns hash set
        return hashSet.remove(e);

    }


}
