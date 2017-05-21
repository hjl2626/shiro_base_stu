package com.hjl.common.model.domain;

public class URole {
    private Long id;

    private String name;

    private String type;
    
    public Long getId() {
        return id;
    }
    
    public URole setId(Long id) {
        this.id = id;
        return this;
    }
    
    public String getName() {
        return name;
    }
    
    public URole setName(String name) {
        this.name = name;
        return this;
    }
    
    public String getType() {
        return type;
    }
    
    public URole setType(String type) {
        this.type = type;
        return this;
    }
    
    @Override
    public String toString() {
        return "URole{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}