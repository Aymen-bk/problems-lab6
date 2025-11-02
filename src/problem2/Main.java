package problem2;

public class Main {
    public static void main(String[] args) {
        Customer c1 = new Customer("Ay");
        Customer c2 =  new Customer("B");
        Bank bank = new Bank("bank1");
        bank.addCustomer(c1);
        bank.addCustomer(c2);
        bank.addTransaction(15,c1);
        bank.addTransaction(17,c2);
        bank.addTransaction(-5,c1);
        bank.addTransaction(-10,c2);
    }
}
