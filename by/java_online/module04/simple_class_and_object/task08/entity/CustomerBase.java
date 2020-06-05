package by.java_online.module04.simple_class_and_object.task08.entity;

import java.util.ArrayList;
import java.util.List;

public class CustomerBase {
    private String baseTitle;
    private List<Customer> customers;

    public CustomerBase() {
        customers = new ArrayList<>();
    }

    public CustomerBase(String baseTitle) {
        this.baseTitle = baseTitle;
        this.customers = new ArrayList<>();
    }

    public CustomerBase(String baseTitle, List<Customer> customers) {
        this.baseTitle = baseTitle;
        this.customers = customers;
    }

    public void addCustomerToBase(Customer customer) {
        customers.add(customer);
    }

    public String getBaseTitle() {
        return baseTitle;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setBaseTitle(String baseTitle) {
        this.baseTitle = baseTitle;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "baseTitle: " + baseTitle + "," +
                "customers: " + customers +
                "}";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((baseTitle == null) ? 0 : baseTitle.hashCode());
        result = prime * result + ((customers == null) ? 0 : customers.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        CustomerBase other = (CustomerBase) obj;
        if (baseTitle == null) {
            if (other.baseTitle != null)
                return false;
        } else if (!baseTitle.equals(other.baseTitle))
            return false;
        if (customers == null) {
            if (other.customers != null)
                return false;
        } else if (!customers.equals(other.customers))
            return false;
        return true;
    }
}