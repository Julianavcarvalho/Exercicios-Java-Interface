package cinema;

import javax.swing.JOptionPane;

public class CamaroteSupeior extends VIP{
	
	public CamaroteSupeior() {
		
	}

	public CamaroteSupeior(double valor) {
		super(valor);
	}
	
	public double valorCS() {
		return getValor() * 1.6;
	}
	
	public void Imprime() {
		JOptionPane.showMessageDialog(null, "Ingresso no camarote superior: \n"
				+ "Valor: R$ "+ valorCS());
	}

}
