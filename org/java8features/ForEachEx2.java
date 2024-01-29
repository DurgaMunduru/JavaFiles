package org.java8features;

import java.util.Arrays;
import java.util.List;

public class ForEachEx2 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Durga","Pandu","Sai","Lalith Tej","Sravani");
        names.forEach(n -> System.out.println(n));
    }
}
