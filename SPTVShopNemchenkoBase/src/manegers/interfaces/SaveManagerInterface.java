/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managers.interfaces;

import entity.Customer;
import entity.Product;
import entity.Orders;
import java.util.List;

/**
 *
 * @author Kasutaja
 */
public interface SaveManagerInterface {
    public void saveCustomers(List<Customer> customers);
    public List<Customer> loadCustomers();
    public void saveProducts(List<Product> products);
    public List<Product> loadProducts();
    public void savePurchases(List<Orders> purchases);
    public List<Orders> loadPurchases();
}