package conversorMonedas;

import javax.swing.JOptionPane;

public class function {
	ConvertirMonedas monedas = new ConvertirMonedas();
	ConvertirMonedasAPesos pesos = new ConvertirMonedasAPesos();
	
	public void ConvertirMonedas(double Minput) {
		String opcion = (JOptionPane.showInputDialog(null, 
				"Elije la moneda a la que deseas convertir tu dinero", "Monedas",
				JOptionPane.PLAIN_MESSAGE, null, new Object[]
						{"De Pesos a Dolar", "De Pesos a Euro", "De Pesos a Libra",
						"De Pesos a Yen", "De Pesos a Won Coreano", "De Dolar a Pesos",
						"De Euro a Pesos", "De Libras a Pesos", "De Yen a Pesos",
						"De Won Coreano a Pesos"},"Seleccion")).toString();
		switch(opcion) {
		case "De Pesos a Dolar":
			monedas.ConvertirPesosADolares(Minput);
			break;
		case "De Pesos a Euro":
			monedas.ConvertirPesosAEuros(Minput);
			break;
		case "De Pesos a Libra":
			monedas.ConvertirPesosALibras(Minput);
			break;
		case "De Pesos a Yen":
			monedas.ConvertirPesosAYen(Minput);
			break;
		case "De Pesos a Won Coreano":
			monedas.ConvertirPesosAWon(Minput);
			break;
		case "De Dolar a Pesos":
			pesos.ConvertirDolaresApesos(Minput);
			break;
		case "De Euro a Pesos":
			pesos.ConvertirEurosAPesos(Minput);
			break;
		case "De Libras a Pesos":
			pesos.ConvertirLibrasAPesos(Minput);
			break;
		case "De Yen a Pesos":
			pesos.ConvertirYenAPesos(Minput);
			break;
		case "De Won Coreano a Pesos":
			pesos.ConvertirWonAPesos(Minput);
			break;
		}
	}
}