import java.util.Scanner;

public class ex4 {
	public static void main(String [] args) {
		Scanner teclado = new Scanner(System.in);
		
		int idade;
		double altura,totalAltura = 0, mediaAltura = 0, maisVelho = 0;
		
		for(int contador = 0 ; contador <= 3 ; contador++ ) {
			
			System.out.println("Digite os dados da " + (contador + 1) + "° pessoa");
			
			System.out.println("Digite sua idade: ");
			idade = teclado.nextInt();
			
			System.out.println("Digite sua altura ");
			altura = teclado.nextDouble();
			
			if(idade >= 50) {
				maisVelho++;
				totalAltura = totalAltura + altura;
				System.out.println("Tu é velho hein");
			}
			
		}
		
		mediaAltura = totalAltura / maisVelho;
		System.out.println("A media da altura das pessoas com mais de 50 anos é " + mediaAltura);
		
	}
}
