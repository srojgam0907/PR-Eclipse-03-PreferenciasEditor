package practica_5;
import java.util.Scanner;

public class ejemplo {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		int x; 

		System.out.println("Introduce un numero positivo menor que 10");
		x = keyboard.nextInt();

		if (x >= 0 && x < 10) {
			System.out.println(x + " es menor que 10");

		} else {
			System.out.println("ERROR. El numero tiene que ser positivo y menor que 10");
			
		}
	}
}
