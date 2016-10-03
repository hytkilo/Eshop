package net.togogo.egouweb1238.core.dao.product;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import net.togogo.egouweb1238.core.domain.product.Product;



public interface ProductDao {
	/**
	 * 插入操作
	 * @param Product
	 */
	@Insert(value="insert into bbs_product(name) values(#{name})")
	public void save(Product Product);
	
	/**
	 * 根据id删除数据
	 */
	@Delete(value="delete from bbs_product where id=#{id}")
	public void deleteById(int id);
	
	/**
	 * 根据id查询数据
	 */
	@Select(value="select * from bbs_product where id=#{id}")
	public Product get(int id);
	
	/**
	 * 查询所有数据
	 */
	@Select(value="select * from bbs_product")
	public List<Product> findAll();
	
}
