package org.apache.maven.archetypes.Package_3;

public class Grand_Child {
    public static void main(String[] args) {
        int[] mums = {10,18,8,25,106,98,129};
        int max = mums[0];

        for (int i = 1;i< mums.length;i++){
            if(mums[i]>max){
                max = mums[i];
            }

        }
        System.out.println(max);


        }
    }

