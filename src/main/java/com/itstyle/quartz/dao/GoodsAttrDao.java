package com.itstyle.quartz.dao;

import com.itstyle.quartz.entity.GoodsAttr;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by daixn on 2020/5/16 15:29
 */
public interface GoodsAttrDao {

    List<GoodsAttr> findGoodsAttrList(@Param("goodId")String goodId);
}
