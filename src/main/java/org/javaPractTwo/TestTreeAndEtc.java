package org.javaPractTwo;

import java.util.TreeSet;

public class TestTreeAndEtc {

public static void main(String[] arga){

    testTreeSet();


}

    public static void testTreeSet(){

        TreeSet<String> ts = new TreeSet<String>();
        ts.add("India");
        ts.add("China");
        ts.add("United States");
        ts.add("Europe");
        ts.add("Africa");
        System.out.println("ts.size(): "+ts.size());
        ts.ceiling("Europe");
        System.out.println("ts: "+ts);
        System.out.println("ts.contains(\"India\"): "+ts.contains("India"));
        System.out.println("ts.first(): "+ts.first());
        System.out.println("ts.floor(\"India\"): "+ts.floor("India"));
        System.out.println("ts.pollFirst(): "+ts.pollFirst());
        System.out.println("ts.isEmpty(): "+ts.isEmpty());
        System.out.println("ts.getClass(): "+ts.getClass());

    }

}
