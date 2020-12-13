import java.util.Scanner;

public class ex3 {
	public static void main(String [] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("digite um numero");
		int numero = teclado.nextInt();
		
		for(int contador = 0 ; contador <= numero ; contador++) {
			System.out.println(contador);
		}
	}
}
