import java.util.Scanner;

public class LE5dowhile {

	public static void main(String[] args) {
		String prenom=new String();
		char reponse=' ';
		Scanner sc=new Scanner(System.in);
		do{
			System.out.println("Ta mère c'est ?");
			prenom=sc.nextLine();
			System.out.println("Ba tu vois " +prenom+ ", je l'ai baisée.");
			do {
				System.out.println("Une autre ? (O/N)");
				reponse=sc.nextLine().charAt(0);
			}while(reponse!='O'&&reponse!='N');
		}while(reponse == 'O');
		System.out.print("De tout façon je les baise toutes");
	}

}
