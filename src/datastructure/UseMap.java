package datastructure;

import java.util.*;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 */
		Map<String, String> map = new HashMap<>();
		map.put("A","123456");
		map.put("B","789563");
		map.put("C","234567");
		System.out.println(map.get("A"));
		String a1[] = {"a","b","c"};
		String a2[] ={"d","e","f"};
		List<String> list1 =  Arrays.asList(a1);
		List<String> list2 = Arrays.asList(a2);

		Map<String, List<String>> list = new HashMap<String, List<String>>();
		list.put("A",list1);
		list.put("B",list2);
		Iterator it=list.entrySet().iterator();
		for (Map.Entry<String,List<String>> entry : list.entrySet()){
			System.out.println("Key = " + entry.getKey() +
					", Value = " + entry.getValue());
	}
		while(it.hasNext()){
			Map.Entry me = (Map.Entry)it.next();
			System.out.println("Key is: "+me.getKey() +
					" & " +
					" value is: "+me.getValue());
		}



	}

}







