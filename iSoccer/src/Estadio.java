
public class Estadio {

	private String nomeEstadio;
	private String endereco;
	private boolean disponibilidade;
	private int numBanheiros;
	private int numTorcedores;
	private int numLanchonetes;
	
	public Estadio(String nomeEstadio, String endereco, int numTorcedores, int numBanheiros, int numLanchonetes, boolean disponibilidade) {
		this.nomeEstadio = nomeEstadio;
		this.endereco = endereco;
		this.numTorcedores =  numTorcedores;
		this.numBanheiros = numBanheiros;
		this.numLanchonetes = numLanchonetes;
		this.disponibilidade = disponibilidade;
	}
	
	public String getNome() {
		return nomeEstadio;
	}
	
	public String toString() {
		String result = "\nNome do estádio" + nomeEstadio +
				"\nEndereço: " + endereco +
				"\nQuantidade suportada de torcedores: " + numTorcedores +
				"\nNúmero de banheiros no estádio: " + numBanheiros +
				"\nNúmero de lanchonetes no estádio: " + numLanchonetes;
		
		if(disponibilidade) {
			result += "\nRecurso disponível\n";
		}
		else {
			result += "\nRecurso indisponível\n";
		}
		
		return result;
	}

}
