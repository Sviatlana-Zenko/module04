package by.java_online.module04.aggregation_and_composition.task05.logic;

import by.java_online.module04.aggregation_and_composition.task05.bean.ClientRequest;
import by.java_online.module04.aggregation_and_composition.task05.bean.TypeOfMeal;
import by.java_online.module04.aggregation_and_composition.task05.bean.TypeOfTransport;
import by.java_online.module04.aggregation_and_composition.task05.bean.TravelVoucher;
import by.java_online.module04.aggregation_and_composition.task05.bean.VoucherBase;
import by.java_online.module04.aggregation_and_composition.task05.input.ClientInput;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class VoucherBaseLogic {
    ClientInput input = new ClientInput();

    public List<TravelVoucher> formListOfVouchersForClient(VoucherBase base, ClientRequest request) {
        List<TravelVoucher> list = new ArrayList<>();

        for (TravelVoucher voucher : base.getVouchers()) {
            if ((voucher.getTransport() == request.getTransport() | request.getTransport() == TypeOfTransport.ANY) &&
                    (voucher.getMeal() == request.getMeal() | request.getMeal() == TypeOfMeal.ANY) &&
                        (voucher.getNumberOfDays() <= request.getMaxNumberOfDays())) {

                list.add(voucher);
            }
        }

        if (list.size() != 0) {
            chooseTypeOfSorting(list);
        }

        return list;
    }

    public void chooseTypeOfSorting(List<TravelVoucher> list) {
        int maxOperationNumber;
        int clientChoice;

        System.out.println("Choose a sorting criteria:\n" +
                           "1 - sort by type of travel\n" +
                           "2 - sort by country name\n" +
                           "3 - sort by number of days\n" +
                           "4 - sort by cost\n" +
                           "5 - sort by type of transport\n" +
                           "6 - sort by type of meal\n" +
                           "0 - show the result without sorting");

        maxOperationNumber = 6;

        clientChoice = input.enterNumber(maxOperationNumber);

        switch (clientChoice) {
            case 1:
                sortByTypeOfTravel(list);
                break;
            case 2:
                sortByCountry(list);
                break;
            case 3:
                sortByNumberOfDays(list);
                break;
            case 4:
                sortByCost(list);
                break;
            case 5:
                sortByTransport(list);
                break;
            case 6:
                sortByMeal(list);
                break;
        }
    }

    public void sortByTypeOfTravel(List<TravelVoucher> list) {
        list.sort(Comparator.comparing(TravelVoucher::getType));
    }

    public void sortByCountry(List<TravelVoucher> list) {
        list.sort(Comparator.comparing(TravelVoucher::getCountry));
    }

    public void sortByNumberOfDays(List<TravelVoucher> list) {
        list.sort(Comparator.comparing(TravelVoucher::getNumberOfDays));
    }

    public void sortByCost(List<TravelVoucher> list) {
        list.sort(Comparator.comparing(TravelVoucher::getCost));
    }

    public void sortByTransport(List<TravelVoucher> list) {
        list.sort(Comparator.comparing(TravelVoucher::getTransport));
    }

    public void sortByMeal(List<TravelVoucher> list) {
        list.sort(Comparator.comparing(TravelVoucher::getMeal));
    }
}