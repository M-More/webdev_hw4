package com.baowei.webhw4.controller;

import java.sql.Array;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.baowei.webhw4.service.BookService;
import com.baowei.webhw4.service.OrderItemService;
import com.baowei.webhw4.service.CartService;
import com.baowei.webhw4.service.OrderService;
import com.baowei.webhw4.vo.Cart;
import com.baowei.webhw4.vo.Book;
import com.baowei.webhw4.vo.OrderItem;
import org.aspectj.weaver.ast.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/orderitem")
public class OrderItemController {
    @Autowired
    private OrderItemService orderItemService;

    @Autowired
    private CartService cartService;

    @Autowired
    private OrderService orderService;

    @Autowired
    private BookService bookService;

    @RequestMapping("/create")
    public void create() {
        UserDetails userDetails = (UserDetails) SecurityContextHolder.getContext()
                .getAuthentication()
                .getPrincipal();
        String username = userDetails.getUsername();

        Timestamp nowtime= Timestamp.valueOf(LocalDateTime.now());
        orderService.createOrder(username,nowtime);

        List<Cart> cartlist = cartService.findCartbyUsername(username);
        int ordernum = orderService.getMaxNum().getNum();
        for (int i = 0; i < cartlist.size(); i++) {
            orderItemService.createOrderItem(ordernum,
                    cartlist.get(i).getBookname(), cartlist.get(i).getIsbn(), cartlist.get(i).getAmount());

            Book book = bookService.findBookByIsbn(cartlist.get(i).getIsbn());
            int inventory_new = book.getInventory()-cartlist.get(i).getAmount();    //计算更新后的库存
            bookService.updateBook(book.getBookname(),book.getAuthor(),book.getIsbn(),book.getPress(),
                    book.getSize(),book.getPubtime(),book.getIntro(),inventory_new);

        }

        cartService.clearCart(username);    //清空购物车
    }

}
