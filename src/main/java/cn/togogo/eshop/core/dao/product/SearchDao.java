package cn.togogo.eshop.core.dao.product;

import cn.togogo.eshop.core.domain.product.Product;
import cn.togogo.eshop.core.domain.product.SearchTemp;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by hyt on 16-10-3.
 */
public interface SearchDao {
//    @Select(value = "(select id from bbs_brand where name = #{searchTemp.brandName})" +
//            "(select id from bbs_type where name = #{searchTemp.type})" +
//            "select id from bbs_feature where name = #{searchTemp.feature}" +
//            "select ")
    @Select("select * from bbs_product where id = 275")
    List<Product> findByTemp(SearchTemp searchTemp);
    @Select(value = "select * from bbs_product")
    List<Product> findAll();
    @Select(value = "select * from bbs_product where id = #{id}")
    Product getProduct(int id);
}
