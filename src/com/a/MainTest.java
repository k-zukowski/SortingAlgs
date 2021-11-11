package com.a;

import java.util.Arrays;
import java.util.Random;

public class MainTest {
    static int size=100;
    static int[] almostarr = new int[size];
    public static void main(String[] args) {
        for (int i = 1; i < size; i++) {
            almostarr[i] = i;
            System.out.print(i + ", ");
        }
        System.out.println();

        for (int i = 0; i < size/10; i++) {
            almostarr[randomint(1,size)]=almostarr[randomint(1,size)];
        }
        System.out.println(Arrays.toString(almostarr));

    }
    public static int randomint(int min, int max) {
        Random random = new Random();
        return random.ints(min, max)
                .findFirst()
                .getAsInt();
    }
}
