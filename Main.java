package Condicionales;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		int numero1,numero2;
		
		numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite el primer numero"));
		numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo munero"));
		
		if ((numero1%2 == 0) && (numero2%2 == 0)) {
			JOptionPane.showMessageDialog(null, "Ambos numeros son pares");
		}
		
		else if ((numero1%2 != 0) && (numero2%2 !=0)) {
			JOptionPane.showMessageDialog(null, "Ambos numeros son impares");
		}
	}
}
