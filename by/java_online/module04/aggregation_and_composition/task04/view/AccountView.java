package by.java_online.module04.aggregation_and_composition.task04.view;

import by.java_online.module04.aggregation_and_composition.task04.entity.Account;
import by.java_online.module04.aggregation_and_composition.task04.entity.Client;
import by.java_online.module04.aggregation_and_composition.task04.logic.AccountLogic;

import java.util.List;

public class AccountView {
    AccountLogic logic = new AccountLogic();
    InfoOutput output = new InfoOutput();

    public void printFullInfoAboutClient(Client client) {
        System.out.print("Client: " + client.getName());

        for (Account account : client.getAccounts()) {
            System.out.println();
            output.showInfoAboutAccount(account);
        }

        output.showClientBalance(client.getAccounts());
    }

    public void printAccount(List<Account> accounts, String accountToSearch) {
        int counter = 0;

        for (Account account : accounts) {
            if (logic.checkAccount(account, accountToSearch)) {
                System.out.println();
                output.showInfoAboutAccount(account);
                counter++;
            }
        }

        if (counter <= 0) {
            output.showErrorMessage(accountToSearch);
        }
    }
}
