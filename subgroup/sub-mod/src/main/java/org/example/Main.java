package org.example;

/**
 * *
 * <p>Created by irina on 3/29/2023.</p>
 * <p>Project: Default (Template) Project</p>
 * *
 */
public class Main {
    public static void main(String[] args) {
        SomeClass someClass = new SomeClass("hello");
        System.out.println("**********************************");
        System.out.println(someClass.getGreeting() + " from sub-mod!");
        System.out.println("**********************************");
    }
}