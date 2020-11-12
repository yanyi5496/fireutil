package com.fire.exception;

/**
 * 自定义异常
 * @author chenqiang
 * @since 2020-10-15 15:42
 */
public class MyException extends RuntimeException{

    private static final long serialVersionUID = -5110894147787469464L;
    /**
     * 错误码
     */
    private String errorCode;
    /**
     * 错误信息
     */
    private String errorMsg;

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public MyException(String errorCode, String errorMsg) {
        super(errorMsg);
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }

    public MyException(String errorCode, String errorMsg, String description) {
        super(errorMsg + description);
        this.errorCode = errorCode;
        this.errorMsg = errorMsg + description;
    }

    public MyException(MyExceptionEnum myExceptionEnum) {
        super(myExceptionEnum.getMsg());
        this.errorCode = myExceptionEnum.getCode();
        this.errorMsg = myExceptionEnum.getMsg();
    }

    public MyException(MyExceptionEnum myExceptionEnum, String description) {
        super(myExceptionEnum.getMsg() + description);
        this.errorCode = myExceptionEnum.getCode();
        this.errorMsg = myExceptionEnum.getMsg() + description;
    }
}

