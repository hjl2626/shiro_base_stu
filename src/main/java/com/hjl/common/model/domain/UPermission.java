package com.hjl.common.model.domain;

public class UPermission {
    private Long id;

    private String url;

    private String name;
    
    public Long getId() {
        return id;
    }
    
    public UPermission setId(Long id) {
        this.id = id;
        return this;
    }
    
    public String getUrl() {
        return url;
    }
    
    public UPermission setUrl(String url) {
        this.url = url;
        return this;
    }
    
    public String getName() {
        return name;
    }
    
    public UPermission setName(String name) {
        this.name = name;
        return this;
    }
    
    @Override
    public String toString() {
        return "UPermission{" +
                "id=" + id +
                ", url='" + url + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}