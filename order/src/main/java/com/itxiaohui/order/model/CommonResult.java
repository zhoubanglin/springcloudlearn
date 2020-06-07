package com.itxiaohui.order.model;

public class CommonResult {
    private String rspCode;
    private String rspDesc;

    public CommonResult(String rspCode, String rspDesc) {
        this.rspCode = rspCode;
        this.rspDesc = rspDesc;
    }

    public String getRspCode() {
        return rspCode;
    }

    public void setRspCode(String rspCode) {
        this.rspCode = rspCode;
    }

    public String getRspDesc() {
        return rspDesc;
    }

    public void setRspDesc(String rspDesc) {
        this.rspDesc = rspDesc;
    }
}
