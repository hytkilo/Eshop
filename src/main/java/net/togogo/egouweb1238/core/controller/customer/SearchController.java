package net.togogo.egouweb1238.core.controller.customer;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by hyt on 16-10-3.
 */
@Controller
public class SearchController {


    @RequestMapping("/product/list/display")
    public String Search(String brandName ,String typeName){
        System.out.println(brandName);
        System.out.println(typeName);
            return "redirect:/front_page/product/product.jsp";
    }
}
