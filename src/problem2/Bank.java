package problem2;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Customer> customers;
    public Bank(String name){
        this.name=name;
        this.customers=new ArrayList<Customer>();
    }
    public Bank(String name,ArrayList<Customer> customers){
        this.name=name;
        this.customers=customers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(ArrayList<Customer> customers) {
        this.customers = customers;
    }
    public void addCustomer(Customer customer){
        if (!customers.contains(customer)){
            customers.add(customer);
        }
    }
    public void addTransaction(double transaction,Customer customer){
        if (customers.contains(customer)) {
            customer.getTransactions().add(transaction);
        }
        System.out.println("--------------------------------");
        System.out.println(customer.getName());
        System.out.println("Transactions : ");
        for(double trans: customer.getTransactions()){
            System.out.println(trans);
        }
        System.out.println("--------------------------------");

    }
}
