package com.liu.liuaicodemother.model.vo;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 对话历史视图对象
 *
 * @author <a href="https://github.com/liyupi">程序员鱼皮</a>
 */
@Data
public class ChatHistoryVO implements Serializable {

    /**
     * id
     */
    private Long id;

    /**
     * 消息内容
     */
    private String message;

    /**
     * 消息类型：user/ai/error
     */
    private String messageType;

    /**
     * 错误信息（当消息类型为error时使用）
     */
    private String errorMessage;

    /**
     * 应用id
     */
    private Long appId;

    /**
     * 创建用户id
     */
    private Long userId;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;

    /**
     * 创建用户信息
     */
    private UserVO user;

    /**
     * 应用信息
     */
    private AppVO app;

    private static final long serialVersionUID = 1L;
}
