package cn.togogo.eshop.core.controller.seller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by alex on 16-10-10.
 */
@Controller
@RequestMapping(value = "/seller")
public class FrameController {
    @RequestMapping(value="/top")
    public String to_top(){
        return "top";
    }
    @RequestMapping(value="/main")
    public String to_main(){
        return "main";
    }
    @RequestMapping(value="/left")
    public String to_left(){
        return "left";
    }
    @RequestMapping(value="/right")
    public String to_right(){
        return "right";
    }
    @RequestMapping(value="/frame/order_main")
    public String to_order_main(){
        return "frame/order_main";
    }
    @RequestMapping(value="/frame/order_left")
    public String to_order_left(){
        return "/frame/order_left";
    }
    @RequestMapping(value="/order/list")
    public String to_order_list(){
        return "/order/list";
    }
    @RequestMapping(value="/frame/product_main")
    public String to_product_main(){
        return "/frame/product_main";
    }
    @RequestMapping(value="/frame/product_left")
    public String to_frame_product_left(){
        return "/frame/product_left";
    }
}
