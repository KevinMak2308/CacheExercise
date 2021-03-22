package dk.demo.controllers;

import java.util.HashMap;
import java.util.Map;

public class Cache {
    private int key;
    private String value;



    Map<Integer, String> cacheInfo = new HashMap<>();

    public String getCacheInfo(int key) {
         return cacheInfo.get(key);
    }

    public void setCacheInfo(int key, String value) {
        cacheInfo.put(key, value);
    }

    public boolean hasCacheInfo(int key) {
        return cacheInfo.containsKey(key);

        }

        public void removeCacheInfo(int key) {
         cacheInfo.remove(key);
    }




}





