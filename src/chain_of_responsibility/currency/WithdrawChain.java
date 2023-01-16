package chain_of_responsibility.currency;

public abstract class WithdrawChain {

    WithdrawChain withdrawChain;

    WithdrawChain setNext(WithdrawChain withdrawChain) {
        this.withdrawChain = withdrawChain;
        return withdrawChain;
    }

    abstract void withdraw(Currency currency);
}
