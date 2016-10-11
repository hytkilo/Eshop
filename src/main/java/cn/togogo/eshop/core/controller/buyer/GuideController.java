package cn.togogo.eshop.core.controller.buyer;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by alex on 16-10-10.
 */
@Controller(value = "buyerController")
@RequestMapping(value = "/buyer")
public class GuideController {
    @RequestMapping(value = "index")
    public String to_index() {
        return "/buyer/index";
    }

    @RequestMapping(value = "/change_password")
    public String to_change_password() {
        return "/buyer/change_password";
    }

    @RequestMapping(value = "/deliver_address")
    public String to_deliver_address() {
        return "/buyer/deliver_address";
    }
    @RequestMapping(value = "/orders")
    public String to_orders() {
        return "/buyer/orders";
    }
    @RequestMapping(value = "/profile")
    public String to_profile() {
        return "/buyer/profile";
    }
    @RequestMapping(value = "cart")
    public String to_cart() {
        return "/product/cart";
    }

    @RequestMapping(value = "/productOrder")
    public String to_productOrder() {
        return "/product/productOrder";
    }


}
