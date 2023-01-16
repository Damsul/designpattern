package chain_of_responsibility.currency2;

public class Dispenser50Won implements DispenserChain {
    private DispenserChain dispenserChain;
    @Override
    public DispenserChain setNext(DispenserChain dispenser) {
        this.dispenserChain = dispenser;
        return dispenser;
    }

    @Override
    public void dispense(Currency currency) {
        if (currency.getAmount() >= 50) {
            int cnt = currency.getAmount() / 50;
            int remainder = currency.getAmount() % 50;
            System.out.println("50원 : " + cnt + "개");
            if (remainder != 0) {
                this.dispenserChain.dispense(new Currency(remainder));
            }
        } else {
            this.dispenserChain.dispense(currency);
        }
    }
}
