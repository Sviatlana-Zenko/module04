package by.java_online.module04.aggregation_and_composition.task05.logic;

import by.java_online.module04.aggregation_and_composition.task05.bean.TypeOfMeal;
import by.java_online.module04.aggregation_and_composition.task05.bean.TypeOfTransport;
import by.java_online.module04.aggregation_and_composition.task05.input.ClientInput;

public class ClientRequestLogic {
    ClientInput input = new ClientInput();

    public TypeOfTransport getClientTransportRequest() {
        TypeOfTransport chosenTransport;
        int maxOperationNumber;
        int clientChoice;

        System.out.println("Please, choose transport:\n" +
                           "1 - airplane\n" +
                           "2 - bus\n" +
                           "3 - ship\n" +
                           "4 - train\n" +
                           "0 - any type");

        chosenTransport = null;
        maxOperationNumber = 4;

        clientChoice = input.enterNumber(maxOperationNumber);

        switch (clientChoice) {
            case 0:
                chosenTransport = TypeOfTransport.ANY;
                break;
            case 1:
                chosenTransport = TypeOfTransport.AIRPLANE;
                break;
            case 2:
                chosenTransport = TypeOfTransport.BUS;
                break;
            case 3:
                chosenTransport = TypeOfTransport.SHIP;
                break;
            case 4:
                chosenTransport = TypeOfTransport.TRAIN;
                break;
        }

        return chosenTransport;
    }

    public TypeOfMeal getClientMealRequest() {
        TypeOfMeal chosenMeal;
        int maxOperationNumber;
        int clientChoice;

        System.out.println("Please, choose type Of meal:\n" +
                           "1 - accommodation only\n" +
                           "2 - all inclusive\n" +
                           "3 - breakfast\n" +
                           "4 - full board\n" +
                           "5 - half board\n" +
                           "6 - ultra all inclusive\n" +
                           "0 - any type");

        chosenMeal = null;
        maxOperationNumber = 6;

        clientChoice = input.enterNumber(maxOperationNumber);

        switch (clientChoice) {
            case 0:
                chosenMeal = TypeOfMeal.ANY;
                break;
            case 1:
                chosenMeal = TypeOfMeal.ACCOMMODATION_ONLY;
                break;
            case 2:
                chosenMeal = TypeOfMeal.ALL_INCLUSIVE;
                break;
            case 3:
                chosenMeal = TypeOfMeal.BREAKFAST;
                break;
            case 4:
                chosenMeal = TypeOfMeal.FULL_BOARD;
                break;
            case 5:
                chosenMeal = TypeOfMeal.HALF_BOARD;
                break;
            case 6:
                chosenMeal = TypeOfMeal.ULTRA_ALL_INCLUSIVE;
                break;
        }

        return chosenMeal;
    }

    public int getTravelDurationRequest() {
        int maxTravelDuration;
        int clientChoice;
        
        maxTravelDuration = 30;

        System.out.println("How long do you plan to travel? (maximum number of days)");
        clientChoice = input.enterNumber(maxTravelDuration);

        return clientChoice;
    }
}