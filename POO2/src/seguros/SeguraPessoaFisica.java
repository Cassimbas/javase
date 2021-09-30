package seguros;

import contas.Conta;

public class SeguraPessoaFisica extends Conta {

	public static void main(String[] args) {
		SeguraPessoaFisica cc3 = new SeguraPessoaFisica();
		cc3.setCliente("Walter Skinner");
		cc3.setSaldo(15000.35);
		System.out.println("Cliente: " + cc3.getCliente());
		cc3.exibirSaldo();
		System.out.println("##############################");
	}

}
