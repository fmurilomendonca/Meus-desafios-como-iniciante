//Minha primeira tabuada
//Autor: Murilo
//04/03/2026


package exercicio;

public class tabuada_v1 {
	
	public static void main(String[] args) {
		int x = 1;
		int y = 0;
		int contador = 0;
		System.out.println("Tabuada de somar (" +x +")");
		System.out.println("==========================");
		
		while (contador < 10) {
			System.out.println(x + " + "  + y + " = " + (x+y));
			contador = contador +1;
			y = y + 1;
		}
	}

}
