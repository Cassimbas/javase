/**
 * POO Fazendo a Construcao do Menicraft
 * @author Cassio Braga
 */
package bloco;

public class Bloco {

	public int resistencia;
	public String textura;

	public Bloco() throws InterruptedException {
		System.out.println(".-..-. _                                .--. .-.");
		Thread.sleep(200);
		System.out.println(": `' ::_;                              : .-'.' `.");
		Thread.sleep(200);
		System.out.println(": .. :.-.,-.,-. .--.  .--. .--.  .--.  : `; `. .'");
		Thread.sleep(200);
		System.out.println(": :; :: :: ,. :' '_.''  ..': ..'' .; ; : :   : :");
		Thread.sleep(200);
		System.out.println(":_;:_;:_;:_;:_;`.__.'`.__.':_;  `.__,_;:_;   :_;");
		Thread.sleep(200);
		System.out.print("Aguarde.");
		Thread.sleep(300);
		System.out.print(".");
		Thread.sleep(500);
		System.out.println(".");
	}
/**
 * Construir
 */
	public void construir() {
		System.out.println("construido........");
	}
/**
 * Minerar
 */
	public void minerar() {
		System.out.println("minerado**********");
	}
/**
 * Craftar
 */
	public void craftar() {
		System.out.println("craftado$$$$$$$$$$");
	}
}
