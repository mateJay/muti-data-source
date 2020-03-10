package com.matej.multidatasource.entity.db2;

import java.util.Date;

public class Db2UserEntity {
    /**
     * <pre>
     * 
     * 表字段 : tbDb2User.id
     * </pre>
     */
    private Long id;

    /**
     * <pre>
     * 手机号
     * 表字段 : tbDb2User.loginMobile
     * </pre>
     */
    private String loginMobile;

    /**
     * <pre>
     * 创建时间
     * 表字段 : tbDb2User.createTime
     * </pre>
     */
    private Date createTime;

    /**
     * <pre>
     * 
     * 表字段 : tbDb2User.modifiedTime
     * </pre>
     */
    private Date modifiedTime;

    /**
     * <pre>
     * 获取：
     * 表字段：tbDb2User.id
     * </pre>
     *
     * @return tbDb2User.id：
     */
    public Long getId() {
        return id;
    }

    /**
     * <pre>
     * 设置：
     * 表字段：tbDb2User.id
     * </pre>
     *
     * @param id
     *            tbDb2User.id：
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * <pre>
     * 获取：手机号
     * 表字段：tbDb2User.loginMobile
     * </pre>
     *
     * @return tbDb2User.loginMobile：手机号
     */
    public String getLoginMobile() {
        return loginMobile;
    }

    /**
     * <pre>
     * 设置：手机号
     * 表字段：tbDb2User.loginMobile
     * </pre>
     *
     * @param loginMobile
     *            tbDb2User.loginMobile：手机号
     */
    public void setLoginMobile(String loginMobile) {
        this.loginMobile = loginMobile == null ? null : loginMobile.trim();
    }

    /**
     * <pre>
     * 获取：创建时间
     * 表字段：tbDb2User.createTime
     * </pre>
     *
     * @return tbDb2User.createTime：创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * <pre>
     * 设置：创建时间
     * 表字段：tbDb2User.createTime
     * </pre>
     *
     * @param createTime
     *            tbDb2User.createTime：创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * <pre>
     * 获取：
     * 表字段：tbDb2User.modifiedTime
     * </pre>
     *
     * @return tbDb2User.modifiedTime：
     */
    public Date getModifiedTime() {
        return modifiedTime;
    }

    /**
     * <pre>
     * 设置：
     * 表字段：tbDb2User.modifiedTime
     * </pre>
     *
     * @param modifiedTime
     *            tbDb2User.modifiedTime：
     */
    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }
}