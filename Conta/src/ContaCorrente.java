public class ContaCorrente extends Conta {

	private int idCorrente;
	private double saldoCC;

	public ContaCorrente(int agencia, int numConta, String nome, int idCorrente, double saldoCC) {
		super(agencia, numConta, nome);
		this.idCorrente = idCorrente;
		this.saldoCC = saldoCC;
	}

	public int getIdCorrente() {
		return idCorrente;
	}

	public void setIdCorrente(int idCorrente) {
		this.idCorrente = idCorrente;
	}

	public double getSaldoCC() {
		return saldoCC;
	}

	public void setSaldoCC(double saldoCC) {
		this.saldoCC = saldoCC;
	}

	public void getInfo(){
		System.out.println("Agencia: " + this.getAgencia());
		System.out.println("Conta: " + this.getNumConta());
		System.out.println("Nome: " + this.getNome());
	    System.out.println("Numero da Conta Corrente: "+ this.getIdCorrente());
	    System.out.println("Saldo em conta corrente: "+ this.getSaldoCC());
	}	
	
}
