package ProjetoJava;
import java.util.*;

class Somar_Dois_Numeros {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String args[]) {
		int num1 = 0, num2 = 0, soma = 0;
	
		System.out.println("Digite o primeiro número:");
		num1 = sc.nextInt();
		System.out.println("Digite o segundo número:");
		num2 = sc.nextInt();
		
		//Somar
		soma = num1 + num2;
		
		System.out.println("A soma do número eh: " + soma);
	
	}
}
