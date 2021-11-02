package data_structure.arrayList.Autoboxing_Unboxing.Banking;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String customerName, double initialTransaction){
        if(findCustomer(customerName) == null){
            this.customers.add(new Customer(customerName, initialTransaction));
            return true;
        } else {
            return false;
        }
    }

    private Customer findCustomer(String customerName){
        for(int i = 0; i < customers.size();i++){
            Customer checkedCustomer = this.customers.get(i);
            if(checkedCustomer.getName().equals(customerName)){
                return checkedCustomer;
            }
        }
        return null;
    }

    public boolean addCustomerTransaction(String customerName, double transaction){
//      Grab the record of existing customer, we use Variable because we need to update the record for that customer
        Customer existingCustomer = findCustomer(customerName);
        if(findCustomer(customerName) != null){
            existingCustomer.addTransaction(transaction);
            return true;
        } else {
            return false;
        }
    }

}
