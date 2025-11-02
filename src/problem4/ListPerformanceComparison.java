package problem4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ListPerformanceComparison {

    private static final int SIZE = 100000;
    private static final int OPERATIONS = 10000;

    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        System.out.println("---- Performance Comparison ----");

        System.out.println("---- Populate both lists ----");
        for (int i = 0; i < SIZE; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }

        testRandomInsertDelete(arrayList, "ArrayList");
        testRandomInsertDelete(linkedList, "LinkedList");

        testSequentialInsertDelete(arrayList, "ArrayList");
        testSequentialInsertDelete(linkedList, "LinkedList");

        testRandomAccess(arrayList, "ArrayList");
        testRandomAccess(linkedList, "LinkedList");
    }

    private static void testRandomInsertDelete(List<Integer> list, String name) {
        Random random = new Random();
        long start = System.nanoTime();

        for (int i = 0; i < OPERATIONS; i++) {
            int index = random.nextInt(list.size());
            list.add(index, random.nextInt());
        }
        
        for (int i = 0; i < OPERATIONS; i++) {
            int index = random.nextInt(list.size());
            list.remove(index);
        }

        long end = System.nanoTime();
        System.out.printf("%s - Random insert/delete: %.3f ms%n",
                name, (end - start) / 1000000.0);
    }

    private static void testSequentialInsertDelete(List<Integer> list, String name) {
        long start = System.nanoTime();

        if (list instanceof LinkedList) {
            LinkedList<Integer> linked = (LinkedList<Integer>) list;
            for (int i = 0; i < OPERATIONS; i++) {
                linked.addFirst(i);
                linked.addLast(i);
            }
        } else {
            for (int i = 0; i < OPERATIONS; i++) {
                list.add(0, i);
                list.add(i);
            }
        }

        if (list instanceof LinkedList) {
            LinkedList<Integer> linked = (LinkedList<Integer>) list;
            for (int i = 0; i < OPERATIONS; i++) {
                linked.removeFirst();
                linked.removeLast();
            }
        } else {
            for (int i = 0; i < OPERATIONS; i++) {
                list.remove(0);
                list.remove(list.size() - 1);
            }
        }

        long end = System.nanoTime();
        System.out.printf("%s - Sequential insert/delete: %.3f ms%n",
                name, (end - start) / 1000000.0);
    }

    private static void testRandomAccess(List<Integer> list, String name) {
        Random random = new Random();
        long start = System.nanoTime();

        long sum = 0;
        for (int i = 0; i < OPERATIONS; i++) {
            int index = random.nextInt(list.size());
            sum += list.get(index);
        }

        long end = System.nanoTime();
        System.out.printf("%s - Random access: %.3f ms%n",
                name, (end - start) / 1000000.0);
    }
}
