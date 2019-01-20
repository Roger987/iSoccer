
public class Advogado extends Funcionarios {

	public Advogado(String nome, String email, String cpf, String telefone, double salario) {
		super(nome, email, cpf, telefone, salario);
		// TODO Auto-generated constructor stub
	}
	
	public String toString() {
		String result = super.toString();
		result += "\nFunção: Advogado";
		return result;
	}

}
