package model;

//test change 4:56pm
public class Donkey {
	private String name;
	private String color;
	private int age;

	public Donkey() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Donkey(String name, String color, int age) {
		super();
		this.name = name;
		this.color = color;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String speak() {
		return "Hee-Haw!";
	}
	public String display() {
		return name + " the donkey says "+speak();
	}
}