package com.a;

import java.util.Random;

public class Tests {
    static void testRandom(Sort sort,boolean showOutput){
        Random rand = new Random(Main.seed);
        for (int i = 0; i < Main.size; i++) {
            Main.randomarr[i] = (int) (rand.nextDouble() * 1000 + 1);
        }
        sort.sort(Main.size,Main.randomarr);
        if (showOutput)
            showList();

    }
    static void testSorted(Sort sort,boolean showOutput){

        for (int i = 1; i < Main.size; i++) {
            Main.sortedarr[i] = i;
        }
        sort.sort(Main.size,Main.sortedarr);
        if (showOutput)
            showList();

    }
    static void testReversed(Sort sort,boolean showOutput){

        for (int i = Main.size-1; i > 0; i--) {
            Main. revarr[i] = i;
        }

        sort.sort(Main.size,Main.revarr);
        if (showOutput)
            showList();

    }
    static void testAlmost(Sort sort,boolean showOutput){
        for (int i = 1; i < Main.size; i++) {
            Main.almostarr[i] = i;
        }

        for (int i = 0; i < Main.size/80; i++) {
            Main.almostarr[randomint(1,Main.size)]=Main.almostarr[randomint(1,Main.size)];
        }

        sort.sort(Main.size,Main.almostarr);
        if (showOutput)
            showList();
    }

    public static int randomint(int min, int max) {
        Random random = new Random();
        return random.ints(min, max)
                .findFirst()
                .getAsInt();
    }

    static public void showList() {
        for (int i = 0; i < Main.size; i++) {
            System.out.print(Main.randomarr[i]);
            System.out.print("  ");
        }
        System.out.println();
    }
    static void timerStart(){
        Main.start = System.nanoTime();
    }
    static int timerEnd(){
        return (int)((System.nanoTime() - Main.start));
    }
}
