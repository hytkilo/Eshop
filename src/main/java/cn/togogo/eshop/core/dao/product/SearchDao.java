package cn.togogo.eshop.core.dao.product;

import cn.togogo.eshop.core.domain.product.Product;
import cn.togogo.eshop.core.domain.product.SearchTemp;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by hyt on 16-10-3.
 */
public interface SearchDao {
    @Select(value = "")
    List<Product> findAll(SearchTemp searchTemp);
}
