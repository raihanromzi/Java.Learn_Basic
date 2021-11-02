package data_structure.arrayList.Autoboxing_Unboxing.Banking;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("Bank Indonesia");

        bank.addBranch("Jakarta");

        bank.addCustomer("Jakarta","Raihan",1_000_000d);
        bank.addCustomer("Jakarta","Shindi",100_000d);

        bank.addCustomerTransaction("Jakarta","Raihan",100_000d);
        bank.addCustomerTransaction("Jakarta","Shindi",200_000d);

        bank.listCustomers("Jakarta",true);
    }
}
