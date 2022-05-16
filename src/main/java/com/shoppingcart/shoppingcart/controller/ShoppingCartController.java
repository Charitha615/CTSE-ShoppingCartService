package com.shoppingcart.shoppingcart.controller;

import com.shoppingcart.shoppingcart.model.ShoppingCart;
import com.shoppingcart.shoppingcart.service.ShoppingcartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/Product")

public class ShoppingCartController {

//    @GetMapping("/get")
//    public String getAll(){
//        return "get details";
//    }

    @Autowired
    private ShoppingcartService shoppingCartService;

    @PostMapping("/create")
    public ShoppingCart addShoppingCart(ShoppingCart shoppingCart){
        return shoppingCartService.createShoppingCart(shoppingCart);
    }


    @GetMapping("/getAll/user/{userId}")
    public List<ShoppingCart> getShoppingCartdetForUser(@PathVariable String userId){
        List<ShoppingCart> listForUser = new ArrayList<>();
        List<ShoppingCart> list = shoppingCartService.getAll();

        for(ShoppingCart cart : list) {
            if(userId.equals(cart.getUserId())) {
                listForUser.add(cart);
            }
        }

        return listForUser;
    }
}
