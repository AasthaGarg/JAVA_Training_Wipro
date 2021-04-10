
import java.util.Scanner;
class Fruit{
	String name;
	String taste;
	String size;
	private Scanner s;
	public void eat() {
		System.out.println("Enter the name of the fruit");
		s = new Scanner(System.in);
		name=s.nextLine();
		System.out.println("Enter the taste of the fruit");
		taste=s.nextLine();
	}
}
class Apple extends Fruit{
	public void eat() {
		System.out.println("Name of the fruit is Apple");
		System.out.println("Taste of the fruit is sweet");
	}
}
class Orange extends Fruit{
	public void eat() {
		System.out.println("Name of the fruit is Orange");
		System.out.println("Taste of the fruit is sour");
	}
}
public class Main_fruits {
	public static void main(String args[]) {
		Fruit f=new Fruit();
		f.eat();
		Apple a=new Apple();
		a.eat();
		Orange o=new Orange();
		o.eat();
	}

}
