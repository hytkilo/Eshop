package cn.togogo.eshop.core.controller.seller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 实现用户访问页面跳转
 * @author stone
 *
 */
@Controller
public class GuideController {

	/**
	 * 跳转到商家后台首页
	 * @return
	 */
	@RequestMapping(value="/seller/index")
	public String index(){
		return "index";
	}
	/**
	 * 跳转到商家后台登录界面
	 * @return
	 */
	@RequestMapping(value="/seller/login")
	public String login(){
		return "index";
	}
	/**
	 * 跳转到商家增加商品页面
	 * @return
	 */
	@RequestMapping(value="/seller/product/toAdd")
	public String toAddProduct(){
		return "product/add";
	}
	/**
	 * 跳转到商家显示商品列表页面
	 * @return
	 */
	@RequestMapping(value="/seller/product/list")
	public String toListProduct(){
		return "product/list";
	}
}
