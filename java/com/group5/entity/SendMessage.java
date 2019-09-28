package com.group5.entity;

public class SendMessage {
    private Integer sendmId;

    private String sendTime;

    private Integer userId;

    private Integer acceptuId;

    private String context;

    public Integer getSendmId() {
        return sendmId;
    }

    public void setSendmId(Integer sendmId) {
        this.sendmId = sendmId;
    }

    public String getSendTime() {
        return sendTime;
    }

    public void setSendTime(String sendTime) {
        this.sendTime = sendTime == null ? null : sendTime.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getAcceptuId() {
        return acceptuId;
    }

    public void setAcceptuId(Integer acceptuId) {
        this.acceptuId = acceptuId;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context == null ? null : context.trim();
    }
}