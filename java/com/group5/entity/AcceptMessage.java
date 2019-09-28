package com.group5.entity;

public class AcceptMessage {
    private Integer acceptmId;

    private String sendTime;

    private Integer userId;

    private Integer senduId;

    private Integer mark;

    private String context;

    public Integer getAcceptmId() {
        return acceptmId;
    }

    public void setAcceptmId(Integer acceptmId) {
        this.acceptmId = acceptmId;
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

    public Integer getSenduId() {
        return senduId;
    }

    public void setSenduId(Integer senduId) {
        this.senduId = senduId;
    }

    public Integer getMark() {
        return mark;
    }

    public void setMark(Integer mark) {
        this.mark = mark;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context == null ? null : context.trim();
    }
}