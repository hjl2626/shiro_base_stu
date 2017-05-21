package com.hjl.common.model.domain;

import java.io.Serializable;
import java.util.Date;

public class UUser implements Serializable {
    
    //0:禁止登录
    public static final Long _0 = 0L;
    //1:有效
    public static final Long _1 = 1L;
    private Long id;

    private String username;

    private String email;

    private String nickname;

    private String pswd;

    private Date createTime;

    private Date lastLoginTime;

    private Long status;
    
    public Long getId() {
        return id;
    }
    
    public UUser setId(Long id) {
        this.id = id;
        return this;
    }
    
    public String getUsername() {
        return username;
    }
    
    public UUser setUsername(String username) {
        this.username = username;
        return this;
    }
    
    public String getEmail() {
        return email;
    }
    
    public UUser setEmail(String email) {
        this.email = email;
        return this;
    }
    
    public String getNickname() {
        return nickname;
    }
    
    public UUser setNickname(String nickname) {
        this.nickname = nickname;
        return this;
    }
    
    public String getPswd() {
        return pswd;
    }
    
    public UUser setPswd(String pswd) {
        this.pswd = pswd;
        return this;
    }
    
    public Date getCreateTime() {
        return createTime;
    }
    
    public UUser setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }
    
    public Date getLastLoginTime() {
        return lastLoginTime;
    }
    
    public UUser setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
        return this;
    }
    
    public Long getStatus() {
        return status;
    }
    
    public UUser setStatus(Long status) {
        this.status = status;
        return this;
    }
    
    @Override
    public String toString() {
        return "UUser{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", nickname='" + nickname + '\'' +
                ", pswd='" + pswd + '\'' +
                ", createTime=" + createTime.getTime() +
                ", lastLoginTime=" + lastLoginTime +
                ", status=" + status +
                '}';
    }
}