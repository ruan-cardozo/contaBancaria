import java.util.Date;
	public class Pessoa {
		private String nome;
		private String cpf; //discutir isso
		private Date dateNascmimento;
		private String email;
		private String Telefone;
		private Endereco endereco;

		public Pessoa(String nome, String cpf) {
			this.nome = nome;
			this.cpf = cpf;
		}

		public void setNome(String nome) { // set mudar o valor
			this.nome = nome;
		}

		public String getNome() {
			return nome;
		}

		public String getCpf() {
			return cpf;
		}

		public void setCpf(String cpf) {
			this.cpf = cpf;
		}

		public Date getDateNascmimento() {
			return dateNascmimento;
		}

		public void setDateNascmimento(Date dateNascmimento) {
			this.dateNascmimento = dateNascmimento;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getTelefone() {
			return Telefone;
		}

		public void setTelefone(String telefone) {
			Telefone = telefone;
		}

		public Endereco getEndereco() {
			return endereco;
		}

		public void setEndereco(Endereco endereco) {
			this.endereco = endereco;
		}

		public class Endereco {
		String endereco;
		String complemento;
		String bairro;
		String cidade;
		String estado;
		String cep;
		}
}
