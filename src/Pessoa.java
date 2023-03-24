public class Fintech {
	private String nome;
	private String versao;
	private ContaBancaria conta;

	public Fintech(String nome, String versao) {
		this.nome = nome;
		this.versao = versao;
	}

	public void criarContaBancaria(String numeroConta, String nomeTitular, String cpfCnpj) {
		this.conta = new ContaBancaria(numeroConta, nomeTitular, cpfCnpj);
	}

	public void realizarTransferencia(double valor, ContaBancaria destino) {
		this.conta.transferir(valor, destino);
	}

	public double verificarSaldo() {
		return this.conta.getSaldo();
	}
}

