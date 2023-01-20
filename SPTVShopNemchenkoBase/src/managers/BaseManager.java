/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managers;

import entity.Customer;
import entity.Product;
import entity.Orders;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import managers.interfaces.SaveManagerInterface;

/**
 *
 * @author Kasutaja
 */
public class BaseManager implements SaveManagerInterface{
    private EntityManagerFactory emf;
    private EntityManager em;

    public BaseManager() {
        emf = Persistence.createEntityManagerFactory("JKTV21MarketKrylovPU");
        em = emf.createEntityManager();
    }

    @Override
   public void saveCustomers(List<Customer> customers) {
       em.getTransaction().begin();
       for (int i = 0; i < customers.size(); i++) {
           Customer customer = customers.get(i);
           if(customer.getId() == null){
                em.persist(customer);
            }else{
                em.merge(customer);
            }
       }
       em.getTransaction().commit();
   }
   
    @Override
   public List<Customer> loadCustomers() {
       return em.createQuery("SELECT c FROM Customer c").getResultList();
   }
   
    @Override
   public void saveProducts(List<Product> products) {
       em.getTransaction().begin();
       for (int i = 0; i < products.size(); i++) {
           Product product = products.get(i);
           if(product.getId() == null){
                em.persist(product);
            }else{
                em.merge(product);
            }
       }
       em.getTransaction().commit();
   }
   
    @Override
   public List<Product> loadProducts() {
       return em.createQuery("SELECT pr FROM Product pr").getResultList();
   }
   
    @Override
   public void savePurchases(List<Orders> purchases) {
        em.getTransaction().begin();
       for (int i = 0; i < purchases.size(); i++) {
           Orders purchase = purchases.get(i);
           if(purchase.getId() == null){
                em.persist(purchase);
            }else{
                em.merge(purchase);
            }
       }
       em.getTransaction().commit();
   }
   
    @Override
   public List<Orders> loadPurchases() {
       return em.createQuery("SELECT pu FROM Orders pu").getResultList();
   }
    
}
