package ex4;

import javax.swing.JOptionPane;

public class Ex4 {
	
	public static void main(String args[]) {
		int a = 0, b = -1;
		while (a < 10 || a > 9999) {
			a = Integer.parseInt((JOptionPane.showInputDialog("Digite um numero de 10 a 9999")));
		}
		while (b < 0 || b > 9) {
			b = Integer.parseInt((JOptionPane.showInputDialog("Digite um numero de 10 a 9999")));
		}
		System.out.println(Ex4(a,b));
	}
	
	public static int Ex4(int a, int b) {
		//condi��o de parada: quando o valor a chega a 0 n�o � mais poss�vel realizar a divis�o, a fun��o retorna 0
		if (a == 0)
			return 0;
		int m = a%10;
		a = a/10;
		// se o resto da divis�o por 10 for igual ao valor b, a fun��o retorna 1 e chama a si mesma passando a e b como parametros, o a enviado
		// � o resultado da divis�o do a inicial por 10. Se o resto da divis�o n�o for igual a b, a fun��o retorna 0 e os mesmos parametros.
		// A fun��o tamb�m soma os valores retornados.
		if(m == b)
			return 1 + Ex4(a,b);
		else
			return 0 + Ex4(a,b);
	}
}
