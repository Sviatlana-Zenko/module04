/*
 * Счета. Клиент может иметь несколько счетов в банке.
 * Учитывать возможность блокировки/разблокировки счета.
 * Реализовать поиск и сортировку счетов. Вычисление общей
 * суммы по счетам. Вычисление суммы по всем счетам, имеющим
 * положительный и отрицательный балансы отдельно.
 */

package by.java_online.module04.aggregation_and_composition.task04.main;

import by.java_online.module04.aggregation_and_composition.task04.entity.Account;
import by.java_online.module04.aggregation_and_composition.task04.entity.AccountStatus;
import by.java_online.module04.aggregation_and_composition.task04.logic.AccountLogic;
import by.java_online.module04.aggregation_and_composition.task04.view.AccountView;
import by.java_online.module04.aggregation_and_composition.task04.entity.Client;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        AccountLogic logic = new AccountLogic();
        AccountView view = new AccountView();

        List<Account> accounts = new ArrayList<>();
        accounts.add(new Account(AccountStatus.ACTIVE, "BY24ABCD21547249741924576589", 1152.14));
        accounts.add(new Account(AccountStatus.ACTIVE, "BY14HBGV11247249741354876589", 514.01));
        accounts.add(new Account(AccountStatus.BLOCKED, "BY44KLKM15487245871354876265", -141.15));
        accounts.add(new Account(AccountStatus.BLOCKED, "BY01ABDD30147249020211116589", -325.99));

        Client client = new Client("Ivanov I.I.");
        client.setAccounts(accounts);

        view.printFullInfoAboutClient(client);

        String accountToSearch = "BY44KLKM15487245871354876265";

        System.out.print("\nFind account and change its status:");
        view.printAccount(client.getAccounts(), accountToSearch);

        logic.unlockAccount(client.getAccounts(), accountToSearch);

        view.printAccount(client.getAccounts(), accountToSearch);
    }
}
