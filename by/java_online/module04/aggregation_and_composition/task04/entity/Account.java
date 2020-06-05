package by.java_online.module04.aggregation_and_composition.task04.entity;

public class Account {
    private AccountStatus status;
    private String accountNumber;
    private double balance;

    public Account() {
    }

    public Account(AccountStatus status, String accountNumber, double balance) {
        this.status = status;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public AccountStatus getStatus() {
        return status;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setStatus(AccountStatus status) {
        this.status = status;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " {" +
                "status: " + status +
                ", accountNumber: " + accountNumber +
                ", balance: " + balance +
                "}";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((accountNumber == null) ? 0 : accountNumber.hashCode());
        long temp;
        temp = Double.doubleToLongBits(balance);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + ((status == null) ? 0 : status.hashCode());
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
        Account other = (Account) obj;
        if (accountNumber == null) {
            if (other.accountNumber != null)
                return false;
        } else if (!accountNumber.equals(other.accountNumber))
            return false;
        if (Double.doubleToLongBits(balance) != Double.doubleToLongBits(other.balance))
            return false;
        if (status != other.status)
            return false;
        return true;
    }
}