package samer.Sets;

import java.util.HashSet;
import java.util.Set;

public class HSet {

    Set<Integer> set;

    public HSet() {
        set = new HashSet<>();
    }

    // Most common methods used with Hash Sets
    public void listHashSetMethods() {
        // Add element - O(1)
        set.add(1);

        // Return true if element is in set, otherwise return false - O(1)
        set.contains(1);

        // Remove element - O(1)
        set.remove(1);

        // Return size of set - O(1)
        set.size();

        // Add all elements in set B to set A - O(n+m)
        set.addAll(new HashSet<>());

        // Return true if set is empty, otherwise return false - O(1)
        set.isEmpty();
    }

}
