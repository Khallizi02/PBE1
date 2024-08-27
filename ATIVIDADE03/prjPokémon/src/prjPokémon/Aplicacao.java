package prjPokémon;

public class Aplicacao {

	//Atributos
	String atributoNome;
	String atributoTipo;
	int atributoHp;
	int atributoNivel;
	
	//Construtores
	public Aplicacao() {
		
	}
	public Aplicacao(String parametroNome, String parametroTipo, int parametroHp, int atributoNivel) {
		this.atributoNome = parametroNome;
		this.atributoTipo = parametroTipo;
		this.atributoHp = parametroHp;
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
		
	}
	
}
