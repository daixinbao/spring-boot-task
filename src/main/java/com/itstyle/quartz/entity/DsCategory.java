package com.itstyle.quartz.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (DsCategory)实体类
 *
 * @author makejava
 * @since 2020-05-14 20:59:27
 */
public class DsCategory implements Serializable {
    private static final long serialVersionUID = 216188928488633554L;
    
    private String id;
    /**
    * 分类名称
    */
    private String name;
    /**
    * 创建时间
    */
    private Date createTime;
    /**
    * 是否有效
    */
    private String valid;


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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getValid() {
        return valid;
    }

    public void setValid(String valid) {
        this.valid = valid;
    }

}