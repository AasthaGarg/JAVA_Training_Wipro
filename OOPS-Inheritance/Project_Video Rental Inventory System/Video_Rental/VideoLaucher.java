package Video_Rental;
import java.util.Scanner;
public class VideoLaucher {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		VideoStore videostore=new VideoStore();
		int choice;
		do {
			System.out.println("MAIN MENU");
			System.out.println("============");
			System.out.println("1. Add Videos:");
			System.out.println("2. Check Out Video :");
			System.out.println("3. Return Video :");
			System.out.println("4. Receive Rating :");
			System.out.println("5. List Inventory :");
			System.out.println("6. Exit :");
			System.out.println("Enter your choice (1..6) :");
			choice=s.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter the name of the video you want to add:");
				videostore.addVideo(s.next());
				break;
			case 2:
				System.out.println("Enter the name of the video you want to check out:");
				videostore.doCheckout(s.next());
				break;
			case 3:
				System.out.println("Enter the name of the video you want to Return:");
				videostore.doReturn(s.next());
				break;
			case 4:
				System.out.println("Enter the name of the video you want to Rate:");
				String name=s.next();
				System.out.println("Enter the rating for this video:");
				int rate=s.nextInt();
				videostore.receiveRating(name, rate);
				break;
			case 5:
				videostore.listInventory();
				break;
			case 6:
				System.out.println("Exiting...!! Thanks for using the application.");
				System.exit(1);
				break;
			}
		}while(!(choice==6));
		s.close();
	}

}
