package com.helloshop.order;

import com.helloshop.user.User;
import com.helloshop.product.Product;

//주문
public class OrderService {

    public void order() {
        User user = new User(); // 회원
        Product product = new Product(); // 상품
        Order order = new Order(user, product); // 주문
    }
}
