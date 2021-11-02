package data_structure.arrayList.Autoboxing_Unboxing.Banking;

import java.util.ArrayList;

public class Customer {
    private final String name;
    private ArrayList<Double> transactions;

    public Customer(String name, double initialAmount) {
        this.name = name;
        this.transactions = new ArrayList<>();
        addTransaction(initialAmount);
    }

    public void addTransaction(double amount){
//      Converting from primitive to object
//      this.transactions.add(Double.valueOf(amount));

//      Shortcut (Autoboxing)
        this.transactions.add(amount);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

}
