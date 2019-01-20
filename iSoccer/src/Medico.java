
public class Medico extends Funcionarios {

	private String crm;
	
	public Medico(String nome, String email, String cpf, String telefone, double salario, String crm) {
		super(nome, email, cpf, telefone, salario);
		this.crm = crm;
	}
	
	public String getCrm() {
		return crm;
	}
	
	public String toString() {
		String result = super.toString();
		result += "\nFunção: Médico"
				+ "\nCRM: " + crm;
		return result;
	}

}
