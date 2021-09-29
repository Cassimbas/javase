package aeroporto;

import avioes.Aviao;

public class Hangar {

	public static void main(String[] args) {
		
		Aviao boeing777 = new Aviao();
		boeing777.ano = 2016;
		boeing777.cor = "Branco";
		boeing777.envergadura = 64.8;
		System.out.println("Avião : Boeing 777");
		System.out.println("Ano : " + boeing777.ano);
		System.out.println("Cor :" + boeing777.cor);
		System.out.println("Envergadura :" + boeing777.envergadura);
		boeing777.ligar();
		boeing777.acelerar();
		boeing777.aterrizar();
		
		System.out.println("__________________________________");
		
		Aviao mriya225 = new Aviao();
		mriya225.ano = 2021;
		mriya225.cor = "cinza";
		mriya225.envergadura = 88;
		mriya225.tremPouso = false;
		System.out.println("Avião : Mriya225");
		System.out.println("Ano :" + mriya225.ano);
		System.out.println("Cor :" + mriya225.cor);
		System.out.println("Envergadura :" + mriya225);
		mriya225.ligar();
		mriya225.acelerar();
		if (mriya225.tremPouso == true) {
			mriya225.aterrizar();
		} else {
			System.out.println("ARREMETER!");
		}
	}

}
