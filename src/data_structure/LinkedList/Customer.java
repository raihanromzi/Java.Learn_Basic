package data_structure.LinkedList;

public class Customer {
    private String name;
    private double balance;

    public Customer(String name, double balance) {
        setName(name);
        setBalance(balance);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
