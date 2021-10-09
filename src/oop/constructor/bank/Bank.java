package oop.constructor.bank;

public class Bank {
    private long accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private long phoneNumber;

    // Constructor -> exact name of class

    // Make default if the parameter is null
    // If the parameter is null, this constructor will be default value
    public Bank(){
        this(0, 0.0, "Null name", "null@mail.com", 0);
    }

    // Overloaded Constructor
    public Bank(long accountNumber, double balance, String customerName,
                String email, long phoneNumber){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public Bank(String customerName, String email, long phoneNumber) {
        // Call main constructor and replace the customer name, email, dan phone number with new value
        this(000000, 0.0, customerName, email, phoneNumber);
    }

    public double getBalance() {
        return balance;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(double funds){
        this.balance += funds;
    }

    public void withdrawal(double draw){
        if(draw > this.balance){
            System.out.println("Your balance is insufficient");
        } else {
            this.balance -= draw;
        }
    }
}
