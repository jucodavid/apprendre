
public class LE4ternaire {

	public static void main(String[] args) {
		int x = 10, y = 60;
		int max = (x < y) ? ((y < 50) ? y * x + 2 : y + 5 ) : x / y + 5 ;
		System.out.println(max);
	}

}
