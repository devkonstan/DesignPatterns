package behavioral.command.Bank;

import java.util.ArrayList;
import java.util.List;

public class CommandDemo {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        System.out.println("initial balance: " + bankAccount.getBalance());

        List<Command> bankCommands = new ArrayList<>();

        //traktujemy polecenie jako obiekt
        Command depositMoneyCommand = new DepositMoneyCommand(bankAccount, 100);
        depositMoneyCommand.execute();

        System.out.println("after deposit: " + bankAccount.getBalance());

        depositMoneyCommand.undo();
        System.out.println("after undo: " + bankAccount.getBalance());


        Command withdrawMoneyComand = new WithdrawMoneyCommand(bankAccount, 50);
        withdrawMoneyComand.execute();

        System.out.println("final balance: " + bankAccount.getBalance());

        withdrawMoneyComand.undo();
        System.out.println("undo balance: " + bankAccount.getBalance());
        System.out.println(bankCommands.isEmpty());

        System.out.println("*******");

        MiniPilot pilot = new MiniPilot();

        Command deposit = new DepositMoneyCommand(bankAccount, 200);

        pilot.setCommand(deposit);
        System.out.println("after execute: " + bankAccount.getBalance());

        pilot.ButtonHasBeenPressed();
        System.out.println("after execute: " + bankAccount.getBalance());

        deposit.execute();
        System.out.println("after execute: " + bankAccount.getBalance());

        pilot.ButtonHasBeenPressed();
        System.out.println("after execute: " + bankAccount.getBalance());
    }
}


