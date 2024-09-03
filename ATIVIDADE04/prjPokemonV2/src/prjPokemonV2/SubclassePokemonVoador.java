package prjPokemonV2;

public class SubclassePokemonVoador extends Pokemon {

	//
	
	@Override 
	public void metodoAtacar() {
		System.out.println(this.atributoNome + " usou o ataque Bola de fogo");
		System.out.println(this.atributoNome + " usou o ataque Explosão de fogo");
		System.out.println(this.atributoNome + " usou o ataque Lança chamas");
		}
	
}
