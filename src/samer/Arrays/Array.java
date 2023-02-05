package samer.Arrays;

import java.util.ArrayList;
import java.util.List;

public class Array {

    List<String> array;

    public Array() {
        array = new ArrayList<>();
    }

    // Most common methods used for ArrayList
    public void listArrayMethods() {
        // Add element - O(1)
        array.add("a");

        // Get element - O(1)
        array.get(0);

        // Remove Element - removal can be done either by indicating an index, or referencing the actual object - O(1)
        array.remove(0);

        // Return array size - O(1)
        array.size();

        // Append a list to the original list (e.g. A.addAll(B) -> [a1, a2, .., b1, b2, ..] - O(n+m)
        array.addAll(new ArrayList<>());
    }

}
