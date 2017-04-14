public abstract class Conta {

	private int agencia;
	private int numConta;
	private String nome;
	ContaPoupanca poupanca;
	ContaCorrente cCorrente;

	public Conta(int agencia, int numConta, String nome) {
		super();
		this.agencia = agencia;
		this.numConta = numConta;
		this.nome = nome;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void getInfo(){
		System.out.println("Agencia: " + this.agencia);
		System.out.println("Conta: " + this.numConta);
		System.out.println("Nome: " + this.nome);
		
	}
}

