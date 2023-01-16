package chain_of_responsibility.currency2;

public class Dispenser1Won implements DispenserChain {
    private DispenserChain dispenserChain;
    @Override
    public DispenserChain setNext(DispenserChain dispenser) {
        this.dispenserChain = dispenser;
        return dispenser;
    }

    @Override
    public void dispense(Currency currency) {
            int cnt = currency.getAmount();
            System.out.println("1원 : " + cnt + "개");
    }
}
