package oop.constructor.bank;

public class VipCustomer {
    private String customerName;
    private long creditLimit;
    private String emailCustomer;

    public VipCustomer(String customerName, long creditLimit, String emailCustomer){
        this.customerName = customerName;
        this.creditLimit = creditLimit;
        this.emailCustomer = emailCustomer;
    }

    public VipCustomer() {
        this("null", 0, "email@customer.com");
    }

    public VipCustomer(String customerName, long creditLimit){
        this(customerName, creditLimit, "email@customer.com");
    }

    public String getCustomerName() {
        return customerName;
    }

    public long getCreditLimit() {
        return creditLimit;
    }

    public String getEmailCustomer() {
        return emailCustomer;
    }
}
