
public class Cozinheiro extends Funcionarios {

	public Cozinheiro(String nome, String email, String cpf, String telefone, double salario) {
		super(nome, email, cpf, telefone, salario);
		// TODO Auto-generated constructor stub
	}
	
	public String toString() {
		String result = super.toString();
		result += "\nFunção: Cozinheiro";
		return result;
	}

}
