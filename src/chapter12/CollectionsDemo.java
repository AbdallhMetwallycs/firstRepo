package chapter12;

import java.util.*;

public class CollectionsDemo {
    public static void main(String[] args) {
        setDemo();
        System.out.println(" **************** \n\n **************** ");
        listDemo();
        System.out.println(" **************** \n\n **************** ");
        queueDemo();
        System.out.println(" **************** \n\n **************** ");
        mapDemo();
    }

    public static void mapDemo() {
        Map<String, Integer> fruit = new HashMap();
        fruit.put("Apple", 90);
        fruit.put("Banana", 80);
        fruit.put("Lemon", 70);
        fruit.put("Orange", 60);
        for (String s : Arrays.asList("hamaada", "mayada", "sa3ada")) {
            fruit.put(s, 90);
        }

//        System.out.println(fruit.size());
//        System.out.println(fruit);
//        System.out.println(fruit.get("Apple"));
//        System.out.println(fruit.remove("hamaada"));
//        System.out.println(fruit);
//        System.out.println(fruit.containsKey("hamaada"));
//        System.out.println(fruit.isEmpty());
//        System.out.println(fruit.entrySet());
//        System.out.println(fruit.getClass());
        for(var entry:fruit.entrySet()) System.out.println(entry.getValue());

        fruit.forEach((k,v) -> System.out.println("Fruit "+k+" calories "+v));

    }

    public static void queueDemo() {
        
    }

    public static void listDemo() {
        
    }

    public static void setDemo() {

        Set<String> fruit = new HashSet();
        for (String s : Arrays.asList("Apple", "Banana", "Lemon", "Orange")) {
            fruit.add(s);
        }
        for (String s : Arrays.asList("Apple", "Banana", "Lemon", "Orange")) {
            fruit.add(s);
        }

        var i =fruit.iterator();
        while (i.hasNext()) System.out.println(i.next());
        System.out.println(" another method using <>");
        for(String item: fruit)System.out.println(item);
        System.out.println(" another method using foreach");
        fruit.forEach(System.out::println);
    }
}

