import java.util.Scanner;

public class desafio {
	public static void main(String [] args) {
		Scanner teclado = new Scanner(System.in);
		
		int presidente1 = 0, presidente2 = 0, presidente3 = 0, presidente4 =0;
		int nulo = 0, branco = 0, contador = 0,voto;
		char resposta;
		
		System.out.println("Deseja votar? s/n");
		resposta = teclado.nextLine().charAt(0);
		
		while(resposta == 's') {		
			System.out.println("Em quem vc deseja votar?");
			voto = teclado.nextInt();
			
			switch(voto){
			case 1: 
				System.out.println("Voce votou em Presidente 1");
				presidente1++;
				break;
			case 2:
				System.out.println("Voce votou em Presidente 2");
				presidente2++;
				break;
			case 3:
				System.out.println("Voce votou em Presidente 3");
				presidente3++;
				break;
			case 4:
				System.out.println("Voce votou em Presidente 4");
				presidente4++;
				break;
			case 5:
				System.out.println("Voce votou NULO");
				nulo++;
				break;
			case 6:
				System.out.println("Voce votou em Branco");
				branco++;
				break;
			default:
				System.out.println("Voto invalido!!!");
			}
			
			System.out.println("===============================================");
			System.out.println("votos presidente 1: " +presidente1);
			System.out.println("votos presidente 2: " +presidente2);
			System.out.println("votos presidente 3: " +presidente3);
			System.out.println("votos presidente 4: " +presidente4);
			System.out.println("votos em BRANCO: "+ branco);
			System.out.println("votos NULOS: "+ nulo);
			

			
	}
	
		System.out.println("obrigado poir ter votadoi");
	}
}
