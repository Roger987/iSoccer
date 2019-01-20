
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
		String result = "\nPlaca do ve�culo: " + placa;
		
		if(disponibilidade) {
			result += "\nRecurso dispon�vel\n";
		}
		else {
			result += "\nRecurso indispon�vel\n";
		}
		
		return result;
	}

}
