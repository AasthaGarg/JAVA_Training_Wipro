class Animal{
	public void eat() {
		System.out.println("Animals eat");
	}
	public void sleep() {
		System.out.println("Animals sleep");
	}
}
public class Bird extends Animal {
	public void eat() {
		System.out.println("Birds eat");
	}
	public void sleep() {
		System.out.println("Birds sleep");
	}
	public void fly() {
		System.out.println("Birds fly");
	}
	public static void main(String args[]) {
		Animal a=new Animal();
		a.eat();
		a.sleep();
		Bird b=new Bird();
		b.eat();
		b.sleep();
		b.fly();
	}

}
