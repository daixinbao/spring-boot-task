package com.itstyle.quartz.service;


import com.itstyle.quartz.entity.DsCategory;
import com.itstyle.quartz.entity.DsGoods;
import com.itstyle.quartz.entity.GoodsAttr;

import java.util.List;

public interface IDShuaService {
    List<DsGoods> findValidDsGoods();
    List<DsCategory> findValidDsCategory();
    List<GoodsAttr> findGoodsAttrList(String goodId);
}
