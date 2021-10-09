package oop.constructor.bank;

public class Main {
    public static void main(String[] args) {

        // Test empty Constructor
        Bank bankEmpty = new Bank();

        System.out.println("Account number= " + bankEmpty.getAccountNumber());
        System.out.println("Your balance= " + bankEmpty.getBalance());
        System.out.println("Name= " + bankEmpty.getCustomerName());
        System.out.println("Email= " + bankEmpty.getEmail());
        System.out.println("Phone number= " + bankEmpty.getPhoneNumber());
        System.out.println();

        Bank bank = new Bank(1234567890, 0.0, "Alfred Bucks",
                "myemail@alfred.com", 987654321 );

        // With constructor, we don't need setter
        /*
        bank.setAccountNumber(1234567890);
        bank.setBalance(1_000_000);
        bank.setCustomerName("Alfred Bucks");
        bank.setEmail("alfredbucks@gmail.com");
        bank.setPhoneNumber(987654321);
         */
        
        System.out.println("Account number= " + bank.getAccountNumber());
        System.out.println("Your balance= " + bank.getBalance());
        System.out.println("Name= " + bank.getCustomerName());
        System.out.println("Email= " + bank.getEmail());
        System.out.println("Phone number= " + bank.getPhoneNumber());

        bank.depositFunds(500_000);
        System.out.println("Your balance total (after add)= " + bank.getBalance());

        bank.withdrawal(1_500_000);
        System.out.println("Your balance total (after withdraw)= " + bank.getBalance());

        Bank rBank = new Bank("Tim", "r@email.com", 9876);
        System.out.println("Default value is " + rBank.getBalance());

        System.out.println();
        System.out.println();
        
        // Only update email, the other field will be default
        VipCustomer newVip1 = new VipCustomer();
        System.out.println("Default value name is " + newVip1.getCustomerName()); //null
        System.out.println("Default credit limit is " + newVip1.getCreditLimit());  //0
        System.out.println("Default email is " + newVip1.getEmailCustomer());

        // Only update customer name and credit limit
        VipCustomer newVip2 = new VipCustomer("Tim", 1234);
        System.out.println("Default email is " + newVip2.getEmailCustomer()); //default email

        //Update all field
        VipCustomer newVip3 = new VipCustomer("Alfred", 99999,
                "alfred@email.com");
        System.out.println("Updated name " + newVip3.getCustomerName());
        System.out.println("Updated credit limit is " + newVip3.getCreditLimit());
        System.out.println("Updated email is " + newVip3.getEmailCustomer());
    }
}
