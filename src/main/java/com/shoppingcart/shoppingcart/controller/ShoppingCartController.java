package com.shoppingcart.shoppingcart.controller;

import com.shoppingcart.shoppingcart.model.ShoppingCart;
import com.shoppingcart.shoppingcart.service.ShoppingcartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/ShoppingCart")

public class ShoppingCartController {

//    @GetMapping("/get")
//    public String getAll(){
//        return "get details";
//    }

    @Autowired
    private ShoppingcartService shoppingCartService;


    @PostMapping("/create")
    public ResponseEntity<ShoppingCart> createProduct(@RequestBody ShoppingCart shoppingCart) {
        try{
            shoppingCartService.createShoppingCart(shoppingCart);
            return ResponseEntity.status(HttpStatus.CREATED).build();
        }catch(Exception e){
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


    @GetMapping("/getAll")
    public List<ShoppingCart> getShoppingCartdetForUser(){
//        List<ShoppingCart> listForUser = new ArrayList<>();
//        List<ShoppingCart> list = shoppingCartService.getAll();
//
//        for(ShoppingCart cart : list) {
//            if(userId.equals(cart.getUserId())) {
//                listForUser.add(cart);
//            }
//        }
//
//        return listForUser;
        return shoppingCartService.getAll();
    }
}
