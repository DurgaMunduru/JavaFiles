package org.fundamentals;
//programming : which has to perform some operation which has giving input and getting output
//programming Language: which has some syntax and guidelines to perform any task

//java programming language:
//  => invented by james gosling
//  => it is Object oriented and
//           1.simple
//           2.Secure,
//           3.Robust,
//           4.Platform independent
//           5.distributed
//
//  => it is object-oriented programming language designed to develop all kinds of applications
//      1.web applications
//      2.Desktop applications
//      3.Android Applications
//  => Different technologies available
//          java SE - standard edition
//                      by using this desktop applications
//          java EE - Enterprise edition
//                      by using this Web Applications like banking,ecommerce
//          java ME - Micro Edition
//                      by using this Micro applications like embedded applications

//  for running program in command prompt
//      create a text file a code whatever u want and open command open choose file and compile the file with "javac" and run the file with "java"

//  public class FirstProgram {
//    public static void main(String[] args) {
//        System.out.println("Hello World");
//    }
//}

// =>  class:
//          class is a blueprint of our project which have variables and methods as members
//
//  => Object: It is instance of the class, and object will allocate memory for class
// =>  Method:
//          method is a member of class which perform some operation or task
//      syntax:
//          accessModifier staticOrNonStatic returnType  methodName(parameters) throws ExceptionList
//              {
//                  //method Body
//                  return value;
//              }
//
// => Constructor:
//             - block of code similar to the method. But the only diff btw method and constructor is
//                  method: it is called ofter creating the object
//                  constructor: it is called when object of the class is created
//             - constructor is allocating the memory for all the members of the class
//             - by default the constructor is called in java
//             - It not return anything
//
//     default or implicit constructor syntax:
//
//              public class FirstProgram{
//              public static void main(String[] args) {
//                      //creating an object
//                     FirstProgram p = new FirstProgram();
//    }
//      //default constructor
//     public FirstProgram(){
//
//                  }
//  }
//
//  => looping statements:
//              while
//              do-while
//              for
//              foreach (extended for loop)
//
//      foreach:
//          syntax: for(dataType varName:arrayOrCollection)
//                      {   //statements   }
//      note: foreach loop is used for arrays or collections only

//   example:
//
//            public class FirstProgram {
//                public static void main(String[] args) {
//                    int a[] = {1,2,3,4,5,6,7,8,5,4,};
//
//                    for(int i:a){
//                        System.out.println(i);
//                    }
//                }
//            }


//      foreach loop for Multidimensional array:

//            public class FirstProgram {
//                            public static void main(String[] args) {
//                                int a[][] = {
//                                        {1,2,3},
//                                        {4,5,6},
//                                        {6,7,8}
//                                };
//                                int sum = 0;
//                               for(int[] singleDimArray:a){
//                                   for (int value:singleDimArray){
//                                       sum = sum+ value;    //sum of elements
//                                   }
//
//                                   System.out.println(sum);
//                                }
//                           }
//                       }

//
//