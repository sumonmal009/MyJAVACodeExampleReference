package example.comparator;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import example.comparator.impl.DummyObject;
import example.comparator.impl.DummyObjectAgeComparator;
import example.comparator.impl.DummyObjectNameComparator;

public class MainClass {

	public static void main(String[] args) {


		List<DummyObject> dummyObjectList = new LinkedList<DummyObject>();


		for (int i=0; i<10;i++){
			dummyObjectList.add(new DummyObject(new Random().nextInt(300),"X"+new Random().nextInt(200)));
		}
		System.out.print("Unsorted List:");
		System.out.println(dummyObjectList.toString());

		Collections.sort(dummyObjectList, new DummyObjectAgeComparator());
		System.out.print("\nSorted List by DummyObjectAgeComparator :");
		System.out.println(dummyObjectList.toString());
		
		Collections.sort(dummyObjectList, new DummyObjectNameComparator());
		System.out.print("\nSorted List by DummyObjectNameComparator :");
		System.out.println(dummyObjectList.toString());
		
	}

}
