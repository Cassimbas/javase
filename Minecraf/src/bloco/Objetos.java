package bloco;

public class Objetos {

	public static void main(String[] args) throws InterruptedException {

		Bloco grama = new Bloco();
		System.out.println("=====================================");
		grama.textura = "verde";
		grama.resistencia = 1;
		System.out.println("Bloco: Grama");
		System.out.println("Testura: " + grama.textura);
		System.out.println("Resist�ncia: " + grama.resistencia);
		grama.construir();
		grama.minerar();

		System.out.println("=====================================");

		Bloco madeira = new Bloco();
		madeira.textura = "verdeescuro";
		madeira.resistencia = 2;
		System.out.println("Bloco: Madeira");
		System.out.println("Testura: " + madeira.textura);
		System.out.println("Resist�ncia: " + madeira.resistencia);
		madeira.construir();
		madeira.minerar();
		madeira.craftar();
	}

}
