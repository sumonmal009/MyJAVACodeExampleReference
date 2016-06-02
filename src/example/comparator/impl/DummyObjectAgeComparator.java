package example.comparator.impl;

import java.util.Comparator;

public class DummyObjectAgeComparator implements Comparator<DummyObject> {

	@Override
	public int compare(DummyObject arg0, DummyObject arg1) {
		return (arg0.getAge() - arg1.getAge());
	}

}
