package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int x[] = new int[10];
        /*for (int i = 0; i < 10; i++) {
            System.out.println(x[i]);
        }*/

        //y tipo do que vai percorrer por isso int y - depois o que vai percorrer que é o vetor x
        /*for (int y:x) {
            System.out.println(ze);
        }
        int vetor[] = {12,45,78};
        for (int) {

        }*/

        int v1[] = {1,2,3,4,5,6,7,9,11,13,15};
        int v2[] = new int[10];

        //System.arraycopy(v1,3,v2,5,3);

        Arrays.fill(v2,99);

        for (int i = 0; i<v2.length; i++) {
            System.out.println(v2[i]);
        }
    }
}
