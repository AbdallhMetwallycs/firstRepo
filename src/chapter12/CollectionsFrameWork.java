package chapter12;

import java.util.*;

public class CollectionsFrameWork {
    public static void main(String[] args) {
        setTest();
        System.out.println(" **************** \n\n\n **************** ");
        listTest();
        System.out.println(" **************** \n\n\n **************** ");
        queueTest();
        System.out.println(" **************** \n\n\n **************** ");
        mapTest();
    }

    private static void mapTest() {
        Map fruit = new HashMap();
        fruit.put("Apple", 90);
        fruit.put("Banana", 80);
        fruit.put("Lemon", 70);
        fruit.put("Orange", 60);
        for (String s : Arrays.asList("hamaada", "mayada", "sa3ada")) {
            fruit.put(s, 90);
        }

        System.out.println(fruit.size());
        System.out.println(fruit);
        System.out.println(fruit.get("Apple"));
        System.out.println(fruit.remove("hamaada"));
        System.out.println(fruit);
        System.out.println(fruit.containsKey("hamaada"));
        System.out.println(fruit.isEmpty());
        System.out.println(fruit.entrySet());
        System.out.println(fruit.getClass());


    }

    /**
     * Queue  repeat values  ,
     *  follow FIFO Algorithm First in First Out
     * Queue  are ordered
     */
    private static void queueTest() {

        Queue fruit = new LinkedList();
        for (int i = 0; i < 2; i++) {
            for (String s : Arrays.asList("Apple", "Banana", "Lemon", "Orange")) {
                fruit.add(s);
            }
        }

        System.out.println(" "+fruit);
        System.out.println(" "+ fruit.peek());
        System.out.println(" "+fruit);
        System.out.println(" "+ fruit.remove());
        System.out.println(" "+fruit);
        System.out.println(" "+ fruit.poll());
        System.out.println(" "+fruit);
        System.out.println(" "+fruit.size());
        System.out.println(" "+fruit);
        System.out.println(" "+fruit.getClass());

    }

    /**
     * list  repeat values  ,
     *  can search for an element by it's index ,
     * lists  are ordered
     */
    public static void listTest() {

        List fruit = new ArrayList();
        for (String string : Arrays.asList("Apple", "Banana", "Lemon")) {
            fruit.add(string);
        }
        for (String s : Arrays.asList("Orange", "Apple", "Banana", "Lemon")) {
            fruit.add(s);
        }
        fruit.add("Orange");

        System.out.println(" "+fruit.getLast());
        System.out.println(" "+fruit.get(5));
        System.out.println(" "+fruit.getFirst());
        System.out.println(" "+fruit.size());
        System.out.println(" "+fruit);
        System.out.println(" "+fruit.getClass());

    }

    /**
     * sets don't repeat values if the value is add before ,
     * it's ignored in size and printing elements,
     * also can't search for an element by it's index ,
     * Sets are unordered
     */
    public static void setTest(){

        Set fruit = new HashSet();
        for (String s : Arrays.asList("Apple", "Banana", "Lemon", "Orange")) {
            fruit.add(s);
        }
        for (String s : Arrays.asList("Apple", "Banana", "Lemon", "Orange")) {
            fruit.add(s);
        }

        System.out.println(" "+fruit.size());
        System.out.println(" "+fruit);
        System.out.println(" "+fruit.getClass());

    }
}
