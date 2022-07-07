package tarefinhaAnderson;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class InterData {

	private LocalDate dataConvertida;
	
	private LocalDate periodo;
	
	private int qtddias;
	
	public LocalDate getDataConvertida() {
		return dataConvertida;
	}

	public void setDataConvertida(LocalDate dataConvertida) {
		this.dataConvertida = dataConvertida;
	}
	
	public LocalDate getPeriodo() {
		return periodo;
	}

	public void setPeriodo(LocalDate periodo) {
		this.periodo = periodo;
	}

	public int getQtddias() {
		return qtddias;
	}

	public void setQtddias(int qtddias) {
		this.qtddias = qtddias;
	}

	public void converterData(String dta) throws ParseException {		

		  DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		  dataConvertida = LocalDate.parse(dta, formatter);
	}
	
	public void verificarIntercessao(LocalDate dtaIni1, LocalDate dtaFim1, LocalDate dtaIni2, LocalDate dtaFim2, LocalDate dtaIni3, LocalDate dtaFim3) {
		if(dtaIni2.isBefore(dtaFim1) || dtaIni3.isBefore(dtaFim2)) {
			System.out.println("Existe intercess�o de per�odos");
			informarPeriodos(dtaIni1, dtaFim1, dtaIni2, dtaFim2, dtaIni3, dtaFim3);
	}	else {
		System.out.println("N�o existe interecess�o de per�odos");
	}
	}
	
	public void informarPeriodos(LocalDate dtaIni1, LocalDate dtaFim1, LocalDate dtaIni2, LocalDate dtaFim2, LocalDate dtaIni3, LocalDate dtaFim3) {
		if(dtaIni2.isBefore(dtaFim1)){
			System.out.println("Per�odo de " + dtaIni2 + " � " + dtaFim1);
			qtddias = dtaFim1.getDayOfMonth() - dtaIni2.getDayOfMonth();
			System.out.println("Quantidade de dias s�o " + qtddias);
		}
		if(dtaIni3.isBefore(dtaFim2)) {
			System.out.println("Per�odo de " + dtaIni3 + " � " + dtaFim2);
			qtddias = dtaFim2.getDayOfMonth() - dtaIni3.getDayOfMonth();
			System.out.println("Quantidade de dias s�o " + qtddias);
	}
	}
	
}
