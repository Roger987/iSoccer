
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
		String result = "\nEndereço: " + endereco +
				"\nNúmero de dormitórios: " + numDormitorios;
		
		if(disponibilidade) {
			result += "\nRecurso disponível\n";
		}
		else {
			result += "\nRecurso indisponível\n";
		}
		
		return result;
	}

}
