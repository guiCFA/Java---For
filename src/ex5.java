import java.util.Scanner;

public class ex5 {
	public static void main(String [] args) {
		Scanner teclado = new Scanner(System.in);
		
		String cesta = " ",fruta;
		
		for(int contador = 0 ; contador < 10 ; contador++){			
			System.out.println("escolha uma fruta");
			fruta = teclado.nextLine();
			cesta = cesta +" "+ fruta;
		}
		
		System.out.println("seus produtos são:" + cesta);
	}
}
