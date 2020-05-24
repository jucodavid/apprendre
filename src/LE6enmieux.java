import java.util.Scanner;

public class LE6enmieux {

	public static void main(String[] args) {
		char tableau[] = {'a','b','c','d','e','f','g'};
		int i = 0;
		char reponse = ' ', carac = ' ';
		Scanner sc = new Scanner(System.in);
		
		do {
			do {
				i = 0;
				System.out.println("Donne moi une lettre en minuscule");
				carac = sc.nextLine().charAt(0);
				
				while(i < tableau.length && carac != tableau[i])
					i++;
				
				if(i < tableau.length)
					System.out.println("Ta lettre " +carac+ " est bien dans le tableau à la position " +i+ ".");
				else
					System.out.println("Ta lettre " +carac+ " ne se trouve pas dans le tableau. Essaye de Nouveau ( ; .");
			}while(i >= tableau.length);
			do {
				System.out.println("Tu veux tu recomencer ?");
				
				reponse = sc.nextLine().charAt(0);
			}while(reponse != 'N' && reponse != 'O');
		}while (reponse == 'O');
		System.out.println("Ok casse toi FDP !");
	}

}
