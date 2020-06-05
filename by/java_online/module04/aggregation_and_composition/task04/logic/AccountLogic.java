package by.java_online.module04.aggregation_and_composition.task04.logic;

import by.java_online.module04.aggregation_and_composition.task04.entity.Account;
import by.java_online.module04.aggregation_and_composition.task04.entity.AccountStatus;

import java.util.Comparator;
import java.util.List;

public class AccountLogic {
    public boolean checkAccount(Account account, String accountToSearch) {
        boolean isEqual = false;

        if (account.getAccountNumber().equalsIgnoreCase(accountToSearch)) {
            isEqual = true;
        }

        return isEqual;
    }

    public void sortByStatus(List<Account> accounts) {
        accounts.sort(Comparator.comparing(Account::getStatus));
    }

    public void sortByNumberAccount(List<Account> accounts) {
        accounts.sort(Comparator.comparing(Account::getAccountNumber));
    }

    public void sortByBalance(List<Account> accounts) {
        accounts.sort(Comparator.comparing(Account::getBalance));
    }

    public double findTotalBalance(List<Account> accounts) {
        double positiveBalance;
        double negativeBalance;
        double balance;

        positiveBalance = findPositiveBalance(accounts);
        negativeBalance = findNegativeBalance(accounts);

        balance = positiveBalance + negativeBalance;

        return balance;
    }

    public double findPositiveBalance(List<Account> accounts) {
        double balance = 0;

        for (Account account : accounts) {
            if (account.getBalance() >= 0) {
                balance += account.getBalance();
            }
        }
        return balance;
    }

    public double findNegativeBalance(List<Account> accounts) {
        double balance = 0;

        for (Account account : accounts) {
            if (account.getBalance() < 0) {
                balance += account.getBalance();
            }
        }
        return balance;
    }

    public void unlockAccount(List<Account> accounts, String accountToSearch) {
        for (Account account : accounts) {
            if (account.getAccountNumber().equalsIgnoreCase(accountToSearch)) {
                account.setStatus(AccountStatus.ACTIVE);
            }
        }
    }

    public void blockAccount(List<Account> accounts, String accountToSearch) {
        for (Account account : accounts) {
            if (account.getAccountNumber().equalsIgnoreCase(accountToSearch)) {
                account.setStatus(AccountStatus.BLOCKED);
            }
        }
    }
}