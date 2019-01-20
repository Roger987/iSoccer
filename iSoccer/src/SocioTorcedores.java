
public class SocioTorcedores {

	protected String nome;
	protected String email;
	protected String cpf;
	protected String endereco;
	protected String telefone;
	protected String tipo;
	protected float contribuicao;
	protected boolean estadoPagamento = false;
	
	public SocioTorcedores(String nome, String email, String cpf, String telefone, String endereco, String tipo, float contribuicao) {
		this.nome = nome;
		this.email = email;
		this.cpf = cpf;
		this.telefone = telefone;
		this.endereco = endereco;
		this.tipo = tipo;
		this.contribuicao = contribuicao;
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
	
	public String getEndereco() {
		return endereco;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public float getContribuicao() {
		return contribuicao;
	}
	
	public void setEstadoPagamento(boolean estado) {
		this.estadoPagamento = estado;
	}
	
	public boolean getEstadoPagamento() {
		return estadoPagamento;
	}
	
	public String toString() {
		String result = "\nNome: " + nome +
				"\nCPF: " + cpf +
				"\nEmail: " + email +
				"\nTelefone: " + telefone +
				"\nEndereço: " + endereco +
				"\nTipo: " + tipo +
				"\nContribuição: R$" + contribuicao;
		return result;
	}

}
