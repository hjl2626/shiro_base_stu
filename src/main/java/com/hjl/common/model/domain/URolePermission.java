package com.hjl.common.model.domain;

public class URolePermission {
    private Long rid;

    private Long pid;
    
    public Long getRid() {
        return rid;
    }
    
    public URolePermission setRid(Long rid) {
        this.rid = rid;
        return this;
    }
    
    public Long getPid() {
        return pid;
    }
    
    public URolePermission setPid(Long pid) {
        this.pid = pid;
        return this;
    }
    
    @Override
    public String toString() {
        return "URolePermission{" +
                "rid=" + rid +
                ", pid=" + pid +
                '}';
    }
}