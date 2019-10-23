package com.data2.framework.web.entity;

import com.data2.common.utils.DateUtils;

import java.io.Serializable;
import java.util.Date;

/**
 * 基类
 */
public class BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**搜索值*/
    private String searchValue;
    /**创建者*/
    private String createBy;
    /**创建时间*/
    private Date createTime;
    /**修改者*/
    private String updateBy;
    /**修改时间*/
    private Date updateTime;
    /**备注*/
    private String remark;

    public String getSearchValue() {
        return searchValue;
    }

    public void setSearchValue(String searchValue) {
        this.searchValue = searchValue;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public String getCreateTime() {
        return createTime != null ? DateUtils.parseDateToStr(DateUtils.YYYY_MM_DD,createTime) : "";
    }

    public String getCreateDateTime() {
        return createTime != null ? DateUtils.parseDateToStr(DateUtils.YYYY_MM_DD_HH_MM_SS,createTime) : "";
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public String getUpdateTime() {
        return updateTime != null ? DateUtils.parseDateToStr(DateUtils.YYYY_MM_DD,updateTime) : "";
    }

    public String getUpdateDateTime() {
        return updateTime != null ? DateUtils.parseDateToStr(DateUtils.YYYY_MM_DD_HH_MM_SS,updateTime) : "";
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
