package cn.togogo.eshop.core.controller.customer;

import cn.togogo.eshop.core.domain.product.SearchTemp;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by hyt on 16-10-3.
 */
@Controller
public class SearchController {


    @RequestMapping("/product/list/display")
    public String Search(SearchTemp  searchTemp, HttpServletRequest request){
            Map<String,Object> m = new HashMap<String, Object>();
            m.put("brandName",searchTemp.getBrandName());
            m.put("price",searchTemp.getPrice());
            m.put("type",searchTemp.getType());
            m.put("feature",searchTemp.getFeature());
            m.put("fitPerson",searchTemp.getFitPerson());
            request.getSession().setAttribute("Search",m);
            return "redirect:/front_page/product/product.jsp";
    }
}
