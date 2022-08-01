package cinema;

import javax.swing.JOptionPane;

public class Bilheteria {

	public static void main(String[] args) {
	
		double preco;
		int op;
		
		preco = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor padrão do ingresso: "));

		for(;;) {
			op = Integer.parseInt(JOptionPane.showInputDialog("Qual ingresso deseja? \n"
					+ "1 - Normal \n"
					+ "2 - VIP \n"
					+ "3 - Camarote Inferior \n"
					+ "4 - Camarote Superior \n"
					+ "5 - Finalizar"));
			
			if (op == 1) {
				
				Normal normal = new Normal(preco);
				normal.Imprime();
				
			} else if (op == 2) {
				
				VIP vip = new VIP(preco);
				vip.Imprime();
				
			} else if (op == 3) {
				
				CamaroteInferior ci = new CamaroteInferior(preco);
				ci.Imprime();
				
			} else if (op == 4) {
				
				CamaroteSupeior cs = new CamaroteSupeior(preco);
				cs.Imprime();
				
			} else if (op == 5) {
				
				JOptionPane.showMessageDialog(null, "Finalizando...");
				break;
				
			} else {
				
				JOptionPane.showMessageDialog(null, "Opção Invalida");
				
			}
				
		}		
		
	}

}
