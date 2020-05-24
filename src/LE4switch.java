import java.util.Scanner;

public class LE4switch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String note = sc.nextLine();
		switch (note)
		{
		case "0":
			System.out.println("Pas ouf");
		break;
		case "10":
			System.out.println("Bof");
		break;
		case "20":
			System.out.println("Bo Gosse");
		break;
		default:
			System.out.println("Je suis confus");
		}
	}

}
