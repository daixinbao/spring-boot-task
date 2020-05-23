package com.itstyle.quartz.entity;

import java.io.Serializable;

/**
 * (DsOrder)实体类
 *
 * @author makejava
 * @since 2020-05-14 20:59:38
 */
public class DsOrder implements Serializable {
    private static final long serialVersionUID = -62944866091471240L;
    
    private String id;
    /**
    * 订单名称
    */
    private String name;
    /**
    * 商品ID
    */
    private String goodsId;
    /**
    * 商品数量
    */
    private Integer goodsCount;
    
    private Double totalPrice;
    /**
    * 订单处理进度状态
    */
    private String dealStatus;
    /**
    * 物品账号
    */
    private String goodsAccount;
    /**
    * 物品密码
    */
    private String goodsPwd;
    /**
    * 物品链接
    */
    private String goodsLink;
    /**
    * 支付状态（0：未支付 ，1：已支付）
    */
    private String payStatus;


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

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getGoodsCount() {
        return goodsCount;
    }

    public void setGoodsCount(Integer goodsCount) {
        this.goodsCount = goodsCount;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getDealStatus() {
        return dealStatus;
    }

    public void setDealStatus(String dealStatus) {
        this.dealStatus = dealStatus;
    }

    public String getGoodsAccount() {
        return goodsAccount;
    }

    public void setGoodsAccount(String goodsAccount) {
        this.goodsAccount = goodsAccount;
    }

    public String getGoodsPwd() {
        return goodsPwd;
    }

    public void setGoodsPwd(String goodsPwd) {
        this.goodsPwd = goodsPwd;
    }

    public String getGoodsLink() {
        return goodsLink;
    }

    public void setGoodsLink(String goodsLink) {
        this.goodsLink = goodsLink;
    }

    public String getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(String payStatus) {
        this.payStatus = payStatus;
    }

}