package com.zt.tenant.enums;

/**
 * orm类型
 */
public enum Orm {

    JPA("jpa"),
    MyBatis("mybatis"),
    ;
    private String code  ;

    Orm(String code){
        this.code = code ;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
