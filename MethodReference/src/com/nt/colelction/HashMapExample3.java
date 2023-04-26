package com.nt.colelction;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample3 {
	public static void main(String[] args) {

		StudentCustomHashMap stuMap1 = new StudentCustomHashMap(101, "Subhrajit", 25);
		StudentCustomHashMap stuMap2 = new StudentCustomHashMap(102, "Subhasish", 28);
		StudentCustomHashMap stuMap3 = new StudentCustomHashMap(103, "Santosh", 30);

		Map<Integer, StudentCustomHashMap> map = new HashMap<Integer, StudentCustomHashMap>();

		map.put(1, stuMap1);
		map.put(2, stuMap2);
		map.put(3, stuMap3);

		/*for (Map.Entry<Integer, StudentCustomHashMap> map1 : map.entrySet()) {
			Integer key = map1.getKey();
			StudentCustomHashMap value = map1.getValue();
		
			System.out.print(key + " ");
			System.out.println(value.id + " " + value.name + " " + value.age);
		}*/

//		map.forEach((k, value) -> System.out.println(k + " " + value.id + " " + value.name + " " + value.age));

		Set<Entry<Integer, StudentCustomHashMap>> entrySet = map.entrySet();

		List<Entry<Integer, StudentCustomHashMap>> al = new ArrayList<Entry<Integer, StudentCustomHashMap>>(entrySet);

		Collections.sort(al, new Comparator<Entry<Integer, StudentCustomHashMap>>() {
			/*
				@Override
				public int compare(Entry<Integer, StudentCustomHashMap> o1, Entry<Integer, StudentCustomHashMap> o2) {
					if (o1.getValue().age == o2.getValue().age) {
						return 0;
					} else if (o1.getValue().age > o2.getValue().age) {
						return 1;
					} else
						return -1;
				}*/
		
			@Override
			public int compare(Entry<Integer, StudentCustomHashMap> o1, Entry<Integer, StudentCustomHashMap> o2) {
				return o1.getValue().name.compareTo(o2.getValue().name);
			}
		});
		
		//Using lambas		
		/*Collections.sort(al, 
		(Entry<Integer, StudentCustomHashMap> o1, Entry<Integer, StudentCustomHashMap> o2) -> o1.getValue().name.compareTo(o2.getValue().name));*/

		al.forEach(i -> System.out.println(i.getKey() + "  " + i.getValue().age));

		// Not Working
		/*Comparator<StudentCustomHashMap> comparing = Comparator.comparing(StudentCustomHashMap::getAge);
		Collections.sort(al, comparing);*/

		// Not Working with specific comparator call
		// Collections.sort(al, new AgeComparator());

	}

}
