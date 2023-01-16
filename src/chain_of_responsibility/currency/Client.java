package chain_of_responsibility.currency;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Client {
    public static void main(String[] args) throws IOException {
        WithdrawChain withdraw100000Won = new Withdraw100000Won();
        withdraw100000Won.setNext(new Withdraw50000Won())
            .setNext(new Withdraw10000Won());
//        Withdraw50000Won withdraw50000Won = new Withdraw50000Won();
//        Withdraw10000Won withdraw10000Won = new Withdraw10000Won();
//        withdraw100000Won.setNext(withdraw50000Won);
//        withdraw50000Won.setNext(withdraw10000Won);

        while (true) {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("인출할 금액을 적어주세요.");
            int money = Integer.parseInt(br.readLine());
            if (money <= 0) {
                System.out.println("종료하겠습니다.");
                break;
            }
            Currency currency = new Currency(money);
            withdraw100000Won.withdraw(currency);
            System.out.println("--------------------------");
        }
    }
}
