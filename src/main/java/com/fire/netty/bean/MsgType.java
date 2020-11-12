package com.fire.netty.bean;

/**
 * @author Chen
 */

public enum MsgType {
    /** 心跳消息*/
    HEARTBEAT,
    /** 上线*/
    ONLINE,
    /** 消息*/
    MSG,
    /** 已发送*/
    SENDED,
    /** 已读*/
    READ;


}