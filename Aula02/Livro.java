package novoProjeto;

public class Livro {
	
	String livro;
	String autor;
	boolean alugado;
	
	public Livro (String livro, String autor ) {
		this.livro = livro;
		this.autor = autor;
		this.alugado = false;
	}
	
	void status() {
		System.out.println(this.livro + ":" + (this.alugado ? "Alugado": "Disponivel"));
	}
	
	void alugado() {
		this.alugado = true;
	}
	void naoAlugao() {
		this.alugado = false;
}
}

,