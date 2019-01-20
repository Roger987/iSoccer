
public class CentroTreinamento {

	private String endereco;
	private int numDormitorios;
	private boolean disponibilidade;
	
	public CentroTreinamento(String endereco, int numDormitorios, boolean disponibilidade) {
		this.endereco = endereco;
		this.numDormitorios = numDormitorios;
		this.disponibilidade = disponibilidade;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public String toString() {
		String result = "\nEndere�o: " + endereco +
				"\nN�mero de dormit�rios: " + numDormitorios;
		
		if(disponibilidade) {
			result += "\nRecurso dispon�vel\n";
		}
		else {
			result += "\nRecurso indispon�vel\n";
		}
		
		return result;
	}

}
