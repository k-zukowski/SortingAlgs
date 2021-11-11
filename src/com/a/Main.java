package com.a;


import java.util.*;

public class Main {
    static int size=10000;

    static int[] randomarr = new int[size];
    static int[] sortedarr = new int[size];
    static int[] revarr = new int[size];
    static int[] almostarr = new int[size];
    static long seed = new Random().nextLong();
    static LinkedHashMap<String,Integer> map = new LinkedHashMap<>();
    static Integer currentTime;

    static long start;

    public static void main(String[] args) {
        System.out.println("Arr size = " + size);

        Test.test(TestType.RANDOM);
        Test.test(TestType.SORTED);
        Test.test(TestType.REVERSE);
        Test.test(TestType.ALMOST);
    }





}
