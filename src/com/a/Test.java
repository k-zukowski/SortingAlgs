package com.a;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class Test {
    static void test(TestType type){
        switch (type){
            case RANDOM:
                System.out.println(type + " Test :");
                break;

            case SORTED:
                System.out.println(type + " Test :");
                break;

            case REVERSE:
                System.out.println(type + " Test :");
                break;

            case ALMOST:
                System.out.println(type + " Test :");
                break;

        }

        System.out.println(Bbl.class.getSimpleName());
        Tests.timerStart();
        switch (type){
            case RANDOM:
                Tests.testRandom(new Bbl(),false);
                break;

            case SORTED:
                Tests.testSorted(new Bbl(),false);
                break;

            case REVERSE:
                Tests.testReversed(new Bbl(),false);
                break;
            case ALMOST:
                Tests.testAlmost(new Bbl(),false);
                break;

        }
        Main.currentTime = Tests.timerEnd();
        System.out.println(Main.currentTime);
        Main.map.put(Bbl.class.getSimpleName(),Main.currentTime);

        System.out.println("Bbl2");
        Tests.timerStart();
        switch (type){
            case RANDOM:
                Tests.testRandom(new Bbl2(),false);
                break;

            case SORTED:
                Tests.testSorted(new Bbl2(),false);
                break;

            case REVERSE:
                Tests.testReversed(new Bbl2(),false);
                break;
            case ALMOST:
                Tests.testAlmost(new Bbl2(),false);
                break;

        }
        Main.currentTime = Tests.timerEnd();
        System.out.println(Main.currentTime);
        Main.map.put(Bbl2.class.getSimpleName(),Main.currentTime);

        System.out.println("Insert");
        Tests.timerStart();
        switch (type){
            case RANDOM:
                Tests.testRandom(new Insert(),false);
                break;

            case SORTED:
                Tests.testSorted(new Insert(),false);
                break;

            case REVERSE:
                Tests.testReversed(new Insert(),false);
                break;
            case ALMOST:
                Tests.testAlmost(new Insert(),false);
                break;

        }
        Main.currentTime = Tests.timerEnd();
        System.out.println(Main.currentTime);
        Main.map.put(Insert.class.getSimpleName(),Main.currentTime);

        System.out.println("Select");
        Tests.timerStart();
        switch (type){
            case RANDOM:
                Tests.testRandom(new Select(),false);
                break;

            case SORTED:
                Tests.testSorted(new Select(),false);
                break;

            case REVERSE:
                Tests.testReversed(new Select(),false);
                break;
            case ALMOST:
                Tests.testAlmost(new Select(),false);
                break;

        }
        Main.currentTime = Tests.timerEnd();
        System.out.println(Main.currentTime);
        Main.map.put(Select.class.getSimpleName(),Main.currentTime);


        System.out.println();



        System.out.println("Summary = " +Main.map);


        List<Map.Entry<String, Integer> > list = new ArrayList<>(   Main.map.entrySet()   );
        list.sort(Comparator.comparingInt(Map.Entry::getValue));
        System.out.println();
        System.out.println("Sorted(fastest) : ");
        for (Map.Entry<String, Integer> l : list) {
            System.out.println(l.getKey()
                    + ": Value ->"
                    + l.getValue());
        }
        System.out.println("=====================================================================================");


    }
}
