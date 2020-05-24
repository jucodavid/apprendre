import java.util.Scanner;

public class LE4etdemi {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nbre1 = sc.nextInt();
		if(nbre1 < 100 || nbre1 > 100)
			System.out.println("T'es dans le bon FDP.");
		else
			System.out.println("Tu t'es foutu de moi.");
	}

}
