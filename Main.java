package PPT_Pack;

import java.util.Scanner;

public class Main {
	

	public static void main(String[] args) {


	Scanner sc = new Scanner(System.in);
	int escolha1;
	int escolha2;

	
	System.out.println("Nome do jogador 1: ");
	Scanner scanner = new Scanner(System.in);
	String jogador1 = scanner.nextLine();
	Jogador nome1 = new Jogador(jogador1);
	
	System.out.println("Nome do jogador 2: ");
	String jogador2 = scanner.nextLine();
	Jogador nome2 = new Jogador(jogador2);
	

	System.out.println("Escolha entre 0, 1 e 2 , sendo : ");
	System.out.println("Pedra = 0 ");
	System.out.println("Papel = 1  ");
	System.out.println("Tesoura = 2");
	
	System.out.println(jogador1 + ": ");
	escolha1 = sc.nextInt();
	Jogador Escolha1 = new Jogador(jogador1);
	if (escolha1 != 0 & escolha1 !=1 & escolha1 !=2) {
		System.out.println("Valor inválido. Reinicie o código.");
		
	}
		
	System.out.println(jogador2 + ": ");
	escolha2 = sc.nextInt();
	Jogador Escolha2 = new Jogador(jogador2);
	if (escolha2 != 0 & escolha2 !=1 & escolha2 !=2) {
		System.out.println("Valor inválido. Reinicie o código.");
		
	}
	
	
	if (escolha1 == 0 & escolha2 == 1){
		System.out.println(jogador2 + " ganhou");
	}
	if (escolha1 == 0 & escolha2 == 0) {
		System.out.println(" Empatou");
	}
	if (escolha1 == 0 & escolha2 == 2) {
		System.out.println(jogador1 + " ganhou");
	}
	if (escolha1 == 1 & escolha2 == 1){
		System.out.println("Empatou");
	}
	if (escolha1 == 1 & escolha2 == 0) {
		System.out.println(jogador1 + " ganhou");
	}
	if (escolha1 == 1 & escolha2 == 2) {
		System.out.println(jogador2 + " ganhou");
	}
	if (escolha1 == 2 & escolha2 == 1){
		System.out.println(jogador1 + " ganhou");
	}
	if (escolha1 == 2 & escolha2 == 0) {
		System.out.println(jogador2 + " ganhou");
	}
	if (escolha1 == 2 & escolha2 == 2) {
		System.out.println("Empatou");
	}
			
				
	}

	private static boolean escolha1(int i, int j, int k) {
		// TODO Auto-generated method stub
		return false;
	}
}


