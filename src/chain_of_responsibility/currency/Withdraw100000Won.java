package chain_of_responsibility.currency;

public class Withdraw100000Won extends WithdrawChain {
    @Override
    public void withdraw(Currency currency) {
        if (currency.getAmount() % 10000 != 0) {
            System.out.println("10000원 단위로 다시 입력해 주세요");
            return;
        }

        if (currency.getAmount() >= 100000) {
            int cnt = currency.getAmount() / 100000;
            System.out.println("10만원짜리 " + cnt + "장이 인출 되었습니다.");
            int remainder = currency.getAmount() % 100000;
            if (remainder != 0) {
                this.withdrawChain.withdraw(new Currency(remainder));
            }
        } else {
            this.withdrawChain.withdraw(currency);
        }
    }
}
