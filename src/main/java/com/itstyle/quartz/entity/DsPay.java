package com.itstyle.quartz.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (DsPay)实体类
 *
 * @author makejava
 * @since 2020-05-14 20:59:38
 */
public class DsPay implements Serializable {
    private static final long serialVersionUID = -38735486699862471L;
    
    private String id;
    
    private String name;
    /**
    * 订单ID
    */
    private String orderId;
    /**
    * 开始时间
    */
    private Date tartTime;
    /**
    * 结束时间
    */
    private Date endTime;
    /**
    * 支付状态（0：成功 1：失败）
    */
    private String status;
    /**
    * 支付返回信息
    */
    private String message;
    /**
    * 支付方式
    */
    private String mode;


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

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Date getTartTime() {
        return tartTime;
    }

    public void setTartTime(Date tartTime) {
        this.tartTime = tartTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

}