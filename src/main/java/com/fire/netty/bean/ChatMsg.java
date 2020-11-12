package com.fire.netty.bean;

import lombok.Data;

import java.io.Serializable;

/**
 * @author chenqiang
 * @since  2020-11-04 16:43
 */
@Data
public class ChatMsg implements Serializable {
    private static final long serialVersionUID = -5324072815953025207L;
    private Long id;
    private Long fromId;
    private Long destId;
    private MsgType msgType;
    private String msg;
    private String token;
    private Long ackId;
}
