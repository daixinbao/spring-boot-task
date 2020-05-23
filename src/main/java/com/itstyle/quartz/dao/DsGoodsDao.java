package com.itstyle.quartz.dao;

import com.itstyle.quartz.entity.DsGoods;

import java.util.List;

/**
 * (DsCategory)表数据库访问层
 *
 * @author makejava
 * @since 2020-05-14 21:03:56
 */
public interface DsGoodsDao {
    List<DsGoods> findValid();
}