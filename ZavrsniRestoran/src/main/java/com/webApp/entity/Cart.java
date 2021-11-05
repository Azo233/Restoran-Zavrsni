package com.webApp.entity;


import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


public class Cart {

    private final List<CartItem> items;

    private double total;

    public Cart() {
        items = new ArrayList<>();
        total = 0;
    }

    public CartItem getItem(Jelo jelo){
        for (CartItem item : items){
            if(item.getJelo().getId_jelo() == jelo.getId_jelo()){
                return item;
            }
        }
        return null;
    }

    public List<CartItem> getItems() {
        return items;
    }

    public int getItemCount(){
        return items.size();
    }

    public void addItem(CartItem item){
        addItem(item.getJelo(), item.getQuantity());
    }


    public void addItem(Jelo jelo, int quantity){
        CartItem item = getItem(jelo);

        if (item != null){
            item.setQuantity(item.getQuantity() + quantity);
        } else {
            item = new CartItem(jelo);
            item.setQuantity(quantity);
            items.add(item);
        }
    }

    public void updateItem(Jelo jelo, int quantity){ // throws ProductNotFoundException
        CartItem item = getItem(jelo);

        if (item != null){
            item.setQuantity(quantity);
        } else {
            // throw new ProductNotFoundException();
        }
    }

    public void removeItem(Jelo jelo){ // throws ProductNotFoundException
        CartItem item = getItem(jelo);

        if (item != null){
            items.remove(item);
        } else {
            // throw new ProductNotFoundException();
        }
    }

    public void clear(){
        items.clear();
        total = 0;
    }

    public boolean isEmpty(){
        return items.isEmpty();
    }

    public double getTotal(){
        total = 0;
        for (CartItem item : items) {
            total += item.getSubTotal();
        }
        return total;
    }
}
