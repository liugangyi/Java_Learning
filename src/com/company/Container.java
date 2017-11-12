package com.company;

import java.util.*;

public class Container {
    public static void test_queue() {
        Queue<Character> queue = new LinkedList<>();
        for (char c : "my name is lgy".toCharArray())
            queue.offer(c);
        System.out.println(queue.toString());

        while(queue.peek() != null) {
            System.out.println(queue.poll());
        }

        for (char c : "my name is lgy".toCharArray())
            queue.offer(c);
        while (true) {
            Character c = queue.poll();
            if(null == c) break;
            System.out.println(c);
        }

        System.out.println(queue);
    }

    public static void test_random() {
        Random rand = new Random(47);
        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<10000; ++i) {
            int r = rand.nextInt(5);
            Integer freq = map.get(r);
            map.put(r, freq == null ? 1 : freq + 1);
        }

        System.out.println(map.toString());
    }

    public static void test_map() {
        Map<String, String> map = new HashMap<>();
        map.put("1", "abc");
        map.put("2", "bcd");
        System.out.println(map.toString());
        System.out.println(map.get("2"));

        for(Map.Entry<String, String> entry : map.entrySet())
            System.out.println(entry);
    }

    public static void test_iterator() {
        Collection<Integer> collection = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        System.out.println(collection.toString());
        display(collection.iterator());

        List<Integer> list = Arrays.asList(10, 11, 12, 13, 14, 15);
        System.out.println(list.toString());
        display(list.listIterator());
    }

    private static void display(Iterator<Integer> it) {
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }

    public static void test_set() {
        Set<Integer> set1 = new HashSet<>();
        Collections.addAll(set1, 1, 2, 3, 4, 5);
        System.out.println(set1.toString());

        Set<Integer> set2 = new HashSet<>();
        Collections.addAll(set2, 4, 5, 6, 7, 8);
        System.out.println(set2.toString());

        System.out.println("set1 in set2 : " + set2.containsAll(set1));

        Set<Integer> set3 = new HashSet<>();
        set3 = set2;
        set2.retainAll(set1);
        System.out.println("set2 retain set1 : " + set2.toString());
        set2.removeAll(set1);
        System.out.println("set2 remove set1 : " + set2.toString());

        System.out.println("set3 is : " + set3.toString());
    }
}
