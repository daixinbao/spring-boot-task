package com.itstyle.quartz.service.impl;

import com.itstyle.quartz.dao.DsCategoryDao;
import com.itstyle.quartz.dao.DsGoodsDao;
import com.itstyle.quartz.dao.GoodsAttrDao;
import com.itstyle.quartz.entity.DsCategory;
import com.itstyle.quartz.entity.DsGoods;
import com.itstyle.quartz.entity.GoodsAttr;
import com.itstyle.quartz.service.IDShuaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("iDShuaService")
public class DShuaServiceService implements IDShuaService{
    @Resource
    private DsCategoryDao dsCategoryDao;
    @Resource
    private DsGoodsDao dsGoodsDao;
    @Resource
    private GoodsAttrDao goodsAttrDao;
    @Override
    public List<DsGoods> findValidDsGoods() {
        return dsGoodsDao.findValid();
    }

    @Override
    public List<DsCategory> findValidDsCategory() {
        return dsCategoryDao.findValid();
    }
    public List<GoodsAttr> findGoodsAttrList(String goodId){
        return goodsAttrDao.findGoodsAttrList(goodId);
    }
}
