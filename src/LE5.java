import java.util.Scanner;

public class LE5 {

	public static void main(String[] args) {
		String prenom;
		char reponse='O';
		Scanner sc=new Scanner(System.in);
		while(reponse=='O')
		{
			System.out.println("Ta m�re c'est ?");
			prenom=sc.nextLine();
			System.out.println("Ba tu vois " +prenom+ ", je l'ai bais�e.");
			reponse=' ';
			while(reponse!='O'&&reponse!='N')
			{	
				System.out.println("Une autre ? (O/N)");
				reponse=sc.nextLine().charAt(0);
			}
		}
		System.out.print("De tout fa�on je les baise toutes");
	}

}
