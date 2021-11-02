package data_structure.arrayList.Autoboxing_Unboxing.Banking;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<>();
    }

    public boolean addBranch(String branchName){
        if (findBranch(branchName) == null){
            branches.add(new Branch(branchName));
            return true;
        } else {
            return false;
        }
    }

    public boolean addCustomer(String branchName, String customerName, double initialTransaction){
        Branch branch = findBranch(branchName);
        if(branch != null){
            branch.newCustomer(customerName, initialTransaction);
            return true;
        } else {
            return false;
        }
    }

    private Branch findBranch(String branchName){
        for(int i = 0; i < branches.size(); i++){
            Branch checkedBranch = branches.get(i);
            if(checkedBranch.getName().equals(branchName)){
                return checkedBranch;
            }
        }
        return null;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double transaction){
        Branch branch = findBranch(branchName);
        if(branch != null){
            branch.addCustomerTransaction(customerName, transaction);
            return true;
        }
        return false;
    }


    public void listCustomers(String branchName, boolean showTransaction){
        Branch branch = findBranch(branchName);
        if(branch != null){
            System.out.println("Customers details for branch " + branch.getName());
            ArrayList<Customer> branchCustomers = branch.getCustomers();

            for(int i = 0; i < branchCustomers.size(); i++){
                Customer branchCustomer = branchCustomers.get(i);
                System.out.println("Customer : " + branchCustomer.getName() + "[" + (i + 1) + "]");

                if(showTransaction){
                    System.out.println("Transactions");
                    ArrayList<Double> branchTransaction = branchCustomer.getTransactions();

                    for(int j = 0; j < branchTransaction.size();j++){
                        System.out.println("[" + (j + 1) + "] Amount " + branchTransaction.get(j));
                    }
                } else {
                    System.out.println("Sorry you can't see the transaction");
                }
                System.out.println();
            }
        } else {
            System.out.println("Branch not existed!");
        }
    }
}
