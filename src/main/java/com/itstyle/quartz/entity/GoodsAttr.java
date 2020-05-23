package com.itstyle.quartz.entity;

import java.io.Serializable;

/**
 * (GoodsAttr)实体类
 *
 * @author makejava
 * @since 2020-05-14 20:59:38
 */
public class GoodsAttr implements Serializable {
    private static final long serialVersionUID = -88797849905269147L;
    
    private String typeCode;
    
    private String typeName;
    
    private String attr;
    
    private String attrName;
    
    private String formType;


    public String getTypeCode() {
        return typeCode;
    }

    public void setTypeCode(String typeCode) {
        this.typeCode = typeCode;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getAttr() {
        return attr;
    }

    public void setAttr(String attr) {
        this.attr = attr;
    }

    public String getAttrName() {
        return attrName;
    }

    public void setAttrName(String attrName) {
        this.attrName = attrName;
    }

    public String getFormType() {
        return formType;
    }

    public void setFormType(String formType) {
        this.formType = formType;
    }

}