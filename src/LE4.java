import java.util.Scanner;

public class LE4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("T'�crit un nombre, je te bute");
		int nbre1 = sc.nextInt();
		if(nbre1 > 0)
			System.out.println(nbre1 + " est un nombre positif.");
		
		else if(nbre1 ==0)
			System.out.println("0, t'es s�rieux FDP.");
		
		else
			System.out.println(nbre1 + " est un nombre n�gatif.");
	}

}
