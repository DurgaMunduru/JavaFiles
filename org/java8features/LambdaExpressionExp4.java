package org.java8features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdaExpressionExp4 {
    public static void main(String[] args) {




       List<String> fruits = Arrays.asList("Mango","Apple","Grapes","Banana","Dry Fruits","Kiwi");
        fruits.forEach(n -> System.out.println(n));
    }
}
