public class ContaPoupanca extends Conta {

	private int idPoupanca;
	private double saldoCP;

	public ContaPoupanca(int agencia, int numConta, String nome, int idCorrente, double saldoCC) {
		super(agencia, numConta, nome);
		this.idPoupanca = idCorrente;
		this.saldoCP = saldoCC;
	}

	public int getIdPoupanca() {
		return idPoupanca;
	}

	public void setIdPoupanca(int idCorrente) {
		this.idPoupanca = idCorrente;
	}

	public double getSaldoCP() {
		return saldoCP;
	}

	public void setSaldoCP(double saldoCP) {
		this.saldoCP = saldoCP;
	}

	public void getInfo(){
		System.out.println("Agencia: " + this.getAgencia());
		System.out.println("Conta: " + this.getNumConta());
		System.out.println("Nome: " + this.getNome());
	    System.out.println("Numero da Conta Poucança: "+ this.getIdPoupanca());
	    System.out.println("Saldo na Poupança : "+ this.getSaldoCP());
	}	
	
}