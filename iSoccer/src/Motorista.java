
public class Motorista extends Funcionarios {

	private String habilitacao;
	
	public Motorista(String nome, String email, String cpf, String telefone, double salario, String habilitacao) {
		super(nome, email, cpf, telefone, salario);
		this.habilitacao = habilitacao;
	}
	
	public String getHabilitacao() {
		return habilitacao;
	}
	
	public String toString() {
		String result = super.toString();
		result += "\nFun��o: Motorista"
				+ "\nN�mero de habilita��o: " + habilitacao;
		return result;
	}

}
