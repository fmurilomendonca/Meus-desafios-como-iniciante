package modulo03;
import java.util.Scanner;

//par ou ímpar
public class DesafioHoraDaPratica05 {
	public static void main (String[] args) {
	int num;
	
	Scanner entrada = new Scanner(System.in);
	System.out.println("Digite um número");
	num = entrada.nextInt();
	
	if (num % 2 == 0) {
		System.out.println(String.format("O número %d que você digitou é par. ", num));
	} else {
		System.out.println(String.format("O número %d que você digitou é ímpar. ", num));
	}
	}
}
