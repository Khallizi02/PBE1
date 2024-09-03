package prjZoologioco;

public class Aplicacao {

	public static void main(String[] args) {
		
		ClasseAnimal elefante = new ClasseAnimal(); 
	
	    elefante.setNome("Raindrops");
		elefante.setPeso(120);
		elefante.setSexo("Meninxs");
 	
	ClasseAnimal girafa = new ClasseAnimal("GitHub","Russa","Femea",60);
	
    SubclasseCarnivoro leao = new SubclasseCarnivoro ();
    leao.atributoNome = "Leaodro";
    leao.atributoRaca = "Australeandro";
    leao.atributoSexo = "Neutrx";
    leao.atributoPeso = 123;
	
	elefante.exibirInfo();
	elefante.metodoComer(15);
	
	elefante.exibirInfo();
	girafa.exibirInfo();
	
	elefante.metodoEmitirSom();
	girafa.metodoEmitirSom();
	leao.metodoEmitirSom();
	
	
	
	
	
	}

}
