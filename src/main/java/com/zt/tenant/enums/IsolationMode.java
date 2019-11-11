package com.zt.tenant.enums;


/**
 * 隔离方式
 */
public enum IsolationMode {

    /**
     * 数据库隔离
     */
    DB("database"),
    /**
     * 共享数据库,schema隔离
     */
    SCHEMA("schema"),
    /**
     * 共享schema , 租户id隔离
     */
    ID("id"),
    ;
    private String code ;

    IsolationMode(String code){
        this.code = code ;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
