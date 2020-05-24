
public class LE7surcharge {

	public static void main(String[] args) {
		String[] tabStr = {"Maman","Papa","Mamy","Papy","J'arrête ?"};
		int [] tabInt = {1, 2, 3, 4, 5};
		String[][] tabBiString = {{"9","8","7","6","5"},{"Mon","Ton","Son","Ma","Ta","Sa"}};
		
		curseur(tabStr);
		curseur(tabInt);
		curseur(tabBiString);
		System.out.println("----------");
	}
	
	static void curseur(String[] tab) {
		System.out.println("----------");
		for(String str : tab)
			System.out.print(str+ " ");
		System.out.println("");
	}
	
	static void curseur(int[] tab) {
		System.out.println("----------");
		for(int str : tab)
			System.out.print(str+ " ");
		System.out.println("");
	}
	
	static void curseur(String[][] tab) {
		System.out.println("----------");
		for(String tab2[] : tab) {
			for(String str : tab2)
				System.out.print(str+ " ");
				System.out.println("");
		}
	}
	
}
