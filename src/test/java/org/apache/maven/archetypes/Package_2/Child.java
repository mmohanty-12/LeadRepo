package org.apache.maven.archetypes.Package_2;

import java.util.HashMap;

public class Child {
    public static void main(String[] args) {
        String s = new String("Manjeet Mohanty");
        char[] c = s.toCharArray();
        HashMap<Character,Integer> h = new HashMap<>();

        for(char c1:c){
            h.put(c1,h.getOrDefault(c1,0)+1);
        }
        System.out.println(h.entrySet());
    }
}
