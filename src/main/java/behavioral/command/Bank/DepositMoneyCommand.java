package behavioral.command.Bank;

public class DepositMoneyCommand implements Command {
    private final BankAccount bankAccount;
    private final int moneyToDeposit;
    private boolean wasExecuted;

    public DepositMoneyCommand(BankAccount bankAccount, int moneyToDeposit) {
        this.bankAccount = bankAccount;
        this.moneyToDeposit = moneyToDeposit;
    }

    @Override
    public void execute() { //hermetyzuje operacje zlozenia depozytu
        bankAccount.deposit(moneyToDeposit);
        wasExecuted = true;
    }

    @Override
    public void undo() {
        if (wasExecuted) {
            bankAccount.withdraw(moneyToDeposit);
            wasExecuted = false;
        }
    }
}
