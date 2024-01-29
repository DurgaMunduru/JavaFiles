package org.java8features;

@java.lang.FunctionalInterface
interface Addition{
    void add(int a, int b);
}
public class LambdaExpressionExp2 {
    public static void main(String[] args) {
        Addition addition = (a, b) -> System.out.println("Addition of two number is:" +(a+b));
        addition.add(10,20);
    }
}
