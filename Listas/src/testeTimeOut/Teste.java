package testeTimeOut;

import java.util.Scanner;

public class Teste {
	public static void main(String[] args) throws InterruptedException {
		timeOut();
	}

	public static void timeOut() throws InterruptedException {
		Thread.sleep(1000);
		System.out.println("Calculando: ");
		Thread.sleep(1000);
		System.out.print("1\n");
		Thread.sleep(1000);		
		System.out.print("2\n");
		Thread.sleep(1000);
		System.out.print("3\n");
		Thread.sleep(1000);
		System.out.print("4\n");
		Thread.sleep(1000);
		System.out.print("5\n");
		Thread.sleep(1000);
		System.out.print("6\n");
		Thread.sleep(1000);
		System.out.print("7\n");
		Thread.sleep(1000);
		System.out.print("8\n");
		Thread.sleep(1000);
		System.out.print("9\n");
		Thread.sleep(1000);
		System.out.print("10\n");
		Thread.sleep(1000);
		System.out.println("Encerrado!");
	}
//	Scanner sc = new Scanner(System.in);
//	Integer act = null;
//
//	do {
//		System.out.println("\n1. Cadastrar produto");
//		System.out.println("2. Buscar Produto (procurar produto pelo nome) ");
//		System.out.println("3. Listar todos os produtos");
//		System.out.println("4. Efetuar venda de produto");
//		System.out.println("0. Sair");
//		System.out.println("Digite uma opção:");
//		act = sc.nextInt();
//		sc.nextLine();
//
//		switch (act) {
//		case 1:
//			
//			break;
//		case 2:
//
//			break;
//		case 3:
//		
//			break;
//		case 4:
//		
//			break;
//		case 0:
//			System.out.println("Encerrando ...");
//			break;
//		}
//
//	} while (act != 0);
//	sc.close();
}
