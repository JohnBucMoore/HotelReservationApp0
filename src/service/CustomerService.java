package service;

import model.Customer;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class CustomerService {
    public Map<String, Customer> mapOfCustomers = new HashMap<String, Customer>();
    public CustomerService() {}

    public void addCustomer(String firstName, String lastName, String email) {
        Customer customer = new Customer(firstName, lastName, email);
        mapOfCustomers.put(customer.getEmail(), customer);
    }

    public Customer getCustomer(String email) {
        mapOfCustomers.get(email);
    }

    public Collection<Customer> getAllCustomers() {
        for (Customer customer : mapOfCustomers.values()) {
            System.out.println(customer.toString());
        }
    }
}
