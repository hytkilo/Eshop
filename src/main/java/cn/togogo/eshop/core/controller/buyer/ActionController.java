package cn.togogo.eshop.core.controller.buyer;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by alex on 16-10-11.
 */
@Controller
@RequestMapping(value = "/buyer")
public class ActionController {
    @RequestMapping(value = "/confirmOrder")
    public String a(String paymentWay){
        System.out.println("付款方式:"+paymentWay);
        return "/product/confirmOrder";
    }
}
