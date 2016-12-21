import java.util.ArrayList;

public class StringList {

	private static ArrayList<String> list = new ArrayList<String>();
	
	public StringList() {
		// constructor not needed
	}
	
	public static void addItem(String item) {
		list.add(item);
	}
	
	public static void removeItem(String item) {
		list.remove(item);
	}
	
	public static void viewList() {
		System.out.println("\n---------------------------");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("---------------------------\n");
	}
}
