package com.madhatters.androidbasic.domain;

import java.io.Serializable;

public class BaseResponse implements Serializable {
    private int code;
    private String status;
    private AyahModel data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public AyahModel getData() {
        return data;
    }

    public void setData(AyahModel data) {
        this.data = data;
    }
}
