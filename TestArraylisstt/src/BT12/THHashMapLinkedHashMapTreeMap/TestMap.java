package BT12.THHashMapLinkedHashMapTreeMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Long", 1999);
        hashMap.put("Vladimir", 2002);
        hashMap.put("Vladimirovic", 1229);
        System.out.println(" dùng hashmap");
        System.out.println(hashMap + "\n");


        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println(" dùng TreeMap");
        System.out.println(treeMap);

        Map<String, Integer> linkedListMap = new LinkedHashMap<>();
        linkedListMap.put("Long vla", 1999);
        linkedListMap.put("Long1 vla", 2999);
        linkedListMap.put("Long2 vla", 3999);
        System.out.println("\n" + linkedListMap.get("Long vla"));
    }
}
