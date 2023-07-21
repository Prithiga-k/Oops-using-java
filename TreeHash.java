import java.io.*;
import java.util.*;

class TreeMap {
    static void addValue(TreeMap <Integer,Integer> map, int x, int y) {
        map.put(x, y);
    }

    static int find_value(TreeMap<Integer, Integer> map, int x) {
        if (map.containsKey(x)) {
            return map.get(x);
        }
        return -1;
    }

    static int getSize(TreeMap<Integer, Integer> map) {
        return map.size();
    }

    static void removeKey(TreeMap<Integer, Integer> map, int x) {
        map.remove(x);
    }

    static void sorted_By_Key(TreeMap<Integer, Integer> map) {
        for (int key : map.keySet()) {
            System.out.print(key + " ");
        }
    }

    public static void TreeHash(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Q = sc.nextInt();
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < Q; i++) {
            char type = sc.next().charAt(0);
            if (type == 'a') {
                int x = sc.nextInt();
                int y = sc.nextInt();
                add_Value(map, x, y);
            } else if (type == 'b') {
                int x = sc.nextInt();
                System.out.println(find_value(map, x));
            } else if (type == 'c') {
                System.out.println(getSize(map));
            } else if (type == 'd') {
                int x = sc.nextInt();
                removeKey(map, x);
            } else if (type == 'e') {
                sorted_By_Key(map);
                System.out.println();
            }
        }
    }
}
