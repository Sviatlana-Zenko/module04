package by.java_online.module04.aggregation_and_composition.task05.view;

import by.java_online.module04.aggregation_and_composition.task05.bean.TravelVoucher;

import java.util.List;

public class TravelVoucherView {
    public void printListOfVouchers(List<TravelVoucher> list) {
        if (list.size() != 0) {
            System.out.println("Here's the list of travel vouchers that we can offer you:");

            for (TravelVoucher voucher : list) {
                System.out.println("Voucher type: " + voucher.getType() +
                                   ", country: " + voucher.getCountry() +
                                   ", number of days: " + voucher.getNumberOfDays() +
                                   ", cost: " + voucher.getCost() +
                                   ", type of transport: " + voucher.getTransport() +
                                   ", type of meal: " + voucher.getMeal());
            }
        } else {
            System.out.println("No travel vouchers found. " +
                               "Check your search criteria or try to change them.");
        }
    }
}
