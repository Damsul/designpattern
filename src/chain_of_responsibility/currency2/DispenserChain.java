package chain_of_responsibility.currency2;

public interface DispenserChain {
    DispenserChain setNext(DispenserChain dispenser);

    void dispense(Currency currency);
}
