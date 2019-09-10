package behavioral.command.Bank;

public class WithdrawMoneyCommand implements Command {
    private final BankAccount bankAccount;
    private final int moneyToWithdraw;
    private boolean wasExecuted;

    //zaleznosci wstrzykniete do konstruktora
    public WithdrawMoneyCommand(BankAccount bankAccount, int moneyToWithdraw) {
        this.bankAccount = bankAccount;
        this.moneyToWithdraw = moneyToWithdraw;
    }

    @Override
    public void execute() {
        //mozna dodac if z bankAccount == null i rzucic wyjatek jesli tak
        bankAccount.withdraw(moneyToWithdraw);
        wasExecuted = true;
    }

    @Override
    public void undo() {
        if (wasExecuted) {
            bankAccount.deposit(moneyToWithdraw);
            wasExecuted = false;
        }
    }

}
