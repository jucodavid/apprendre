import java.util.Scanner;

public class LE5 {

	public static void main(String[] args) {
		String prenom;
		char reponse='O';
		Scanner sc=new Scanner(System.in);
		while(reponse=='O')
		{
			System.out.println("Ta mère c'est ?");
			prenom=sc.nextLine();
			System.out.println("Ba tu vois " +prenom+ ", je l'ai baisée.");
			reponse=' ';
			while(reponse!='O'&&reponse!='N')
			{	
				System.out.println("Une autre ? (O/N)");
				reponse=sc.nextLine().charAt(0);
			}
		}
		System.out.print("De tout façon je les baise toutes");
	}

}
