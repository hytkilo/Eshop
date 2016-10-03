package net.togogo.egouweb1238.core.service.product;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import net.togogo.egouweb1238.core.domain.product.Product;

public interface IProductService {
	/**
	 * 插入操作
	 * @param Product
	 */
	public void save(Product Product);
	
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
