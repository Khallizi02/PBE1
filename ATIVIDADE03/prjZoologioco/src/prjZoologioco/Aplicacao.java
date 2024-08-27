package prjZoologioco;

public class Aplicacao {

	public static void main(String[] args) {
		
		ClasseAnimal elefante = new ClasseAnimal();
		elefante.atributoNome = "Yes, and?";
		elefante.atributoRaca = "Africano";
		elefante.atributoSexo = "Macho";
		elefante.atributoPeso = 170;
 	
	ClasseAnimal girafa = new ClasseAnimal("GitHub","Russa","Femea",60);
	
    SubclasseCarnivoro leao = new SubclasseCarnivoro ();
    leao.atributoNome = "Leaodro";
    leao.atributoRaca = "Australeandro";
    leao.atributoSexo = "Neutrx";
    leao.atributoPeso = 123;
	
	elefante.exibirInfo();

	elefante.metodoComer();
	
	elefante.exibirInfo();
	
	girafa.exibirInfo();
	
	}

}
