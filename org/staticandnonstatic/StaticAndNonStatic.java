
//
//      In java, We are not able to run anything without the memory allocation of that class,method or object
//          so,the main method or entry point of code was not runnable because not allocated memory for that, then
//          static comes , it was another way to run the program with creating the object
//
//  => Static:It is Keyword which creates an objects itself
//
//      basically ,
//
//          java file ---------> class file ------------> class loader ------> JVM memory
//                     compile              run/execute

//         In JVM memory,
//                  1.method area,
//                  2.Heap Memory,
//                  3.and stack area is there
//         1.Method area: In method area all the static blocks,static variables ,static methods are created
//         2.Heap memory: In heap, Objects is stored in that objects memory its variables and methods are stored
//   go through by searching Jvm Memory


package org.staticandnonstatic;

import java.util.Random;

public class StaticAndNonStatic {

        //  Non-Static

    //int number;
    //public static void main(String[] args) {
        //creating obj
//        StaticAndNonStatic t1 = new StaticAndNonStatic();
//        //giving random values to number
//        t1.number = new Random().nextInt();
//
//        StaticAndNonStatic t2 = new StaticAndNonStatic();
//        t2.number = new Random().nextInt();
//
//        StaticAndNonStatic t3 = new StaticAndNonStatic();
//        t3.number = new Random().nextInt();
//
//        System.out.println(t1.number);
//        System.out.println(t2.number);
//        System.out.println(t3.number);

        //output: it will given random unequal values for t1,t2,t3 because of non-static variable number


        //  Static

        //by using static memory will share equally to all objects
        static int number;

        public static void main(String[] args) {
            //creating obj
            StaticAndNonStatic t1 = new StaticAndNonStatic();
            //giving random values to number
            t1.number = new Random().nextInt();

            StaticAndNonStatic t2 = new StaticAndNonStatic();
            t2.number = new Random().nextInt();

            StaticAndNonStatic t3 = new StaticAndNonStatic();
            t3.number = new Random().nextInt();

            System.out.println(t1.number);
            System.out.println(t2.number);
            System.out.println(t3.number);


        }
}