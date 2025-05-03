package org.apache.maven.archetypes.Package_1;

public class Parent {
    public static void main(String[] args) {
        String s = new String("Manjeet Mohanty");
        StringBuilder s1 = new StringBuilder(s);
        String s3 = s1.reverse().toString();
        System.out.println("reverse Of Sting - " + s3);
    }
}
