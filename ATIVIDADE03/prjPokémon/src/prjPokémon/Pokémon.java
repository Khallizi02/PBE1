package prjPokémon;

public class Pokémon {

	public static void main(String[] args) {
		Aplicacao jigglypuff = new Aplicacao("Jigglypuff ","Normal", 100, 12);
		Aplicacao ralts = new Aplicacao("Ralts", "Fada", 90, 7);
		Aplicacao magnamite = new Aplicacao("Magnamite","Eletrico", 140, 18);
		Aplicacao azulmaril = new Aplicacao("Azulmaril","Aguá", 80, 10);
		Aplicacao eevee = new Aplicacao("Eevee","Normal", 999, 999);
		
		jigglypuff.metodoExibir();
		jigglypuff.metodoAtacar();
		jigglypuff.metodoEvoluir();
		
		ralts.metodoExibir();
		ralts.metodoAtacar();
		ralts.metodoEvoluir();
		
		magnamite.metodoExibir();
		magnamite.metodoAtacar();
		magnamite.metodoEvoluir();
		
		azulmaril.metodoExibir();
		azulmaril.metodoAtacar();
		azulmaril.metodoEvoluir();
		
		eevee.metodoExibir();
		eevee.metodoAtacar();
		eevee.metodoEvoluir();
		

	}

}
