package test;

import model.Customer;

public class CustomerTester {
    public static void main(String[] args){
        Customer customer;
        try {
            customer = new Customer("John","Smith", "smithglobal.com");
            System.out.println(customer);
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getLocalizedMessage());
        }
    }
}
