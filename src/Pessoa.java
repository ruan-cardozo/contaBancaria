import java.util.Date;
	public class Pessoa {
		private String nome;
		private String cpf; //discutir isso
		private Date dateNascmimento;
		private String Telefone;
		private Endereco endereco;

		public Pessoa(String nome, String cpf) {
			this.setNome(nome);
			this.setCpf(cpf);
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
		public String getTelefone() {
			return Telefone;
		}

		public void setTelefone(String telefone) {
			Telefone = telefone;
		}

		public class Endereco {

			public Endereco (String endereco, String complemento, String bairro, String cidade, String estado, String cep) {
				this.setEndereco(endereco);
				this.setComplemento(complemento);
				this.setBairro(bairro);
				this.setCidade(cidade);
				this.setEstado(estado);
				this.setCep(cep);
			}

			public String endereco;

			public String getEndereco() {
				return endereco;
			}

			public void setEndereco(String endereco) {
				this.endereco = endereco;
			}

			public String getComplemento() {
				return complemento;
			}

			public void setComplemento(String complemento) {
				this.complemento = complemento;
			}

			public String getBairro() {
				return bairro;
			}

			public void setBairro(String bairro) {
				this.bairro = bairro;
			}

			public String getCidade() {
				return cidade;
			}

			public void setCidade(String cidade) {
				this.cidade = cidade;
			}

			public String getEstado() {
				return estado;
			}

			public void setEstado(String estado) {
				this.estado = estado;
			}

			public String getCep() {
				return cep;
			}

			public void setCep(String cep) {
				this.cep = cep;
			}
			String complemento;
			String bairro;
			String cidade;
			String estado;
			String cep;
		}
}
