import java.util.Scanner;
import java.util.ArrayList;

public class iSoccer {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int input = -1;
		
		System.out.println("Para acessar o sistema, use 'admin' como login e senha.\n\n");
		
		System.out.println("\nLogin:\n");
		
		String login = scanner.nextLine();
		
		System.out.println("\nSenha:\n");
		
		String senha = scanner.nextLine();
		
		if(login.equals("admin") && senha.equals("admin")) {
			
			ArrayList<Funcionarios> funcionarios = new ArrayList<Funcionarios>();
			ArrayList<SocioTorcedores> socioTorcedores = new ArrayList<SocioTorcedores>();
			ArrayList<Onibus> onibusLista = new ArrayList<Onibus>();
			ArrayList<Estadio> estadios = new ArrayList<Estadio>();
			ArrayList<CentroTreinamento> centrosTreinamento = new ArrayList<CentroTreinamento>();
			
			System.out.println("\nBem-vindo ao iSoccer!\n\nInforme a ação desejada:"
					+ "\n1 - Adicionar funcionário"
					+ "\n2 - Adicionar sócio-torcedor"
					+ "\n3 - Alterar estado de pagamento de sócio-torcedor"
					+ "\n4 - Gerenciar recursos físicos"
					+ "\n5 - Solicitar relatório"
					+ "\n6 - Buscar jogadores por aptidão física"
					+ "\n7 - Sair\n");
			
			while(input != 7) {
				
				try {
					
					input = scanner.nextInt();
					scanner.nextLine();
					
					if(input == 7) {
						System.out.println("\nPrograma encerrado\n");
						break;
					}
					
					switch(input) {
					
					case 1:
						
						Funcionarios funcionario;
						
						System.out.println("\nNome completo:\n");
						String nome = scanner.nextLine();
						
						System.out.println("\nEmail:\n");
						String email = scanner.nextLine();

						System.out.println("\nCPF:\n");
						String cpf = scanner.nextLine();

						System.out.println("\nTelefone:\n");
						String telefone = scanner.nextLine();

						System.out.println("\nSalário:\n");
						double salario = scanner.nextDouble();
						
						System.out.println("\nTipo:\n1 - Presidente"
								+ "\n2 - Médico"
								+ "\n3 - Técnico"
								+ "\n4 - Preparador físico"
								+ "\n5 - Motorista"
								+ "\n6 - Cozinheiro"
								+ "\n7 - Advogado"
								+ "\n8 - Jogador\n");
						int tipo = scanner.nextInt();
						scanner.nextLine();
						
						switch(tipo) {
						
						case 1:
							
							funcionario = new Presidente(nome, email, cpf, telefone, salario);
							funcionarios.add(funcionario);
							System.out.println("\nFuncionário adicionado!\n");
							
							break;
							
						case 2:
							
							System.out.println("\nInforme o CRM:\n");
							String crm = scanner.nextLine();
							
							funcionario = new Medico(nome, email, cpf, telefone, salario, crm);
							funcionarios.add(funcionario);
							System.out.println("\nFuncionário adicionado!\n");

							break;
							
						case 3:
							
							funcionario = new Tecnico(nome, email, cpf, telefone, salario);
							funcionarios.add(funcionario);
							System.out.println("\nFuncionário adicionado!\n");

							break;
							
						case 4:
							
							funcionario = new PreparadorFisico(nome, email, cpf, telefone, salario);
							funcionarios.add(funcionario);
							System.out.println("\nFuncionário adicionado!\n");

							break;
							
						case 5:
							
							System.out.println("\nInforme o número da habilitação:\n");
							String habilitacao = scanner.nextLine();
							
							funcionario = new Motorista(nome, email, cpf, telefone, salario, habilitacao);
							funcionarios.add(funcionario);
							System.out.println("\nFuncionário adicionado!\n");

							break;
							
						case 6:
							
							funcionario = new Cozinheiro(nome, email, cpf, telefone, salario);
							funcionarios.add(funcionario);
							System.out.println("\nFuncionário adicionado!\n");

							break;
							
						case 7:
							
							funcionario = new Advogado(nome, email, cpf, telefone, salario);
							funcionarios.add(funcionario);
							System.out.println("\nFuncionário adicionado!\n");

							break;
							
						case 8:
							
							System.out.println("\nInforme o tipo de jogador:\n(Tipos possíveis: Volante, Zagueiro, "
									+ "Meia, Goleiro, Atacante, Lateral esquerdo, Lateral direito)\n");
							String tipoJogador = scanner.nextLine();
							
							System.out.println("\nO jogador se encontra apto para jogar?\n  Digite 's' para sim ou 'n' para não:\n");
							String aptidao = scanner.nextLine();
							
							if(aptidao.equals("s")) {
								funcionario = new Jogador(nome, email, cpf, telefone, salario, tipoJogador, true);
								funcionarios.add(funcionario);
								System.out.println("\nFuncionário adicionado!\n");
							}
							
							else if(aptidao.equals("n")) {
								funcionario = new Jogador(nome, email, cpf, telefone, salario, tipoJogador, false);
								funcionarios.add(funcionario);
								System.out.println("\nFuncionário adicionado!\n");
							}
							
							else {
								System.out.println("\nEntrada inválida!\n");
							}

							break;
							
						default:
							
							System.out.println("\nInválido!\n");
							break;
							
						}
						
						break;
						
					case 2:
						
						System.out.println("\nNome:\n");
						nome = scanner.nextLine();
						
						System.out.println("\nEmail:\n");
						email = scanner.nextLine();

						System.out.println("\nCPF:\n");
						cpf = scanner.nextLine();
						
						System.out.println("\nEndereço:\n");
						String endereco = scanner.nextLine();

						System.out.println("\nTelefone:\n");
						telefone = scanner.nextLine();
						
						System.out.println("\nTipo:\n(Tipos possíveis: Júnior, Sênior ou Elite)\n");
						String tipoSocioTorcedor = scanner.nextLine();
						
						System.out.println("\nContribuição:\n");
						float contribuicao = scanner.nextFloat();
						
						SocioTorcedores sociotorcedor = new SocioTorcedores(nome, email, cpf, endereco, telefone, tipoSocioTorcedor, contribuicao);
						
						socioTorcedores.add(sociotorcedor);
						System.out.println("\nSócio-torcedor adicionado!\n");

						break;
						
					case 3:
						
						System.out.println("\nInforme o nome do sócio-torcedor:\n");
						
						nome = scanner.nextLine();
						boolean flag = false;
						
						int i;
						
						for(i = 0; i < socioTorcedores.size(); i++) {
							
							if(nome.equals(socioTorcedores.get(i).getNome())) {
								
								flag = true;
								
								System.out.println("\nTornar torcedor:\n 1 - Adimplente\n 2 - Inadimplente\n");
								
								int estado = scanner.nextInt();
								scanner.nextLine();
								
								if(estado == 1) {
									socioTorcedores.get(i).setEstadoPagamento(true);
									System.out.println("\nEstado de pagamento alterado com sucesso!\n");

								}
								
								else if(estado == 2) {
									socioTorcedores.get(i).setEstadoPagamento(false);
									System.out.println("\nEstado de pagamento alterado com sucesso!\n");
									
								}
								
							}
							
						}
						
						if(!flag) {
							System.out.println("\nSócio-torcedor não encontrado!\n");
						}
						
						break;
						
					case 4:
						
						System.out.println("\nVocê deseja:\n1 - Adicionar recurso\n2 - Verificar um recurso\n3 - Alterar a disponibilidade de um recurso\n");
						int choice = scanner.nextInt();
						scanner.nextLine();
						
						switch(choice) {
						
						case 1:
							System.out.println("\nAdicionar:\n 1 - Ônibus\n 2 - Estádio\n 3 - Centro de treinamento\n");
							int choiceAdd = scanner.nextInt();
							scanner.nextLine();
							
							switch(choiceAdd) {
							
							case 1:
								
								System.out.println("\nInforme a placa do ônibus:\n");
								String placa = scanner.nextLine();
								
								System.out.println("\nInforme a disponibilidade do ônibus:\n Digite 0 para indisponível ou 1 para disponível\n");
								int disponibilidade = scanner.nextInt();
								scanner.nextLine();
								
								if(disponibilidade == 0) {
									Onibus onibus = new Onibus(placa, false);
									onibusLista.add(onibus);
									System.out.println("\nÔnibus adicionado com sucesso!\n");
								}
								
								else if(disponibilidade == 1) {
									Onibus onibus = new Onibus(placa, true);
									onibusLista.add(onibus);
									System.out.println("\nÔnibus adicionado com sucesso!\n");
								}
								break;
								
							case 2:
								
								System.out.println("\nInforme o nome do estádio:\n");
								String nomeEstadio = scanner.nextLine();
								
								System.out.println("\nInforme o endereço do estádio:\n");
								String enderecoEstadio = scanner.nextLine();
								
								System.out.println("\nInforme o número de torcedores que pode ser suportado pelo estádio:\n");
								int numTorcedores = scanner.nextInt();
								scanner.nextLine();
								
								System.out.println("\nInforme o número de banheiros presentes no estádio:\n");
								int numBanheiros = scanner.nextInt();
								scanner.nextLine();
								
								System.out.println("\nInforme o número de lanchonetes presentes no estádio:\n");
								int numLanchonetes = scanner.nextInt();
								scanner.nextLine();
								
								System.out.println("\nInforme a disponibilidade do estádio:\n Digite 0 para indisponível ou 1 para disponível\n");
								disponibilidade = scanner.nextInt();
								scanner.nextLine();
								
								if(disponibilidade == 0) {	
									Estadio estadio = new Estadio(nomeEstadio, enderecoEstadio, numTorcedores, numBanheiros, numLanchonetes, false);
									estadios.add(estadio);	
									System.out.println("\nEstádio adicionado com sucesso!\n");
								}
								
								else if(disponibilidade == 1) {
									Estadio estadio = new Estadio(nomeEstadio, enderecoEstadio, numTorcedores, numBanheiros, numLanchonetes, true);
									estadios.add(estadio);
									System.out.println("\nEstádio adicionado com sucesso!\n");
								}
								
								break;
	
							case 3:
								
								System.out.println("\nInforme o endereço do centro de treinamento:\n");
								String enderecoCentroTreinamento = scanner.nextLine();
								
								System.out.println("\nInforme o número de dormitórios presentes no centro de treinamento:\n");
								int numDorm = scanner.nextInt();
								scanner.nextLine();
								
								System.out.println("\nInforme a disponibilidade do centro de treinamento:\n Digite 0 para indisponível ou 1 para disponível\n");
								disponibilidade = scanner.nextInt();
								scanner.nextLine();
								
								if(disponibilidade == 0) {	
									CentroTreinamento centrotreinamento = new CentroTreinamento(enderecoCentroTreinamento, numDorm, false);
									centrosTreinamento.add(centrotreinamento);	
									System.out.println("\nCentro de treinamento adicionado com sucesso!\n");
								}
								
								else if(disponibilidade == 1) {
									CentroTreinamento centrotreinamento = new CentroTreinamento(enderecoCentroTreinamento, numDorm, true);
									centrosTreinamento.add(centrotreinamento);
									System.out.println("\nCentro de treinamento adicionado com sucesso!\n");
								}
								
								break;
							
							default:
								System.out.println("\nOperação inválida!\n");
							
							}
							
							break;
							
						case 2:
							
							System.out.println("\nInforme o recurso que deseja verificar:\n 1 - Ônibus\n 2 - Estádio\n 3 - Centro de treinamento\n");
							choice = scanner.nextInt();
							scanner.nextLine();
							
							switch(choice) {
							
							case 1:
								
								flag = false;
								
								System.out.println("\nInforme a placa do ônibus que deseja verificar:\n");
								String placa = scanner.nextLine();
								
								for(i = 0; i < onibusLista.size(); i++) {
									if(onibusLista.get(i).getPlaca().equals(placa)) {
										flag = true;
										System.out.println(onibusLista.get(i).toString());
									}
								}
								
								if(!flag) {
									System.out.println("\nNão encontrado!\n");
								}
								
								break;
								
							case 2:								
								
								flag = false;
								
								System.out.println("\nInforme o nome do estádio que deseja verificar:\n");
								nome = scanner.nextLine();
								
								for(i = 0; i < estadios.size(); i++) {
									if(estadios.get(i).getNome().equals(nome)) {
										flag = true;
										System.out.println(estadios.get(i).toString());
									}
								}
								
								if(!flag) {
									System.out.println("\nNão encontrado!\n");
								}
								
								break;

								
							case 3:
								
								flag = false;
								
								System.out.println("\nInforme o endereço do centro de treinamento que deseja verificar:\n");
								endereco = scanner.nextLine();
								
								for(i = 0; i < centrosTreinamento.size(); i++) {
									if(centrosTreinamento.get(i).getEndereco().equals(endereco)) {
										flag = true;
										System.out.println(centrosTreinamento.get(i).toString());
									}
								}
								
								if(!flag) {
									System.out.println("\nNão encontrado!\n");
								}
								
								break;
							}
							break;
							
						case 3:
							
							flag = false;
							
							System.out.println("\nInforme o nome do sócio-torcedor cujo estado de pagamento você deseja alterar:\n");
							
							nome = scanner.nextLine();
							
							for(i = 0; i < socioTorcedores.size(); i++) {
								if(socioTorcedores.get(i).getNome().equals(nome)) {
									
									flag = true;
									
									System.out.println("\nDigite 0 se o funcionário for inadimplente e 1 se for adimplente:\n");
									int estPag = scanner.nextInt();
									scanner.nextLine();
									
									if(estPag == 0) {
										socioTorcedores.get(i).setEstadoPagamento(false);
										System.out.println("\nEstado de pagamento alterado!\n");

									}
									
									else if(estPag == 1) {
										socioTorcedores.get(i).setEstadoPagamento(true);
										System.out.println("\nEstado de pagamento alterado!\n");
									}
									
								}
							}
							
							if(!flag) {
								System.out.println("\nNão encontrado!\n");
							}
							
							break;
						
						}

						break;
						
					case 5:
						
						System.out.println("\nSolicitar relatório de:\n  1 - Funcionários\n  "
								+ "2 - Recursos físicos\n  "
								+ "3 - Sócio-torcedores\n  ");
						
						int relatorio = scanner.nextInt();
						scanner.nextLine();
						
						switch(relatorio) {
						
						case 1:
							
							System.out.println("\nTime:\n");
							for(i = 0; i < funcionarios.size(); i++) {
								if(funcionarios.get(i) instanceof Tecnico) {
									System.out.println("\nTécnico: ");
									
									Tecnico tecnico = (Tecnico) funcionarios.get(i);
									
									System.out.println(tecnico.toString());
									
								}
							}
							System.out.println("\nJogadores:\n");
							for(i = 0; i < funcionarios.size(); i++) {
								if(funcionarios.get(i) instanceof Jogador) {
									
									Jogador jogador = (Jogador) funcionarios.get(i);
									
									System.out.println(jogador.toString());
									
								}
							}
							
							System.out.println("\n\nServiços gerais:\n");
							for(i = 0; i < funcionarios.size(); i++) {
								if(funcionarios.get(i) instanceof Presidente) {
									
									Presidente presidente = (Presidente) funcionarios.get(i);
									
									System.out.println(presidente.toString());
									
								}
								
								else if(funcionarios.get(i) instanceof Advogado) {
									
									Advogado advogado = (Advogado) funcionarios.get(i);
									
									System.out.println(advogado.toString());
									
								}
								
								else if(funcionarios.get(i) instanceof Medico) {
									
									Medico medico = (Medico) funcionarios.get(i);
									
									System.out.println(medico.toString());
									
								}
								
								else if(funcionarios.get(i) instanceof PreparadorFisico) {
									
									PreparadorFisico preparador = (PreparadorFisico) funcionarios.get(i);
									
									System.out.println(preparador.toString());
									
								}
								
								else if(funcionarios.get(i) instanceof Cozinheiro) {
									
									Cozinheiro cozinheiro = (Cozinheiro) funcionarios.get(i);
									
									System.out.println(cozinheiro.toString());
									
								}
								
								else if(funcionarios.get(i) instanceof Seguranca) {
									
									Seguranca seguranca = (Seguranca) funcionarios.get(i);
									
									System.out.println(seguranca.toString());
									
								}
								
								else if(funcionarios.get(i) instanceof Motorista) {
									
									Motorista motorista = (Motorista) funcionarios.get(i);
									
									System.out.println(motorista.toString());
									
								}
							}
							break;
							
						case 2:
							
							System.out.println("\nTransporte:\n");
							for(i = 0; i < onibusLista.size(); i++) {
								System.out.println(onibusLista.get(i).toString());
							}
							
							System.out.println("\nEstádio:\n");
							for(i = 0; i < estadios.size(); i++) {
								System.out.println(estadios.get(i).toString());
							}
							
							System.out.println("\nCentro de treinamento:\n");
							for(i = 0; i < centrosTreinamento.size(); i++) {
								System.out.println(centrosTreinamento.get(i).toString());
							}

							break;
							
						case 3:
							
							System.out.println("\nQuantidade:" + socioTorcedores.size());
							
							System.out.println("\nAdimplentes:");
							for(i = 0; i < socioTorcedores.size(); i++) {
								if(socioTorcedores.get(i).getEstadoPagamento()) {
									System.out.println(socioTorcedores.get(i).toString());

								}
							}
							
							System.out.println("\nInadimplentes:");
							for(i = 0; i < socioTorcedores.size(); i++) {
								if(!socioTorcedores.get(i).getEstadoPagamento()) {
									System.out.println(socioTorcedores.get(i).toString());

								}
							}
							
							break;
							
						}
						
						break;
						
					case 6:
						
						System.out.println("\nJogadores aptos para jogar:\n");
						for(i = 0; i < funcionarios.size(); i++) {
							if(funcionarios.get(i) instanceof Jogador) {
								
								Jogador jogador = (Jogador) funcionarios.get(i);
								
								if(jogador.getAptidao()) {
									System.out.println(jogador.toString());
								}
												
							}
						}
						
						System.out.println("\nJogadores inaptos para jogar:\n");
						for(i = 0; i < funcionarios.size(); i++) {
							if(funcionarios.get(i) instanceof Jogador) {
								
								Jogador jogador = (Jogador) funcionarios.get(i);
								
								if(!jogador.getAptidao()) {
									System.out.println(jogador.toString());
								}								
							}
						}

						
						break;
						
					default:
						System.out.println("\nOperação inválida!\n");
						
					}
					
					System.out.println("\nInforme a ação desejada:"
							+ "\n1 - Adicionar funcionário"
							+ "\n2 - Adicionar sócio-torcedor"
							+ "\n3 - Alterar estado de pagamento de sócio-torcedor"
							+ "\n4 - Gerenciar recursos físicos"
							+ "\n5 - Solicitar relatório"
							+ "\n6 - Buscar jogadores por aptidão física"
							+ "\n7 - Sair\n");
					
				}
				
				catch(Exception e) {
					
					scanner.nextLine();
					System.out.println("\nOps! Parece que aconteceu um erro! Tente novamente!\n");
					System.out.println("\nInforme a ação desejada:"
							+ "\n1 - Adicionar funcionário"
							+ "\n2 - Adicionar sócio-torcedor"
							+ "\n3 - Alterar estado de pagamento de sócio-torcedor"
							+ "\n4 - Gerenciar recursos físicos"
							+ "\n5 - Solicitar relatório"
							+ "\n6 - Buscar jogadores por aptidão física"
							+ "\n7 - Sair\n");
					
				}
				
			}
			
		}

		scanner.close();
		
	}

}
