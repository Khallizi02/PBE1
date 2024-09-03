package prjPokemonV2;

public class Aplicacao {

	public static void main(String[] args) {
		
		//Declarando os pokemons escolhidos e seus status
		
		Pokemon Charmander  = new Pokemon();
		Pokemon Cyndaquil  = new Pokemon();
		Pokemon  Sperow = new Pokemon();
		Pokemon  Pidgey = new Pokemon();
		Pokemon Squirtle  = new Pokemon();
		Pokemon Lapras  = new Pokemon();
		
		Charmander.setAtributoNome("Charmander");
		Charmander.setAtributoTipo("Fogo");
		Charmander.setAtributoNivel(52);
		Charmander.setAtributoHp(140);
		Charmander.setAtributoDefesa(15);
		
		Cyndaquil.setAtributoNome("Cyndaquil");
		Cyndaquil.setAtributoTipo("Fogo");
		Cyndaquil.setAtributoNivel(82);
		Cyndaquil.setAtributoHp(100);
		Cyndaquil.setAtributoDefesa(15);
		
		Sperow.setAtributoNome("Sperow");
		Sperow.setAtributoTipo("Voador");
		Sperow.setAtributoNivel(24);
		Sperow.setAtributoHp(190);
		Sperow.setAtributoDefesa(3);
		
		Pidgey.setAtributoNome("Pidgey");
		Pidgey.setAtributoTipo("Voador");
		Pidgey.setAtributoNivel(34);
		Pidgey.setAtributoHp(90);
		Pidgey.setAtributoDefesa(35);
		
		Squirtle.setAtributoNome("Squirtle");
		Squirtle.setAtributoTipo("Agua");
		Squirtle.setAtributoNivel(94);
		Squirtle.setAtributoHp(90);
		Squirtle.setAtributoDefesa(15);
		
		Lapras.setAtributoNome("Lapras");
		Lapras.setAtributoTipo("Agua");
		Lapras.setAtributoNivel(100);
		Lapras.setAtributoHp(50);
		Lapras.setAtributoDefesa(12);
		
		//Exibição 
		
		Charmander.metodoExibir();
		Cyndaquil.metodoExibir();
		Sperow.metodoExibir();
		Pidgey.metodoExibir();
		Squirtle.metodoExibir();
		Lapras.metodoExibir();

		//Ataque e evolução
		
		Charmander.metodoAtacar();
		Cyndaquil.metodoAtacar();
		Sperow.metodoAtacar();
		Pidgey.metodoAtacar();
		Squirtle.metodoAtacar();
		Lapras.metodoAtacar();
		
		Charmander.metodoEvoluir();
		Cyndaquil.metodoEvoluir();
		Sperow.metodoEvoluir();
		Pidgey.metodoEvoluir();
		Squirtle.metodoEvoluir();
		Lapras.metodoEvoluir();
	}

}
