//Declare uma variável do tipo double valorEmDolares. 
//Atribua um valor em dólares a essa variável. 
//Considere que o valor de 1 dólar é equivalente a 4.94 reais. 
//Realize a conversão do valor em dólares para reais e imprima o resultado formatado.


package modulo02;

public class desafio05 {
	static public void main(String[] args) {
	double valorEmDolares = 8.45;
	double cambio = valorEmDolares * 4.94;
	System.out.println(String.format(" %.2f dólares equivale a %.2f reais", valorEmDolares, cambio)) ;
		
		
	}

}
