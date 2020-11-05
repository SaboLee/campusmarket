package top.sabolee.campus_market.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import top.sabolee.campus_market.bean.PageBean;
import top.sabolee.campus_market.entity.commom.GoodsCategory;

import java.util.ArrayList;

/**
 * 后台物品分类控制器
 */
@RequestMapping("/admin/goods_category")
@Controller
public class GoodsCategoryController {
    /**
     * 物品分类管理列表页面
     * @param name
     * @param pageBean
     * @param model
     * @return
     */
    @RequestMapping(value = "/list")
    public String list(@RequestParam(name = "naem",defaultValue = "") String name, PageBean<GoodsCategory> pageBean , Model model){
        model.addAttribute("title","物品分类列表");
        model.addAttribute("name",name);
        pageBean.setContent(new ArrayList<GoodsCategory>());
        model.addAttribute("pageBean",pageBean);
        return "admin/goods_category/list";
    }
    @RequestMapping(value = "/add",method = RequestMethod.GET)
    public String add(GoodsCategory goodsCategory , Model model){
        model.addAttribute("title","物品分类列表");

        return "admin/goods_category/add";
    }
}
