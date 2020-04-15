package com.scholanova.ecommerce.cart.service;

import com.scholanova.ecommerce.cart.entity.Cart;
import com.scholanova.ecommerce.cart.exception.CartException;
import com.scholanova.ecommerce.product.entity.Product;
import org.springframework.stereotype.Component;
import com.scholanova.ecommerce.product.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CartServiceImpl implements CartService{

    @Autowired
    ProductRepository productRepository;

    @Override
    public Cart addProductToCart(Cart cart, Long productId, int quantity) throws CartException {
        try {
            Product product = productRepository.findById(productId).get();
            return cart.addProduct(product, quantity);
        } catch ( Exception e ) {
            throw new CartException("Unable to add a product to the cart");
        }
    }

    @Override
    public Cart changeProductQuantity(Cart cart, Long productId, int quantity) throws CartException {
        try{
            Product p1 = productRepository.findById(productId).get();
            return cart.changeProductQuantity(p1 , quantity);
        }catch (Exception e){
            throw new CartException("Unable to modify product");
        }
    }
}
