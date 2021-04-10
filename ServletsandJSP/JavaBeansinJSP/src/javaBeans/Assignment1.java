package javaBeans;

import java.util.Random;

public class Assignment1 {
	private String name;
	private int id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getSalary(){
		return 20000+10000*new Random(50000).nextDouble();
	}

}
