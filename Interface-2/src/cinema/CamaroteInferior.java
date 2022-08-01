package cinema;

import javax.swing.JOptionPane;

public class CamaroteInferior extends VIP{
	
	public CamaroteInferior() {
		
	}

	public CamaroteInferior(double valor) {
		super(valor);
	}
	
	public double valorCI() {
		return getValor() * 1.4;
	}
	
	public void Imprime() {
		JOptionPane.showMessageDialog(null, "Ingresso no camarote inferior: \n"
				+ "Valor: R$ " + valorCI());
	}
	
}
