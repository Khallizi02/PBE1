package prjPokemonV2;

public class Pokemon {

	//Atributos
	 String atributoNome;
     String atributoTipo;
	 int atributoHp;
	 int atributoNivel;
	 int atributoDefesa;
	
	//Construtores
	public Pokemon() {
		
	}
	public Pokemon(String parametroNome, String parametroTipo, int parametroHp, int parametroNivel, int parametroDefesa) {
		this.atributoNome = parametroNome;
		this.atributoTipo = parametroTipo;
		this.atributoHp = parametroHp;
		this.atributoDefesa = parametroDefesa;
	}
	
	//Metodos
	
	public void metodoAtacar() {
		System.out.println(this.atributoNome + " Atacou!");
	}
	public void metodoEvoluir() {
		System.out.println(this.atributoNome + " Evoluiu");
	}
	
	public void metodoExibir() {
		System.out.println("Nome: " + this.atributoNome);
    	System.out.println("Tipo: " + this.atributoTipo);
    	System.out.println("Hp: " + this.atributoHp);
    	System.out.println("Nivel: " + this.atributoNivel);
		System.out.println("Defesa: " + this.atributoDefesa);
	}
	
	
	public String getAtributoNome() {
		return atributoNome;
	}
	public void setAtributoNome(String atributoNome) {
		this.atributoNome = atributoNome;
	}
	public String getAtributoTipo() {
		return atributoTipo;
	}
	public void setAtributoTipo(String atributoTipo) {
		this.atributoTipo = atributoTipo;
	}
	public int getAtributoHp() {
		return atributoHp;
	}
	public void setAtributoHp(int atributoHp) {
		this.atributoHp = atributoHp;
	}
	public int getAtributoNivel() {
		return atributoNivel;
	}
	public void setAtributoNivel(int atributoNivel) {
		this.atributoNivel = atributoNivel;
	}
	public int getAtributoDefesa() {
		return atributoDefesa;
	}
	public void setAtributoDefesa(int atributoDefesa) {
		this.atributoDefesa = atributoDefesa;
	}
	
}
