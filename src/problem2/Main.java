package problem2;

public class Main {
    public static void main(String[] args) {
        Customer customer1=new Customer("Souhaib");
        Customer customer2=new Customer("Mohamed");
        Bank bank=new Bank("bank1");
        bank.addCustomer(customer1);
        bank.addCustomer(customer2);
        bank.addTransaction(10,customer1);
        bank.addTransaction(20,customer2);
        bank.addTransaction(-10,customer1);
        bank.addTransaction(-10,customer2);


    }
}
