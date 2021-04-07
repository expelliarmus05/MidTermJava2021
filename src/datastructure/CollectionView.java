package datastructure;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class CollectionView {

        public static void main(String[] args) {
        /*
         Map is created and inserted some data.Retrieve the Collection view of values present in map
         */
                Map<String, String> map = new HashMap<>();
                map.put("A","123456");
                map.put("B","789563");
                map.put("C","234567");
//                System.out.println(map);
//                map.remove("A","123456");
//                map.remove("B","9976433");
//                System.out.println(map);
//                map.replace("C","234567","1111111");
//                map.putIfAbsent("A","145678");
//                System.out.println(map);
//                System.out.println(map.containsKey("A"));
//                System.out.println(map.containsKey("D"));
                System.out.println(map.values());

        }
}
