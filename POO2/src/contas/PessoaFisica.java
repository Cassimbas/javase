package contas;

public class PessoaFisica {

	public static void main(String[] args) {
		Conta cc1 = new Conta();
		cc1.setCliente("Fox Mulder");
		cc1.setSaldo(10000);
		System.out.println("Cliente: " + cc1.getCliente());
		cc1.exibirSaldo();
		cc1.sacar(800);
		cc1.exibirSaldo();
		cc1.depositar(200);
		cc1.exibirSaldo();
		System.out.println("##############################");

		Conta cc2 = new Conta();
		cc2.setCliente("Dana Scully");
		cc2.setSaldo(10000);
		System.out.println("Cliente: " + cc2.getCliente());
		cc2.exibirSaldo();
		cc2.sacar(500);
		cc2.exibirSaldo();
		cc2.depositar(350);
		cc2.exibirSaldo();
		System.out.println("##############################");

		System.out.println("Transferência");
		System.out.println("");
		System.out.println("Cliente: " + cc1.getCliente());
		cc1.exibirSaldo();
		System.out.println("");
		System.out.println("Favorecido: " + cc2.getCliente());
		cc2.exibirSaldo();
		cc1.transferir(cc2, 200);
		System.out.println("");
		System.out.println("Saldo");
		System.out.println("");
		System.out.println("Cliente: " + cc1.getCliente());
		cc1.exibirSaldo();
		System.out.println("");
		System.out.println("Favorecido: " + cc2.getCliente());
		cc2.exibirSaldo();
		System.out.println("##############################");
	}

}
