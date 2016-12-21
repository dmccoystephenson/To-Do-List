import java.util.Scanner;
public class Driver {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		StringList list = new StringList();
		
		while (true) {
			System.out.println("\nWhat would you like to do?");
			System.out.println("[1] Add something to your TODO list.");
			System.out.println("[2] Remove something from your TODO list.");
			System.out.println("[3] Print your TODO list.\n");

			String input = scanner.nextLine();
			
			switch(input) {
				case "1":
					System.out.println("What would you like to add?");
					list.addItem(scanner.nextLine());
					break;
				case "2":
					System.out.println("What would you like to remove?");
					list.removeItem(scanner.nextLine());
					break;
				case "3":
					list.viewList();
					break;
				default:
					System.out.println("That wasn't an option!");
			}	
		}
	}

}
