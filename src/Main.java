	public class Main {
		public static void main(String[] args) {
			Endereco e = new Endereco();
			Pessoa p = new Pessoa("Ruan", "115.302.289-30");
			p.setTelefone("+5547984676946");
			e.setBairro("AMerica");
			p.setEndereco(e);
			System.out.println("Ola " + p.getNome() + " Bairro " + p.getEndereco().getBairro());
		}
	}
