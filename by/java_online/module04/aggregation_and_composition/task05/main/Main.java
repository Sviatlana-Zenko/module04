/*
 * Туристические путевки. Сформировать набор предложений клиенту
 * по выбору туристической путевки различного типа (отдых, экскурсии,
 * лечение, шопинг, круиз и т.д.) для оптимального выбора.
 * Учитывать возможность выбора транспорта, питания и числа дней.
 * Реализовать выбор и сортировку путевок.
 */

package by.java_online.module04.aggregation_and_composition.task05.main;

import by.java_online.module04.aggregation_and_composition.task05.bean.*;
import by.java_online.module04.aggregation_and_composition.task05.logic.ClientRequestLogic;
import by.java_online.module04.aggregation_and_composition.task05.logic.VoucherBaseLogic;
import by.java_online.module04.aggregation_and_composition.task05.view.TravelVoucherView;

public class Main {
    public static void main(String[] args) {
        VoucherBase base = new VoucherBase();

        base.addVoucherToBase(new TravelVoucher(TypeOfTravel.EXCURSION, "Spain", 7, 450.99,
                                                TypeOfTransport.BUS, TypeOfMeal.BREAKFAST));

        base.addVoucherToBase(new TravelVoucher(TypeOfTravel.SHOPPING, "Italy", 3, 385.95,
                                                TypeOfTransport.BUS, TypeOfMeal.BREAKFAST));

        base.addVoucherToBase(new TravelVoucher(TypeOfTravel.CRUISE, "Bulgaria", 8, 580.5,
                                                TypeOfTransport.SHIP, TypeOfMeal.ALL_INCLUSIVE));

        base.addVoucherToBase(new TravelVoucher(TypeOfTravel.RECREATION, "Turkey", 7, 500.5,
                                                TypeOfTransport.AIRPLANE, TypeOfMeal.ALL_INCLUSIVE));

        base.addVoucherToBase(new TravelVoucher(TypeOfTravel.SAFARI, "South Africa", 5, 650.15,
                                                TypeOfTransport.AIRPLANE, TypeOfMeal.HALF_BOARD));

        base.addVoucherToBase(new TravelVoucher(TypeOfTravel.EXTREME, "Antarctica", 14, 1890.5,
                                                TypeOfTransport.AIRPLANE, TypeOfMeal.FULL_BOARD));

        base.addVoucherToBase(new TravelVoucher(TypeOfTravel.RECREATION, "Thailand", 7, 750.00,
                                                TypeOfTransport.AIRPLANE, TypeOfMeal.ULTRA_ALL_INCLUSIVE));

        base.addVoucherToBase(new TravelVoucher(TypeOfTravel.EXCURSION, "Poland", 4, 350.45,
                                                TypeOfTransport.TRAIN, TypeOfMeal.ACCOMMODATION_ONLY));

        base.addVoucherToBase(new TravelVoucher(TypeOfTravel.RECREATION, "Israel", 7, 654.9,
                                                TypeOfTransport.AIRPLANE, TypeOfMeal.FULL_BOARD));

        base.addVoucherToBase(new TravelVoucher(TypeOfTravel.CRUISE, "Greece", 9, 678.35,
                                                TypeOfTransport.SHIP, TypeOfMeal.ALL_INCLUSIVE));

        ClientRequestLogic requestLogic = new ClientRequestLogic();

        ClientRequest request = new ClientRequest();

        request.setTransport(requestLogic.getClientTransportRequest());
        request.setMeal(requestLogic.getClientMealRequest());
        request.setMaxNumberOfDays(requestLogic.getTravelDurationRequest());

        VoucherBaseLogic baseLogic = new VoucherBaseLogic();
        TravelVoucherView voucherView = new TravelVoucherView();

        voucherView.printListOfVouchers(baseLogic.formListOfVouchersForClient(base, request));
    }
}