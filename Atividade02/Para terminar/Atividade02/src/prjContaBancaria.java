import java.util.Scanner;

public class prjContaBancaria {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		//construtor
		private String Conta ;
		
		System.out.println("Qual o numero da conta?");
		int numeroConta = sc.nextInt();
		
		System.out.println("Qual o nome do titular da conta?");
		String nomeTitular = sc.nextLine();
		
		System.out.println("Qual o saldo atual da conta?");
		double saldo = sc.nextDouble();
		
		// Saque e deposito 
		System.out.println("Voce quer sacar ou depositar?");
		System.out.println("1. Sacar");
		System.out.println("2. Depositar");
		int escolha = sc.nextInt();
		
		if (escolha == 1) {
			System.out.println("Quanto voce deseja depositar");
			double deposito= sc.nextDouble();
			saldo =+ deposito;
			
		}
		else if (escolha == 2) {
			System.out.println("Quanto você quer sacar?");
			double saque = sc.nextDouble();
			
			if (saque < 0) {
				System.out.println("Você não tem o saldo suficiente para sacar");
			}
			
			else if (saque > deposito) {
				System.out.println("Você não tem o saldo suficiente para sacar");		
			}
			
			else {
				System.out.println("O valor foi sacado!");
				System.out.println("O saldo atual é: " + saldo);
			}
			
		}
		else {
			System.out.println("Opção invalida");
		}
		

	}

}
