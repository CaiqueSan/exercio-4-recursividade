package ex4;

import javax.swing.JOptionPane;

public class Ex4 {
	
	public static void main(String args[]) {
		int a = 0, b = -1;
		while (a < 10 || a > 999999) {
			a = Integer.parseInt((JOptionPane.showInputDialog("Digite um numero de 10 a 999999")));
		}
		while (b < 0 || b > 9) {
			b = Integer.parseInt((JOptionPane.showInputDialog("Digite um numero de 0 a 9")));
		}
		System.out.println( "O numero " + b + " aparece " +Ex4(a,b) " vezes no número " + a);
	}
	
	public static int Ex4(int a, int b) {
		//condição de parada: quando o valor 'a' chega a 0 não é mais possível realizar a divisão, a função retorna 0
		if (a == 0)
			return 0;
		int m = a%10;
		a = a/10;
		// se o resto da divisão por 10 for igual ao valor 'b', a função retorna 1 e chama a si mesma passando 'a' e 'b' como parametros, o 'a' enviado
		// é o resultado da divisão do 'a' inicial por 10. Se o resto da divisão não for igual a 'b', a função retorna 0 e os mesmos parametros.
		// A função também soma os valores retornados.
		if(m == b)
			return 1 + Ex4(a,b);
		else
			return 0 + Ex4(a,b);
	}
}
