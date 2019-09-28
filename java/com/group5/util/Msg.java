package com.group5.util;

import java.util.HashMap;
import java.util.Map;

public class Msg {
    private int code;
    private String msg;
    private Map<String,Object> data=new HashMap<String,Object>();
    public static Msg success(){
        Msg message=new Msg();
        message.setCode(200);
        message.setMsg("处理成功");
        return message;

    }
    public static Msg fail() {
        Msg message = new Msg();
        message.setCode(404);
        message.setMsg("not found");
        return message;
    }
    public Msg add(String key, Object value) {
        this.data.put(key, value);
        return this;
    }
    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public Map<String, Object> getData() {
        return data;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setData(Map<String, Object> data) {
        this.data = data;
    }
}
