
public class Onibus {

	private boolean disponibilidade;
	private String placa;
	
	
	public Onibus(String placa, boolean disponibilidade) {
		this.disponibilidade = disponibilidade;
		this.placa = placa;
	}
	
	public String getPlaca() {
		return placa;
	}
	
	public String toString() {
		String result = "\nPlaca do veículo: " + placa;
		
		if(disponibilidade) {
			result += "\nRecurso disponível\n";
		}
		else {
			result += "\nRecurso indisponível\n";
		}
		
		return result;
	}

}
