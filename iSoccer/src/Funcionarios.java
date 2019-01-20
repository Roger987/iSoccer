
public abstract class Funcionarios {

	protected String nome;
	protected String email;
	protected String cpf;
	protected String telefone;
	protected double salario;
	
	public Funcionarios(String nome, String email, String cpf, String telefone, double salario) {
		this.nome = nome;
		this.email = email;
		this.cpf = cpf;
		this.telefone = telefone;
		this.salario = salario;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public String toString() {
		String result = "\nNome: " + nome +
				"\nEmail: " + email +
				"\nCPF: " + cpf +
				"\nTelefone: " + telefone +
				"\nSalário: " + salario;
		return result;
	}

}
