package cn.togogo.eshop.core.service.product;

import java.util.List;

import cn.togogo.eshop.core.domain.product.Product;

public interface IProductService {
	/**
	 * 插入操作
	 * @param product
	 */
	public void save(Product product);
	
	/**
	 * 根据id删除数据
	 */
	public void deleteById(int id);
	
	/**
	 * 根据id查询数据
	 */
	public Product get(int id);
	
	/**
	 * 查询所有数据
	 */
	public List<Product> findAll();
}
