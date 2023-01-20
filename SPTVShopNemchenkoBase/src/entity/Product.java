/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author pupil
 */
@Entity
public class Product implements Serializable{
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String producer;
    private int inStoreQty;
    private int price;

    public Product() {
    }

    public Product(String title, String manufacturer, int amountShop, int price) {
        this.title = title;
        this.producer = manufacturer;
        this.inStoreQty = amountShop;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getInStoreQty() {
        return inStoreQty;
    }

    public void setInStoreQty(int inStoreQty) {
        this.inStoreQty = inStoreQty;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" 
                + title 
                + ", producer: " + producer 
                + ", items in store: " + inStoreQty 
                + ", price: " + price 
                + '}';
    }

    
    
}
