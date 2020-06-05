package by.java_online.module04.simple_class_and_object.task08.logic;

import by.java_online.module04.simple_class_and_object.task08.entity.Customer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CustomerBaseLogic {
    public void sortCustomersByFullName(List<Customer> customers) {
        Collections.sort(customers, new Comparator<Customer>() {
            @Override
            public int compare(Customer o1, Customer o2) {
                String fullName1;
                String fullName2;

                fullName1 = o1.getSurname() + o1.getName() + o1.getPatronymic();
                fullName2 = o2.getSurname() + o2.getName() + o2.getPatronymic();

                return fullName1.compareToIgnoreCase(fullName2);
            }
        });
    }

    public List<Customer> getCustomersByCardNumber(List<Customer> customers, long bound1, long bound2) {
        List<Customer> list = new ArrayList<>();

        for (Customer customer : customers) {
            if (customer.getCardNumber() >= bound1 && customer.getCardNumber() <= bound2) {
                list.add(customer);
            }
        }

        list.sort(Comparator.comparing(Customer::getCardNumber));

        return list;
    }
}
