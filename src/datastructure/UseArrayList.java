package datastructure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 */
		ArrayList<String> names = new <String>ArrayList();
		names.add("Murslin");
		names.add("Milad");
		names.add("Alimur");
		names.add("Quazi");
		Iterator it = names.iterator();
		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}

		while(it.hasNext()){
			System.out.print(it.next() + " ");
		}
		names.remove(1);
		System.out.println(names);
		System.out.println(names.get(1));




	}

}
