package example.comparator.impl;

public class DummyObject {

	public DummyObject(int age, String name) {
		//super();
		this.age = age;
		this.name = name;
	}
	private int age;
	private String name;

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString(){
		return "\nName: "+name+" Age: "+age;		
	}


}
