
public class LE7 {

	public static void main(String[] args) {
		String[] tab = {"Maman","Papa","Mamy","Papy","J'arr�te ?"};
		curseur(tab);
		System.out.println(toString(tab));
 	}
	
	static void curseur(String[] tabBis) {
		for (String str : tabBis)
			System.out.println(str);
	}
	
	static String toString(String[] tabBISBIS) {
		System.out.println("--------------------\nM�thode toString() !\n--------------------");
		String retour = "";
		for(String str : tabBISBIS)
			retour += str + "\n";
		return retour;
	}
}
