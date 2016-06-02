package example.comparator.impl;

import java.util.Comparator;

public class DummyObjectNameComparator implements Comparator<DummyObject> {

	@Override
	public int compare(DummyObject arg0, DummyObject arg1) {

		return (arg0.getName().compareTo(arg1.getName()));
	}
}
