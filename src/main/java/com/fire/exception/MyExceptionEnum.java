package com.fire.exception;


import org.apache.commons.lang3.StringUtils;

/**
 * 异常类型枚举
 * @author chenqiang
 * @since 2020-10-15 15:42
 */
public enum MyExceptionEnum {
    /**
     *
     */
    REQUEST_PARAM_NOTNULL("A001", "请求参数不能为空"),

    SYSTEM_ERROR("-1", "系统异常"),

    DATASOURCE_ERROR("-2", "数据库异常"),

    OTHER_ERROR("-3", "未知异常"),

    REQUEST_PARAM_ERROR("-4","请求异常"),

    NO_SUCHHREO("-1001","无角色信息");


    private String code;
    private String msg;

    MyExceptionEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public static MyExceptionEnum getByCode(String code) {
        if (!StringUtils.isEmpty(code)) {
            MyExceptionEnum[] var1 = values();
            int var2 = var1.length;
            for (int var3 = 0; var3 < var2; ++var3) {
                MyExceptionEnum errorEnum = var1[var3];
                if (errorEnum.getCode().equals(code)) {
                    return errorEnum;
                }
            }
        }
        return null;
    }
}

