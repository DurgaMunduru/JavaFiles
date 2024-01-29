package org.strings;

//      String: String is a sequence of characters, and it is class in java but considered as a
//              literal because of its unique behaviour, it is a non-primitive datatype
//
//      syntax for creating String is in two ways:
//              //value stored in string pool in brick order
//          1. String stringName = "value";
//              //value stored in head area
//          2  String stringName = new String("value");
//
//      String Methods: By using the String methods string manipulation is possible
//                              1.equals()
//                              2.equalsIgnoreCase()
//                              3.startsWith()
//                              4.contains()
//                              5.endsWith()
//                              6.length()
public class Strings {
    public static void main(String[] args) {
//        String s1 = "Durga";
//        String Email = "munduru@gmail.com";
//
//        System.out.println(s1);
//        System.out.println(Email);
//        System.out.println(  s1+Email);  //String Concatenation

        //  => equals method: use equals method it is possible to compare to strings in heap area

//  example:
//             String s1="hello";     //stored in string pool
//             String s2 ="hello";     //stored in string pool
//
//            String s3 = new String("Hi");   //stored in heap
//            String s4 = new String("Hi");   //stored in heap
//
//            System.out.println(s1 == s2);   //comparison is possible because both are in string pool
//
//            System.out.println(s1==s3);     //not possible because both r in different areas
//            System.out.println(s3==s4);     //it will compare the address of the objects
//
//            System.out.println(s3.equals(s4));      //using equals keyword it will compare values of the objects

        // Note: if we want to compare two strings use equals method

    }
}
