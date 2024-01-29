package org.collections.map;

import java.util.Map;
import java.util.*;
public class MapEx1 {
    public static void main(String[] args) {

       List<String> list = new ArrayList<>();
       //   1.Creation of map
       Map<Integer,String> map = new Hashtable<>();

       //   2.Adding elements to Map
        map.put(532421,"Srikakulam");
        map.put(532322,"Vizag");
        map.put(121212,"Hyderabad");

        //  3.retrieval of keys from Map
        Set<Integer> keys = map.keySet();


        for(Integer key:keys){
            System.out.println(key);
        }

        //  4.retrieval of values from Map
        Collection<String> values = map.values();
        for (String value: values){
            System.out.println(value);
        }

        //  5.retrieval of values based on keys
        System.out.println(map.get(532421));

        //  6.deleting the element from the map
        //map.remove(532421);
        //System.out.println(map);

        //  7.Check key contains or not in map
        System.out.println(map.containsKey(53421));

        //  8.check value contains or not in map
        System.out.println(map.containsValue("Srikakulam"));

        //  9.update any element in map
        map.replace(121212,"Chennai");
        System.out.println(map);











    }
}
