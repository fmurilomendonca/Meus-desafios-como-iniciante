//Minha segunda tabuada
//Autor: Murilo
//05/03/2026

package exercicio;
import java.util.Scanner;

public class tabuada_v2 {
	
	public static void main(String[] args) {
		int x = 1;
		int y = 0;
		int contador = 0;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um número para gerar a tabuada: ");
		x = entrada.nextInt();
		
		System.out.println("Tabuada de somar (" +x +")");
		System.out.println("==========================");
		
		while (contador < 10) {
			System.out.println(x + " + "  + y + " = " + (x+y));
			contador = contador +1;
			y = y + 1;
		}
	}

}


