/* Create an abstract class Compartment to represent a rail coach. Provide an abstract function notice in this class. 
public abstract String notice();Derive FirstClass, Ladies, General, Luggage classes from the compartment class. 
Override the notice function in each of them to print notice message that is suitable to the specific type of  compartment.*/

package train;
import java.util.Random;
public class TestCompartment {
	public static void main(String args[]) {
		Compartment obj[]=new Compartment[10];
		Random rand=new Random();
		for(int i=0;i<10;i++) {
			int randomNum=rand.nextInt((4-1)+1)+1;
			if(randomNum==1) {
				obj[i]=new FirstClass();
			}
			else if(randomNum==2) {
				obj[i]=new Ladies();
			}
			else if(randomNum==3) {
				obj[i]=new General();
			}
			else if(randomNum==4) {
				obj[i]=new Luggage();
			}
			System.out.println("Notice: You are in "+obj[i].notice());
		}
	}
}
