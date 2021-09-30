/**
 * POO2 - Encapsulamento
 * @author Cassio Braga
 */

package contas;

public class Conta {

	private double saldo;
	private String cliente;

	/**
	 * Obter o saldo
	 * 
	 * @return saldo
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * Atribuir um valor a variavel saldo
	 * 
	 * @param saldo
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * Obter o nome cliente
	 * 
	 * @return cliente
	 */
	public String getCliente() {
		return cliente;
	}

	/**
	 * Atribuir um valor a variavel cliente
	 * 
	 * @param cliente
	 */
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public Conta() {
		super();
		System.out.println("Agência 0261");
	}
	
	/**
	 * Exibir o saldo da conta
	 */
	protected void exibirSaldo() {
		System.out.println("Saldo: R$ " + saldo);
	}
	
	/**
	 * Debitar o valor da conta corrente
	 * @param valor
	 */
	protected void sacar(double valor) {
		saldo-= valor;
		System.out.println("Débito: " + valor);
	}
	
	/**
	 * Creditar o valor na conta corrente
	 * @param valor
	 */
	protected void depositar(double valor) {
		saldo+= valor;
		System.out.println("Crédito: " + valor);
	}
	
	/**
	 * Transferir valores entre contas correntes
	 * @param destino
	 * @param valor
	 */
	protected void transferir(Conta destino, double valor) {
		this.sacar(valor);
		destino.depositar(valor);
		System.out.println("Transferência: R$ " + valor);
	}
}