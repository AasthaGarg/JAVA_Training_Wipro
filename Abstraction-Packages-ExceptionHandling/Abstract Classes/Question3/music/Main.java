/*  Create an abstract class Instrument which is having the abstract function play. 
Create three more sub classes from Instrument which is Piano, Flute, Guitar. Override
 the play method inside all three classes printing a message 
“Piano is playing  tan tan tan tan  ”  for Piano class
“Flute is playing  toot toot toot toot”  for Flute class
“Guitar is playing  tin  tin  tin ”  for Guitar class */

package music;
public class Main {
	public static void main(String args[]) {
		Instrument[] obj=new Instrument[10];
		for(int i=0;i<10;i++) {
			if(i==1||i==5||i==9)
				obj[i]=new Piano();
			else if(i==3||i==4||i==7)
				obj[i]=new Flute();
			else
				obj[i]=new Guitar();
			obj[i].play();
			if(obj[i] instanceof Flute)
				System.out.println("InstanceOfFlute");
			else if(obj[i] instanceof Guitar)
				System.out.println("InstanceOfGuitar");
			else 
				System.out.println("InstanceOfPiano");
		}
	}
}
