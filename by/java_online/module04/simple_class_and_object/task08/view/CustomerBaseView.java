package by.java_online.module04.simple_class_and_object.task08.view;

import by.java_online.module04.simple_class_and_object.task08.entity.Customer;
import by.java_online.module04.simple_class_and_object.task08.entity.CustomerBase;

import java.util.List;

public class CustomerBaseView {
    InfoOutput output = new InfoOutput();

    public void printFullListOfCustomers(CustomerBase base) {
        System.out.println(base.getBaseTitle() + ":");

        for (Customer customer : base.getCustomers()) {
            output.showInfoAboutCustomer(customer);
        }

        System.out.println();
    }

    public void printCustomersByCardNumber(List<Customer> customers) {
        if (customers.size() != 0) {
            for (Customer customer : customers) {
                output.showInfoAboutCustomer(customer);
            }
        } else {
            output.showErrorMessage();
        }

        System.out.println();
    }
}
