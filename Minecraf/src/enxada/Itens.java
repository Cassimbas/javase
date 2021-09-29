package enxada;

public class Itens {

	public static void main(String[] args) throws InterruptedException {

		Enxada enxadaMadeira = new Enxada();
		enxadaMadeira.textura = "madeira";
		enxadaMadeira.resistencia = 1;
		enxadaMadeira.conquista = false;
		System.out.println("Ferramenta: Enxada");
		System.out.println("Testura: " + enxadaMadeira.textura);
		System.out.println("Resistência: " + enxadaMadeira.resistencia);
		enxadaMadeira.arar();
		if (enxadaMadeira.conquista == true) {
			System.out.println("Você desbloqueiou uma conquista...!");
		} else {
			System.out.println("Você não desbloqueou a conquista...EU NÃO JOGO MAAAAIISSS");
		}

	}

}
