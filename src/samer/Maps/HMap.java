package samer.Maps;

import java.util.HashMap;
import java.util.Map;

public class HMap {

    Map<String, String> map;

    public HMap() {
        this.map = new HashMap<>();
    }

    // Most common methods used with Hash Maps
    public void listHMapMethods() {
        // Add element to map - O(1)
        map.put("samer", "elias");

        // Get element - O(1)
        map.get("samer");

        // Remove element from map O(1)
        map.remove("samer");

        // If map contains key, return true otherwise return false - O(1)
        map.containsKey("samer");

        // Return number of keys in map - O(1)
        map.size();

        // Return a collection of the values stored in map - O(n)
        map.values();

        // Return a set of Entries containing pairs of keys and values - O(n)
        map.entrySet();
    }

}
