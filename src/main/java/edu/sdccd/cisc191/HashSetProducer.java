package edu.sdccd.cisc191;

import java.util.HashSet;

public class HashSetProducer {

    private HashSet<String> hashSet;

    public HashSetProducer(HashSet<String> HashSet){

        // constructor for hash set
        hashSet = HashSet;

    }

    public boolean produce(String e){

        // adds element e to hash set and returns hash set
        return hashSet.add(e);

    }

}
