package enxada;

public class Itens {

	public static void main(String[] args) throws InterruptedException {

		Enxada enxadaMadeira = new Enxada();
		enxadaMadeira.textura = "madeira";
		enxadaMadeira.resistencia = 1;
		enxadaMadeira.conquista = false;
		System.out.println("Ferramenta: Enxada");
		System.out.println("Testura: " + enxadaMadeira.textura);
		System.out.println("Resist�ncia: " + enxadaMadeira.resistencia);
		enxadaMadeira.arar();
		if (enxadaMadeira.conquista == true) {
			System.out.println("Voc� desbloqueiou uma conquista...!");
		} else {
			System.out.println("Voc� n�o desbloqueou a conquista...EU N�O JOGO MAAAAIISSS");
		}

	}

}
