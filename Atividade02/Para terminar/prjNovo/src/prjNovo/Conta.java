package prjNovo;

public class Conta {
	
	//Atributos
	
	private String nomeTitular;
	private double saldoConta;
	private int numeroConta;
	
	//Construtores
    public Conta () {
    	
    }
    	
	public Conta(int numeroConta , String nomeTitular, double saldoConta) {
		
	this.numeroConta = numeroConta; 
	this.nomeTitular = nomeTitular;
	this.saldoConta = 0;
	}
	
	public Conta(String nomeTitular, int numeroConta) {
	this.nomeTitular = nomeTitular;
	this.numeroConta = numeroConta;
	}
	
	public Conta(int numeroConta, String nomeTitular) {
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
	}
	
	//Getters e setters

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public double getSaldoConta() {
		return saldoConta;
	}

	public void setSaldoConta(double saldoConta) {
		this.saldoConta = saldoConta;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

}
