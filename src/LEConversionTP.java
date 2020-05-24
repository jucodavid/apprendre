import java.util.Scanner;

public class LEConversionTP {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		byte choix;
		double celsius, fahrenheit, arrondSolu;
		String str;
		char re = ' ';
		System.out.println("CONVERTISSEUR DEGR�S CELSIUS - FAHRENHEIT");
		System.out.println("-----------------------------------------");
		do {
			do {
				System.out.println("Choix du mode de conversion");
				System.out.println("1 - Convertir de Celsius � Fahrenheit");
				System.out.println("2 - Convertir de Fahrenheit � Celsius");
				choix = sc.nextByte();
			}while (choix != 1 && choix != 2 );
			if(choix == 1)
			{
				System.out.println("Temp�rature en Celsius � convertir :");
				celsius = sc.nextDouble();
				fahrenheit = (celsius * 9/5) + 32;
				arrondSolu = arrondi(fahrenheit, 2);
				System.out.println(celsius + " �C correspond � " + arrondSolu + " �F.");
				sc.nextLine();
				do {
					System.out.println("Tu veux tu recommencer ? (O/N)");
					str = sc.nextLine();
					re = str.charAt(0);
				}while(re != 'O' && re != 'N');
			}
			else
			{
				System.out.println("Temp�rature en Fahrenheit � convertir :");
				fahrenheit = sc.nextDouble();
				celsius = ((fahrenheit - 32) * 5) / 9;
				arrondSolu = arrondi(celsius, 2);
				System.out.println(fahrenheit + " �F correspond � " + arrondSolu + " �C.");
				sc.nextLine();
				do {
					System.out.println("Tu veux tu recommencer ? (O/N)");
					str = sc.nextLine();
					re = str.charAt(0);
				}while(re != 'O' && re != 'N');
			}
		}while (re == 'O');
		System.out.println("Bye Bye");
	}
	public static double arrondi(double A, int B) {
		  return (double) ( (int) (A * Math.pow(10, B) + .5)) / Math.pow(10, B);
		}
}
