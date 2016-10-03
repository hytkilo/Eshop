package net.togogo.egouweb1238.core.service.product.impl;

import java.util.List;


import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import net.togogo.egouweb1238.core.dao.product.ProductDao;
import net.togogo.egouweb1238.core.domain.product.Product;
import net.togogo.egouweb1238.core.service.product.IProductService;
@Service(value="productService")
@Transactional(propagation=Propagation.REQUIRED,readOnly=true)
public class ProudctServiceImpl implements IProductService {

	@Resource
	private ProductDao productDao;
	
	public ProductDao getProductDao() {
		return productDao;
	}

	public void setProductDao(ProductDao productDao) {
		this.productDao = productDao;
	}

//	@Transactional(propagation=Propagation.REQUIRED,readOnly=true)
	@Override
	public void save(Product Product) {
		productDao.save(Product);

	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public Product get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> findAll() {
		
		return productDao.findAll();
	}

}
