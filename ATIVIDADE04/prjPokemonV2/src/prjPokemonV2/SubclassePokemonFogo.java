package prjPokemonV2;

public class SubclassePokemonFogo extends Pokemon {
	@Override 
	public void metodoAtacar() {
		System.out.println(this.atributoNome + " usou o ataque Voar");
		System.out.println(this.atributoNome + " usou o ataque Ataque de asas");
	}
}
