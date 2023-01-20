/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;

/**
 *
 * @author pupil
 */
@Entity
public class Orders implements Serializable{
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne(cascade = {CascadeType.MERGE})
    private Customer customer;
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date orderDate;
    @OneToOne (cascade = {CascadeType.MERGE})
    private Product product;
    private int soldItems;
    private int priceCustomer;

    public Orders() {
    }

    public Orders(Customer customer, Date takeOfProduct, Product product, int amountCustomer, int priceCustomer) {
        this.customer = customer;
        this.orderDate = takeOfProduct;
        this.product = product;
        this.soldItems = amountCustomer;
        this.priceCustomer = priceCustomer;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getSoldItems() {
        return soldItems;
    }

    public void setSoldItems(int soldItems) {
        this.soldItems = soldItems;
    }

    public int getPriceCustomer() {
        return priceCustomer;
    }

    public void setPriceCustomer(int priceCustomer) {
        this.priceCustomer = priceCustomer;
    }

    @Override
    public String toString() {
        return "Order{" 
                + "\n"
                +  customer 
                + "\n"
                + " order date: " + orderDate 
                + "\n"
                + "," + product 
                + "\n"
                + "quantity sold: " + soldItems 
//                + ", priceCustomer: " + priceCustomer 
                + '}'
                + "\n";
    }

    
    
}
