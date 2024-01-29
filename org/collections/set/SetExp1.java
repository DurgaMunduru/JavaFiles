package org.collections.set;

import java.util.HashSet;

public class SetExp1 {
    public static void main(String[] args) {
        //  1.Hashset --> hashmap

        HashSet<Integer> hs = new HashSet<>();
        hs.add(10);
        hs.add(45);
        hs.add(57);
        hs.add(75);
        hs.add(75);

        System.out.println(hs);

        hs.remove(57);

        System.out.println(hs);

    }
}
