package com.itstyle.quartz.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (DsGoods)实体类
 *
 * @author makejava
 * @since 2020-05-14 20:59:30
 */
public class DsGoods implements Serializable {
    private static final long serialVersionUID = -38486154557332390L;

    private String id;
    /**
    * 分类名称
    */
    private String name;
    /**
    * 分类ID
    */
    private String categoryId;

    /**
    * 是否有效
    */
    private String valid;
    /**
    * 单位
    */
    private String unit;
    /**
    * 单价
    */
    private Double unitPrice;
    /**
    * 单位数量
    */
    private Integer unitCount;
    /**
    * 创建时间
    */
    private Date createTime;
    /**
     * 描述
     */
    private String desction;
    
    private String type;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getValid() {
        return valid;
    }

    public void setValid(String valid) {
        this.valid = valid;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Integer getUnitCount() {
        return unitCount;
    }

    public void setUnitCount(Integer unitCount) {
        this.unitCount = unitCount;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDesction() {
        return desction;
    }

    public void setDesction(String desction) {
        this.desction = desction;
    }
}