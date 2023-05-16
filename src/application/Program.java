package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Bill;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Bill bill = new Bill();

		System.out.print("Sexo:");
		bill.gender = sc.next().charAt(0);

		System.out.print("Quantidade de cervejas:");
		bill.beer = sc.nextInt();

		System.out.print("Quantidade de refrigerantes:");
		bill.softDrink = sc.nextInt();

		System.out.print("Quantidade de espetinhos:");
		bill.barbecue = sc.nextInt();

		System.out.println();
		System.out.println("RELATÓRIO:");
		System.out.println("Consumo = R$ " + bill.feeding());

		System.out.println(bill);

		System.out.printf("Ingresso = R$ " + bill.ticket());

		System.out.println();

		System.out.printf("Valor a pagar = R$ " + bill.total());

		sc.close();

	}

}
