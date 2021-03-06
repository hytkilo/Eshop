package cn.togogo.test;

import java.util.List;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.togogo.eshop.core.dao.product.ProductDao;
import cn.togogo.eshop.core.domain.product.Product;
import cn.togogo.eshop.core.service.product.IProductService;

public class SpringMybatisTest{
	private ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

	
	@Test
	public void testQuery(){
		ProductDao productDao = (ProductDao) context.getBean("productDao");
		List<Product> products = productDao.findAll();
		for(Product p:products){
			System.out.println(p);
		}
	}
	
	@Test
	public void testSave(){
		IProductService productService = (IProductService) context.getBean("productService");
		Product product = new Product();
		product.setName("华为手机");
		productService.save(product);
	}
}
