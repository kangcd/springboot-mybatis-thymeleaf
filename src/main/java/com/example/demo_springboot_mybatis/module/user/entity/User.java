package com.example.demo_springboot_mybatis.module.user.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "user_info")
public class User {
    /**
     * id
     */
    @Id
    private String id;

    /**
     * 名称
     */
    @Column(name = "user_name")
    private String userName;

    /**
     * 获取id
     *
     * @return id - id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置id
     *
     * @param id id
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * 获取名称
     *
     * @return user_name - 名称
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置名称
     *
     * @param userName 名称
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }
}