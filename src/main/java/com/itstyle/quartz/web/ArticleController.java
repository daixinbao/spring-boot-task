package com.itstyle.quartz.web;

import com.alibaba.fastjson.JSONObject;
import com.itstyle.quartz.entity.DsCategory;
import com.itstyle.quartz.entity.DsGoods;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by daixn on 2020/5/17 16:33
 */
@Controller
@RequestMapping("/article")
public class ArticleController {
    @RequestMapping("/list")
    public String list(ModelMap modelMap) {
        return  "articlelist";
    }
    @RequestMapping("/detail")
    public String detail(ModelMap modelMap,String id) {
        return  "articledetail";
    }
}
