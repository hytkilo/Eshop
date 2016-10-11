package cn.togogo.eshop.core.controller.buyer;

import cn.togogo.eshop.core.dao.product.SearchDao;
import cn.togogo.eshop.core.domain.product.Product;
import cn.togogo.eshop.core.domain.product.SearchTemp;
import com.google.gson.Gson;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * Created by hyt on 16-10-3.
 */
@Controller
public class SearchController {
    @Resource
    private SearchDao searchDao;
    private Gson gson = new Gson();
    public SearchDao getSearchDao() {
        return searchDao;
    }

    public void setSearchDao(SearchDao searchDao) {
        this.searchDao = searchDao;
    }

    @RequestMapping("/product/list/display")
    public String Search(SearchTemp searchTemp, HttpServletResponse response,HttpServletRequest request, String brandName, String fitPerson, String type, String feature, String price){
        List<Product> list = null;
        System.out.println(searchTemp);
        if ("".equals(brandName)&&"".equals(fitPerson)&&"".equals(type)&&"".equals(feature)&&"".equals(price)){
            list = searchDao.findAll();
        }else
            list = searchDao.findAll();
//            list=searchDao.findByTemp(searchTemp);
        for (Product p :list
             ) {
            System.out.println(p);
        }
        request.getSession().setAttribute("ListProduct",list);
        request.getSession().setAttribute("brandName",brandName);
        request.getSession().setAttribute("fitPerson",fitPerson);
        request.getSession().setAttribute("type",type);
        request.getSession().setAttribute("feature",feature);
        request.getSession().setAttribute("price",price);
            return "redirect:/front_page/product/product.jsp";
    }
    @RequestMapping("/product/list/go")
    public void Go(HttpServletRequest request,HttpServletResponse response) throws IOException {
        List<Product> list= (List<Product>) request.getSession().getAttribute("ListProduct");
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String json = gson.toJson(list);
        System.out.println(json);
        out.print(json);
        out.flush();
        out.close();
    }
    @RequestMapping("/product/list/detail")
    public void Do(HttpServletRequest request , HttpServletResponse response){
        Product product = searchDao.getProduct(Integer.parseInt(request.getParameter("id")));
        String json = gson.toJson(product);
        System.out.println(json);
        response.setContentType("text/html;charset=UTF-8");
        try {
            PrintWriter out = response.getWriter();
            out.print(json);
            out.flush();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @RequestMapping("/product/list/cart")
    public void listCart(HttpServletRequest request,HttpServletResponse response){

        response.setContentType("text/html;charset=UTF-8");
        String goodId = request.getParameter("goodId");
        String sizeId = request.getParameter("sizeId");
        String mount = request.getParameter("mount");
        String color = request.getParameter("color");
        System.out.println(goodId+"``````"+sizeId+"`````"+mount+"`````"+color);
        Cookie[] cookies = request.getCookies();
        for (Cookie cookie:cookies
             ) {

        }
    }
}
