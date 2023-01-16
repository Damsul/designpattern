package chain_of_responsibility.currency2;

import java.io.IOException;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        DispenserChain dispenserChain = new Dispenser50000Won();
        dispenserChain.setNext(new Dispenser10000Won())
            .setNext(new Dispenser5000Won())
            .setNext(new Dispenser1000Won())
            .setNext(new Dispenser500Won())
            .setNext(new Dispenser100Won())
            .setNext(new Dispenser50Won())
            .setNext(new Dispenser10Won())
            .setNext(new Dispenser1Won());

        System.out.print("거스름 돈 : ");
        Scanner sc = new Scanner(System.in);
        int money = Integer.parseInt(sc.nextLine());
        Currency currency = new Currency(money);
        dispenserChain.dispense(currency);
        System.out.println("거슬러 줬습니다.");
    }

}
