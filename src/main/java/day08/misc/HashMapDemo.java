package day08.misc;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		String[] arrName = { "Bharu", "Bharu", "Santhu", "Bliss", "Santhu" };
		HashMap<String, Integer> HashMapDemo = new HashMap<String, Integer>();

		for (int i = 0; i < arrName.length; i++) {
			if (HashMapDemo.get(arrName[i]) == null) {
				HashMapDemo.put(arrName[i], 1);
			}

			else {
				int count = HashMapDemo.get(arrName[i]);
				count++;
				HashMapDemo.put(arrName[i], count);
			}

		}
		System.out.println(HashMapDemo);

	}
}
