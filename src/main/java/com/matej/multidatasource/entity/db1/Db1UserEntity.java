package com.matej.multidatasource.entity.db1;

import java.util.Date;

public class Db1UserEntity {
    /**
     * <pre>
     * 
     * 表字段 : tbDb1User.id
     * </pre>
     */
    private Long id;

    /**
     * <pre>
     * 手机号
     * 表字段 : tbDb1User.loginMobile
     * </pre>
     */
    private String loginMobile;

    /**
     * <pre>
     * 创建时间
     * 表字段 : tbDb1User.createTime
     * </pre>
     */
    private Date createTime;

    /**
     * <pre>
     * 
     * 表字段 : tbDb1User.modifiedTime
     * </pre>
     */
    private Date modifiedTime;

    /**
     * <pre>
     * 获取：
     * 表字段：tbDb1User.id
     * </pre>
     *
     * @return tbDb1User.id：
     */
    public Long getId() {
        return id;
    }

    /**
     * <pre>
     * 设置：
     * 表字段：tbDb1User.id
     * </pre>
     *
     * @param id
     *            tbDb1User.id：
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * <pre>
     * 获取：手机号
     * 表字段：tbDb1User.loginMobile
     * </pre>
     *
     * @return tbDb1User.loginMobile：手机号
     */
    public String getLoginMobile() {
        return loginMobile;
    }

    /**
     * <pre>
     * 设置：手机号
     * 表字段：tbDb1User.loginMobile
     * </pre>
     *
     * @param loginMobile
     *            tbDb1User.loginMobile：手机号
     */
    public void setLoginMobile(String loginMobile) {
        this.loginMobile = loginMobile == null ? null : loginMobile.trim();
    }

    /**
     * <pre>
     * 获取：创建时间
     * 表字段：tbDb1User.createTime
     * </pre>
     *
     * @return tbDb1User.createTime：创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * <pre>
     * 设置：创建时间
     * 表字段：tbDb1User.createTime
     * </pre>
     *
     * @param createTime
     *            tbDb1User.createTime：创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * <pre>
     * 获取：
     * 表字段：tbDb1User.modifiedTime
     * </pre>
     *
     * @return tbDb1User.modifiedTime：
     */
    public Date getModifiedTime() {
        return modifiedTime;
    }

    /**
     * <pre>
     * 设置：
     * 表字段：tbDb1User.modifiedTime
     * </pre>
     *
     * @param modifiedTime
     *            tbDb1User.modifiedTime：
     */
    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }
}