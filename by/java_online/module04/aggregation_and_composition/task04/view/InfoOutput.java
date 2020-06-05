package by.java_online.module04.aggregation_and_composition.task04.view;

import by.java_online.module04.aggregation_and_composition.task04.entity.Account;
import by.java_online.module04.aggregation_and_composition.task04.logic.AccountLogic;

import java.util.List;

public class InfoOutput {
    AccountLogic logic = new AccountLogic();

    public void showInfoAboutAccount(Account account) {
        System.out.print("status: " + account.getStatus() +
                         ", account number: " + account.getAccountNumber() + ", ");

        System.out.printf("balance: %.2f", account.getBalance());
    }

    public void showClientBalance(List<Account> accounts) {
        System.out.printf("\nPositive balance = %.2f\nNegative balance = %.2f\nTotal balance = %.2f\n",
                          logic.findPositiveBalance(accounts),
                          logic.findNegativeBalance(accounts),
                          logic.findTotalBalance(accounts));
    }

    public void showErrorMessage(String accountToSearch) {
        System.out.println("Account number - " + accountToSearch + " - not found.");
    }
}
