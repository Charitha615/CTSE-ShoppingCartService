package com.shoppingcart.shoppingcart.service;

import com.shoppingcart.shoppingcart.model.ShoppingCart;
import com.shoppingcart.shoppingcart.repositary.ShoppingCartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShoppingcartService {
    @Autowired
    private ShoppingCartRepository shoppingCartRepository;

    public ShoppingCart createShoppingCart(ShoppingCart shoppinCart){
        return shoppingCartRepository.save(shoppinCart);
    }

    public List<ShoppingCart> getAll(){
        return shoppingCartRepository.findAll();
    }
}
