package com.lichfeng.dongfangyunyin.common;


import lombok.Data;

public enum ResponseCode {
    SUCCESS("200", "成功"),
    UN_ERROR("500", "未知失败"),
    ILLEGAL_PARAMETER("0002", "非法参数"),
    INDEX_DUP("0003", "主键冲突");

    private String code;
    private String info;

    private ResponseCode(String code, String info){
        this.code = code;
        this.info = info;
    }

    public String getCode(){
        return this.code;
    }

    public  String getInfo(){
        return this.info;
    }



}


