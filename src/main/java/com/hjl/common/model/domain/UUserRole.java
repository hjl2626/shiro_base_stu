package com.hjl.common.model.domain;

public class UUserRole {
    private Long uid;

    private Long rid;
    
    public Long getUid() {
        return uid;
    }
    
    public UUserRole setUid(Long uid) {
        this.uid = uid;
        return this;
    }
    
    public Long getRid() {
        return rid;
    }
    
    public UUserRole setRid(Long rid) {
        this.rid = rid;
        return this;
    }
    
    @Override
    public String toString() {
        return "UUserRole{" +
                "uid=" + uid +
                ", rid=" + rid +
                '}';
    }
}