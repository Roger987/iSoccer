
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
		String result = "\nNome do est�dio" + nomeEstadio +
				"\nEndere�o: " + endereco +
				"\nQuantidade suportada de torcedores: " + numTorcedores +
				"\nN�mero de banheiros no est�dio: " + numBanheiros +
				"\nN�mero de lanchonetes no est�dio: " + numLanchonetes;
		
		if(disponibilidade) {
			result += "\nRecurso dispon�vel\n";
		}
		else {
			result += "\nRecurso indispon�vel\n";
		}
		
		return result;
	}

}
