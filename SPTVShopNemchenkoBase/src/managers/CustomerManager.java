/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managers;

import entity.Customer;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class CustomerManager {
    private final Scanner scanner;

    public CustomerManager() {
        scanner = new Scanner(System.in);
    }

    public Customer createCustomer() {
        Customer customer = new Customer();
        System.out.print("Customer's name: ");
        customer.setFirstname(scanner.nextLine());
        System.out.print("Customer's lastname: ");
        customer.setLastname(scanner.nextLine());
        System.out.print("Phone number: ");
        customer.setPhone(scanner.nextLine());
        System.out.println("How much money in wallet? (has to be integer) ");
        customer.setMoney(scanner.nextInt());
        return customer;
    }

    public void printListCustomers(List<Customer> customers) {
        for (int i = 0; i < customers.size(); i++) {
            System.out.printf("%d. %s  %s,  Phone: %s,  Money: %d, %n",
                    i+1,
                    customers.get(i).getFirstname(),
                    customers.get(i).getLastname(),
                    customers.get(i).getPhone(),
                    customers.get(i).getMoney()
            );
        }
    }

    public void addBalance(List<Customer> customers) {
        System.out.println("Customers list: ");
        printListCustomers(customers);
        System.out.println("Choose customer's number: ");
        int numberCustomer = scanner.nextInt(); scanner.nextLine();
        
        System.out.printf("The customer has %d eur%n",customers.get(numberCustomer - 1).getMoney());
        System.out.println("How many would you like to deposite? (has to be integer):");
        int addBalance = scanner.nextInt(); scanner.nextLine();
        customers.get(numberCustomer - 1).setMoney(customers.get(numberCustomer - 1).getMoney() + addBalance);
    }
    
    
    
}
