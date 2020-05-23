package com.itstyle.quartz.web;
import com.alibaba.druid.support.json.JSONUtils;
import com.alibaba.fastjson.JSONObject;
import com.itstyle.quartz.entity.DsCategory;
import com.itstyle.quartz.entity.DsGoods;
import com.itstyle.quartz.entity.GoodsAttr;
import com.itstyle.quartz.service.IDShuaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 通用访问拦截匹配
 * 创建时间	2018年4月3日
 */
@Controller
public class IndexController {
	@Autowired
	private IDShuaService iDShuaService;

	@RequestMapping("/index")
	public String index(ModelMap modelMap) {

		List<DsCategory> validDsCategory = iDShuaService.findValidDsCategory();
		List<DsGoods> validDsGoods = iDShuaService.findValidDsGoods();
		Map<String, List<DsGoods>> cMap = validDsGoods.stream().collect(Collectors.groupingBy(DsGoods::getCategoryId));
		modelMap.put("validDsCategory",validDsCategory);
		JSONObject cJson=(JSONObject) JSONObject.toJSON(cMap);
		modelMap.put("validDsCategoryMap",cJson);

		Map<String, List<DsGoods>> gMap = validDsGoods.stream().collect(Collectors.groupingBy(DsGoods::getId));
		JSONObject gJson=(JSONObject) JSONObject.toJSON(gMap);
		modelMap.put("validDsGoodsMap",gJson);
		return  "dshua";
	}

	@RequestMapping("/getGoodsAttrList")
	@ResponseBody
	public List<GoodsAttr> getGoodsAttrList(String goodId){
		List<GoodsAttr> goodsAttrList = iDShuaService.findGoodsAttrList(goodId);
		return goodsAttrList;
	}

	@RequestMapping("{module}/{url}.shtml")
	public String page(@PathVariable("module") String module,@PathVariable("url") String url) {
		return module + "/" + url;
	}
	
}
