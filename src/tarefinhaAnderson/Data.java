package tarefinhaAnderson;

import java.text.ParseException;
import java.time.LocalDate;
import java.util.Scanner;

public class Data {

	public static void main(String[] args) throws ParseException {
		
		String dta;
		
		LocalDate dtaIni1, dtaFim1, dtaIni2, dtaFim2, dtaIni3, dtaFim3;
		
		InterData inter = new InterData();
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o 1º período:");
		System.out.println("Digite o início");
		dta = entrada.next();
		inter.converterData(dta);
		dtaIni1 = inter.getDataConvertida();
		System.out.println("Digite o fim");
		dta = entrada.next();
		inter.converterData(dta);
		dtaFim1 = inter.getDataConvertida();
		
		System.out.println("Informe o 2º período:");
		System.out.println("Digite o início");
		dta = entrada.next();
		inter.converterData(dta);
		dtaIni2 = inter.getDataConvertida();
		System.out.println("Digite o fim");
		dta = entrada.next();
		inter.converterData(dta);
		dtaFim2 = inter.getDataConvertida();
		
		System.out.println("Informe o 3º período:");
		System.out.println("Digite o início");
		dta = entrada.next();
		inter.converterData(dta);
		dtaIni3 = inter.getDataConvertida();
		System.out.println("Digite o fim");
		dta = entrada.next();
		inter.converterData(dta);
		dtaFim3 = inter.getDataConvertida();
		
		//Método para verificar intercessão
		
		inter.verificarIntercessao(dtaIni1, dtaFim1, dtaIni2, dtaFim2, dtaIni3, dtaFim3);

	}

}
