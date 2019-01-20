public class Presidente extends Funcionarios {

	public Presidente(String nome, String email, String cpf, String telefone, double salario) {
		super(nome, email, cpf, telefone, salario);
	}
	
	public String toString() {
		String result = super.toString();
		result += "\nFunção: Presidente";
		return result;
	}

}
