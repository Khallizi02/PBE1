package prjPokemonV2;

public class SubclassePokemonAgua extends Pokemon {
	@Override 
	public void metodoAtacar() {
		System.out.println(this.atributoNome + " usou o ataque Surfar");
		System.out.println(this.atributoNome + " usou o ataque Canhão Agua");
	}

}
