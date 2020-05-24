import java.util.Scanner;

public class LE3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("un nombre Connasse ?");
		int i = sc.nextInt();
		System.out.println("des lettres ?");
		sc.nextLine(); // Videur de ligne
		String str = sc.nextLine();
		System.out.println("des chiffres " + i + ", et des lettres " + str);		
	}

}
