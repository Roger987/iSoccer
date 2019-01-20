
public class Jogador extends Funcionarios {

	private String tipo;
	private boolean aptidao;
	
	public Jogador(String nome, String email, String cpf, String telefone, double salario, String tipo, boolean aptidao) {
		super(nome, email, cpf, telefone, salario);
		this.tipo = tipo;
		this.aptidao = aptidao;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public boolean getAptidao() {
		return aptidao;
	}
	
	public String toString() {
		String result = super.toString();
		result += "\nTipo: " + tipo;
		if(aptidao) {
			result += "\nApto para jogar";
		}
		else {
			result+= "\nInapto para jogar";
		}
		return result;
	}

}
