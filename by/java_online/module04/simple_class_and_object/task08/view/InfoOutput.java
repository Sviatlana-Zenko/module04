package by.java_online.module04.simple_class_and_object.task08.view;

import by.java_online.module04.simple_class_and_object.task08.entity.Customer;

public class InfoOutput {
    public void showInfoAboutCustomer(Customer customer) {
        System.out.println("- id: " + customer.getId() +
                           ", full name: " + customer.getSurname() + " " +
                           customer.getName() + " " + customer.getPatronymic() +
                           ", address: " + customer.getAddress() +
                           ", card number: " + customer.getCardNumber() +
                           ", account number: " + customer.getBankAccount());
    }

    public void showErrorMessage() {
        System.out.println("No customers found. Check your search criteria or try to change them.");
    }
}
